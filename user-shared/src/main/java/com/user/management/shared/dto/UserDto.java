package com.user.management.shared.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.UUID;


@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(makeFinal = false , level = AccessLevel.PRIVATE)
public class UserDto {

    UUID id;
    @NotBlank
    String username;
    String fatherName;
    String motherName;
    String password;
}
