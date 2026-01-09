package com.user.management.http.api;


import com.user.management.shared.dto.UserDto;
import com.user.management.http.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserApi {

    @Autowired
    UserService userService;



    @GetMapping
    public ResponseEntity<UserDto> getUser(@RequestParam UUID id) {

        UserDto userDto = userService.findUser(id);

        if (userDto != null)
            return ResponseEntity.ok(userDto);

        return ResponseEntity.notFound().build();
    }


    @PostMapping
    public ResponseEntity<UserDto> saveUser(@Valid @RequestBody UserDto userDto) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(userService.save(userDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDto> updateUser(
            @PathVariable UUID id,
            @RequestBody @Valid UserDto userDto) {

        UserDto updatedUser = userService.updateUser(id, userDto);

        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable UUID id) {
          userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
