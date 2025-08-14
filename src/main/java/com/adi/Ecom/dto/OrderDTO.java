package com.adi.Ecom.dto;

import java.util.Date;
import java.util.List;

public class OrderDTO {

    private Long id;

    private double tolatAmount;

    private String status;

    private String username;

    private Date orderdate;

    private String email;

   private List<OrderItemDTO>orderItems;

    public OrderDTO(Long id, double tolatAmount, String status, Date orderdate,String username,String email, List<OrderItemDTO> orderItems) {
        this.id = id;
        this.tolatAmount = tolatAmount;
        this.status = status;
        this.username=username;
        this.email=email;
        this.orderdate = orderdate;
        this.orderItems = orderItems;
    }

    public OrderDTO(Long id, double totalAmount, String status, Date orderDate, List<OrderItemDTO> orderItems) {

        this.id=id;
        this.tolatAmount=totalAmount;
        this.status=status;
        this.orderdate=orderDate;
        this.orderItems=orderItems;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getTolatAmount() {
        return tolatAmount;
    }

    public void setTolatAmount(double tolatAmount) {
        this.tolatAmount = tolatAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<OrderItemDTO> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItemDTO> orderItems) {
        this.orderItems = orderItems;
    }
}
