package com.nimisha.learn.request;

import com.nimisha.learn.model.EmployeeModel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class EmployeeRequest {
    private List<EmployeeModel> employeeList;
}
