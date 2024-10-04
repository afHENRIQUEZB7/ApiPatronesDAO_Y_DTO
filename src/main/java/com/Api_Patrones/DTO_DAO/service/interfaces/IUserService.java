package com.Api_Patrones.DTO_DAO.service.interfaces;

import com.Api_Patrones.DTO_DAO.presentation.dto.UserDTO;

import java.util.List;

public interface IUserService {
    List<UserDTO> findAll();
    UserDTO findById(Long id);

    UserDTO createUser(UserDTO userDTO);

    UserDTO updaUserDto(UserDTO userDTO, Long id);

    String deleteUser(Long id);

}
