package com.samchenyu.MySQLStarter.repository;

import com.samchenyu.MySQLStarter.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/*
    * This is a repository interface that extends JpaRepository.
    * The repository is used to interact with the database.
    * It handles all the CRUD operations and processes the queries.
 */

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
