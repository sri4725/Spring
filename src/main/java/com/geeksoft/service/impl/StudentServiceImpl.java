package com.geeksoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.geeksoft.model.Orders;
import com.geeksoft.model.Student;
import com.geeksoft.repository.OrderRepository;
import com.geeksoft.repository.StudentRepository;
import com.geeksoft.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Student getStudent(String id) {
		if(StringUtils.isEmpty(id.trim())) {
			throw new NullPointerException("Student Id is null. throwing exception in StudentServiceImpl"); 
		}
		
			List<Orders> orders = orderRepository.findAll();
			for(Orders order : orders) {
				System.out.println("order Numbers is :"  + order.getOrderNo());
			}
		// TODO Auto-generated method stub
		return studentRepository.getStudent(id);
	}

}
