package com.javadevjournal.product.data;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class ProductModel {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String code;
    private String name;
    private double price;


   
}