package com.javadevjournal.customer.data;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class CustomerModel {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true,nullable = false)
    private String email;
    private String firstName;
    private String lastName;

    
}
