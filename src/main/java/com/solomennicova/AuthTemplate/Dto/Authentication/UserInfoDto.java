package com.solomennicova.AuthTemplate.Dto.Authentication;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class UserInfoDto {

    @NotEmpty(message = "IDs не должно быть пустым")
    private Long id;

    @NotEmpty(message = "Имя не должно быть пустым")
    @Size(min = 2, max = 15, message = "Имя должно быть от 2 до 25 символов длиной")
    private String username;

    @NotEmpty(message = "Пароль не должно быть пустым")
    @Size(min = 2, max = 15, message = "Пароль должен быть от 2 до 25 символов длиной")
    private String password;

    private Set<String> roles = new HashSet<>();
}
