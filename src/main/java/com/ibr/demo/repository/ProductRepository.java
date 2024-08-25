package com.ibr.demo.repository;

import com.ibr.demo.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/// The ProductRepository interface extends the JpaRepository interface, which is a part of the Spring Data JPA library.
/// The JpaRepository interface provides methods for performing CRUD operations on the Product entity.
/// method like save, findAll, findById, deleteById
/// wich are suited for carrying out common database operations on the Product entity
/// The @Param Long type parameter specifies the type of the primary key of the Product entity.
public interface ProductRepository extends JpaRepository<Product, Long> {
}
