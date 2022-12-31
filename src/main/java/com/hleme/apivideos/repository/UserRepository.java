package com.hleme.apivideos.repository;

import com.hleme.apivideos.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
