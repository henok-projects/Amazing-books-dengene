package com.customer.customer.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerId", nullable = false)
    private Long customerId;

    @Column(name = "isbn")
    private Long isbn;

    @Column(name = "no_oF_Copies")
    private Integer nooFCopies;
}
