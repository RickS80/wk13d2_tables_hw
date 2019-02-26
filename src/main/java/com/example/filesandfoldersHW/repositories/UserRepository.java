package com.example.filesandfoldersHW.repositories;

import com.example.filesandfoldersHW.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
