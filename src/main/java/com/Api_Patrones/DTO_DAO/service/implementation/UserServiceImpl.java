package com.Api_Patrones.DTO_DAO.service.implementation;

import com.Api_Patrones.DTO_DAO.presentation.dto.UserDTO;
import com.Api_Patrones.DTO_DAO.service.interfaces.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Override
    public List<UserDTO> findAll() {
        return null;
    }

    @Override
    public UserDTO findById(Long id) {
        return null;
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO updaUserDto(UserDTO userDTO, Long id) {
        return null;
    }

    @Override
    public String deleteUser(Long id) {
        return null;
    }
}
