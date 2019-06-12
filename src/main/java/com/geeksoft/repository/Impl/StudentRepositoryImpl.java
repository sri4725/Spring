package com.geeksoft.repository.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.geeksoft.model.Orders;
import com.geeksoft.model.Student;
import com.geeksoft.repository.StudentRepository;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Student getStudent(String id) {
		Student std = null;
		if ("1234".equalsIgnoreCase(id)) {
			std = new Student();
			std.setAge(25);
			std.setFirstName("Reshma");
			std.setLastName("Kakumanu");
			std.setId(Integer.parseInt(id));
			std.setDob(new Date());
		}
		
		//getOrders();

		return std;
	}
	
	
	   public void getOrders() {
		List<Map<String, Object>> rows = jdbcTemplate.queryForList("select * from orders");
		for(Map row : rows) {
			System.out.println(row);
			
		}
	}
	


}
