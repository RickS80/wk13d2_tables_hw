package com.example.filesandfoldersHW.repositories;

import com.example.filesandfoldersHW.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
