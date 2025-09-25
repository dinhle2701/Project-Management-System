package com.project.projectmanagement.auditLogging.tasks.repository;

import com.project.projectmanagement.auditLogging.tasks.entity.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Tasks, String> {
}
