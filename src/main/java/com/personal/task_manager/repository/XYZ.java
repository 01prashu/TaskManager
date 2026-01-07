package com.personal.task_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personal.task_manager.entity.Task;

@Repository
public interface XYZ extends JpaRepository<Task,Long> {

}
