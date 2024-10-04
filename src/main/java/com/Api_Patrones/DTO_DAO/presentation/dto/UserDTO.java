package com.Api_Patrones.DTO_DAO.presentation.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;
    private String name;

    private String LastName;

    private String email;

    private byte age;
}
