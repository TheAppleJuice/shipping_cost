package se.lexicon.shipping_cost.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Box {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name="UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(nullable = false, updatable = false)
    private String id;
    @Column(nullable=false, length = 200)
    private String name;
    @Column(nullable=false, length = 200)
    private String country;
    @Column(nullable=false, length = 200)
    private String type;
    @Column(nullable=false)
    private double cost;
    @Column(nullable=false)
    private double weight;
    @Column(nullable=false, length = 200)
    private String weightType;
    @CreationTimestamp
    @Column(nullable = false, columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP")
    private LocalDateTime createDate;
    @Column(nullable = false, columnDefinition = "tinyint(1) default 1")
    private boolean status;

    public Box() {
    }


    public Box(String name, String country, String type, double cost, double weight, String weightType, LocalDateTime createDate, boolean status) {
        this.name = name;
        this.country = country;
        this.type = type;
        this.cost = cost;
        this.weight = weight;
        this.weightType = weightType;
        this.createDate = createDate;
        this.status = status;
    }

    public Box(String id, String name, String country, String type, double cost, double weight, String weightType, LocalDateTime createDate, boolean status) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.type = type;
        this.cost = cost;
        this.weight = weight;
        this.weightType = weightType;
        this.createDate = createDate;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWeightType() {
        return weightType;
    }

    public void setWeightType(String weightType) {
        this.weightType = weightType;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
