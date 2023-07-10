package com.nimisha.learn.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Employee {
    @NotNull
    private String employeeName;
    private int employeeID;
}
