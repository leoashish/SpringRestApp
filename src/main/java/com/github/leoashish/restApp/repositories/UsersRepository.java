package com.github.leoashish.restApp.repositories;

import com.github.leoashish.restApp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Integer> {
}
