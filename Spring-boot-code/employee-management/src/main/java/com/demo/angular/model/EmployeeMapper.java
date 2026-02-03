package com.demo.angular.model;


import com.demo.angular.entity.Employee;
import com.demo.angular.requestDTO.EmployeeRequest;
import com.demo.angular.responseDTO.EmployeeResponse;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

    private final ModelMapper modelMapper;
    
    

    public EmployeeMapper(ModelMapper modelMapper) {
		super();
		this.modelMapper = modelMapper;
	}

	public Employee mapToEntity(EmployeeRequest request) {
        return modelMapper.map(request, Employee.class);
    }

    public EmployeeResponse mapToDto(Employee employee) {
        return modelMapper.map(employee, EmployeeResponse.class);
    }
}
