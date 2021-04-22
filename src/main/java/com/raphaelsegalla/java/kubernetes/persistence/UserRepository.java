package com.raphaelsegalla.java.kubernetes.persistence;

import org.springframework.data.repository.CrudRepository;

import com.raphaelsegalla.java.kubernetes.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}

