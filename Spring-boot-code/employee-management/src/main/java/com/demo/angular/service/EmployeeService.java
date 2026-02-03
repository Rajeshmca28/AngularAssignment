package com.demo.angular.service;


import java.util.List;

import com.demo.angular.requestDTO.EmployeeRequest;
import com.demo.angular.responseDTO.ApiResponse;
import com.demo.angular.responseDTO.EmployeeResponse;

public interface EmployeeService {

    ApiResponse<EmployeeResponse> createEmployee(EmployeeRequest request);

    ApiResponse<List<EmployeeResponse>> getAllEmployees();

    ApiResponse<List<EmployeeResponse>> searchEmployees(String search);



}
