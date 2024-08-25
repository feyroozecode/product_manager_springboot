package com.ibr.demo.models;

/**
 * The Product class represents a product entity in the database.
 * This class is used to map the product entity to the database table.
 */

/**
 * jakarta.persistence.*: Provides JPA annotations for ORM (Object-Relational Mapping).
 * jakarta.validation.constraints.NotEmpty: Provides validation constraints.
 * lombok.*: Provides annotations to reduce boilerplate code (e.g., getters, setters, constructors).
 */

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

/**
 * @Data: Lombok annotation to generate getters, setters, toString, equals, and hashCode methods.
 * @Entity: Specifies that the class is an entity and is mapped to a database table.
 * @Builder: Lombok annotation to implement the builder pattern.
 * @NoArgsConstructor: Lombok annotation to generate a no-argument constructor.
 * @AllArgsConstructor: Lombok annotation to generate a constructor with all fields.
 * @Table(name = "product"): Specifies the table name in the database.
 * @EqualsAndHashCode(callSuper = false): Lombok annotation to generate equals and hashCode methods without calling the superclass methods.
 */
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
@EqualsAndHashCode(callSuper = false)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "Name can't be blank")
    @Column(unique = true)
    private String name;

    private long quantity;
    private double price;
}
