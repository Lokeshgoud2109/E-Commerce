package com.telusko.SpringEcom.repo;

import com.telusko.SpringEcom.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface OrderRepo extends JpaRepository<Orders,Integer> {
    Optional<Orders> findByOrderId(String orderId);
}
