package com.samchenyu.MySQLStarter.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/*
    * This is a model class that represents the Student entity.
    * It defines how a Java object will be mapped to the STUDENT table in the database
    * Each field in the class corresponds to a column in the table.
 */



@Entity
@Table(name = "STUDENT")
@Data
public class Student {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "MARK")
    private int mark;

    @Column(name = "NAME")
    private String name;
}
