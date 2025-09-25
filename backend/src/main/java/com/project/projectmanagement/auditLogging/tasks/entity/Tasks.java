package com.project.projectmanagement.auditLogging.tasks.entity;

import com.project.projectmanagement.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "tasks")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private String id;

    @Column(name = "taskName")
    private String taskName;

    @Column(name = "active")
    private boolean active;

    @Enumerated(EnumType.STRING)
    private Status status;
}

