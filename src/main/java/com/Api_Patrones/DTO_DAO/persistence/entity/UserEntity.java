package com.Api_Patrones.DTO_DAO.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//anotaciones de lombook
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

//anotaciones de JPA
@Entity
@Table(name = "users")
public class UserEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Column(name = "last_name")

    private String lastName;

    private String email;

    private byte age;


}
