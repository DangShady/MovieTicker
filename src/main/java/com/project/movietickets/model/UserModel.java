package com.project.movietickets.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

import com.project.movietickets.entity.UserEntity;

@Data
@AllArgsConstructor
public class UserModel {
    private int id;
    private String username;
    private String password;
    private String email;
    private String fullName;
    private boolean gender;
    private LocalDate dateOfBirth;
    private Role role;

    public static UserModel fromEntity(UserEntity entity) {
        return new UserModel(
                entity.getId(),
                entity.getUsername(),
                entity.getPassword(),
                entity.getEmail(),
                entity.getFullName(),
                entity.isGender(),
                entity.getDateOfBirth(),
                entity.getRole()
        );
    }
}
