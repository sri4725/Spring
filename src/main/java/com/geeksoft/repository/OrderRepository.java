package com.geeksoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geeksoft.model.Orders;
@Repository
public interface OrderRepository extends JpaRepository<Orders,String>{

}
