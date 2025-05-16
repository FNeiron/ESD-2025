package com.company.musicshop.entity;

import com.company.planner.Status;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "ORDER_", indexes = {
        @Index(name = "IDX_ORDER__CUSTOMER", columnList = "CUSTOMER_ID")
})
@Entity(name = "Order_")
public class Order {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "ORDER_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date orderDate;

    @Column(name = "START_ADDRESS", nullable = false)
    @NotNull
    private String startAddress;

    @Column(name = "END_ADDRESS", nullable = false)
    @NotNull
    private String endAddress;

    @Column(name = "STATUS", nullable = false)
    @NotNull
    private String status;

    @Column(name = "ORDERSUM", nullable = false)
    @NotNull
    private Integer orderSum;

    @NotNull
    @JoinColumn(name = "CUSTOMER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    @NotNull
    @JoinColumn(name = "TAXI_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Taxi taxi;

    public Integer getOrderSum() {
        return orderSum;
    }

    public void setOrderSum(Integer orderSum) {
        this.orderSum = orderSum;
    }

    public Taxi getTaxi() {
        return taxi;
    }

    public void setTaxi(Taxi taxi) {
        this.taxi = taxi;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getStartAddress() {return startAddress; }

    public void setStartAddress(String startAddress) { this.startAddress = startAddress; }

    public String getEndAddress() {return endAddress; }

    public void setEndAddress(String endAddress) { this.endAddress = endAddress; }

    public Status getStatus() {
        return status == null ? null : Status.fromId(status);
    }

    public void setStatus(Status status) {
        this.status = status == null ? null : status.getId();
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @InstanceName
    @DependsOnProperties({"status"})
    public String getInstanceName() {
        return String.format("%s", status);
    }
}