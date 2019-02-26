package com.example.filesandfoldersHW.repositories;

import com.example.filesandfoldersHW.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
