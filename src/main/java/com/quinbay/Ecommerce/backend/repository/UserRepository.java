package com.quinbay.Ecommerce.backend.repository;

import com.quinbay.Ecommerce.backend.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,Long> {
}
