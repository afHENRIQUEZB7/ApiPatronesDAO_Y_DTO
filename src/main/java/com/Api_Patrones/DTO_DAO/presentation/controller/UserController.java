package com.Api_Patrones.DTO_DAO.presentation.controller;


import com.Api_Patrones.DTO_DAO.presentation.dto.UserDTO;
import com.Api_Patrones.DTO_DAO.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    // Buscar todos los usuarios
    @GetMapping("/findAll")
    public ResponseEntity<List<UserDTO>> findAll(){
        return new ResponseEntity<>((this.userService.findAll()), HttpStatus.OK);
    }

    // Buscar por un id
    @GetMapping("/find/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id){
        return new ResponseEntity<>((this.userService.findById(id)), HttpStatus.OK);
    }

    // Metodo para crear un usuario
    @PostMapping("/create")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO){
        return new ResponseEntity<>(this.userService.createUser(userDTO), HttpStatus.CREATED);
    }

    // Update User
    @PutMapping("/update")
    public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO userDTO, @PathVariable Long id){
        return new ResponseEntity<>(this.userService.updaUserDto(userDTO,id), HttpStatus.OK );
    }

    // Delete User - Usuario Eliminado
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id ){
        return new ResponseEntity<>(this.userService.deleteUser(id), HttpStatus.NO_CONTENT);
    }

}
