package com.Api_Patrones.DTO_DAO.persistence.dao.implementation;

import com.Api_Patrones.DTO_DAO.persistence.dao.interfaces.IUserDAO;
import com.Api_Patrones.DTO_DAO.persistence.entity.UserEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Repository
public class UserDaoImpl implements IUserDAO {

    @Autowired
    private IUserDAO iUserDAO;

    @Override
    public List<UserEntity> findAll() {
        ModelMapper modelMapper = new ModelMapper();

        return this.iUserDAO.findAll()
                .stream()
                .map(entity -> modelMapper.map(entity, UserEntity.class))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<UserEntity> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public UserEntity saveUser(UserEntity userEntity) {
        return null;
    }

    @Override
    public UserEntity updateUser(UserEntity userEntity) {
        return null;
    }

    @Override
    public UserEntity deleteUser(UserEntity userEntity) {
        return null;
    }
}
