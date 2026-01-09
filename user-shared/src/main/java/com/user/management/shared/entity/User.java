package com.user.management.shared.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.UUID;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(makeFinal = false, level = AccessLevel.PRIVATE)
public class User {


    @Id
    @GeneratedValue
    UUID id;
    String username;
    String password;
    String fatherName;
    String motherName;

}