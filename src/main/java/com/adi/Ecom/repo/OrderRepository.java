package com.adi.Ecom.repo;

import com.adi.Ecom.model.Orders;
import com.adi.Ecom.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Orders,Long> {

    @Query("SELECT o from Orders o JOIN FETCH o.user")
   List<Orders> findAllOrdersWithUsers();

    List<Orders> findByUser(User user);
}
