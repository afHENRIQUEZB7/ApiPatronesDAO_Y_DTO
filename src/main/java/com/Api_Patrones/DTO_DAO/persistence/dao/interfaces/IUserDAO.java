package com.Api_Patrones.DTO_DAO.persistence.dao.interfaces;

import com.Api_Patrones.DTO_DAO.persistence.entity.UserEntity;
import com.Api_Patrones.DTO_DAO.presentation.dto.UserDTO;

import java.util.List;
import java.util.Optional;

public interface IUserDAO {
    List<UserEntity> findAll();

    Optional<UserEntity> findById(Long id);

    UserEntity saveUser(UserEntity userEntity);

    UserEntity updateUser(UserEntity userEntity);
    UserEntity deleteUser(UserEntity userEntity);


}
