package com.SpringBoot_SonarQube.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot_SonarQube.Model.Task;

public interface TaskRepo extends JpaRepository<Task, Long> {

}
