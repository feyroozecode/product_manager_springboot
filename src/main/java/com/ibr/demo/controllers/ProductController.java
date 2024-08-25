package com.ibr.demo.controllers;

import com.ibr.demo.models.Product;
import com.ibr.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The ProductController class handles HTTP requests for the Product entity.
 * It provides endpoints for creating, retrieving, updating, and deleting products.
 */
@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    private final ProductService productService;

    /**
     * Constructor for ProductController.
     *
     * @param productService the service to handle product operations
     */
    @Autowired
    ProductController(ProductService productService) {
        this.productService = productService;
    }

    /**
     * Retrieves all products.
     *
     * @return a ResponseEntity containing a list of all products
     */
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    /**
     * Creates a new product.
     *
     * @param product the product to create
     * @return a ResponseEntity containing the created product
     */
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product createdProduct = productService.createProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdProduct);
    }

    /**
     * Retrieves a product by its ID.
     *
     * @param id the ID of the product to retrieve
     * @return a ResponseEntity containing the retrieved product
     */
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Product product = productService.getProductById(id);
        return ResponseEntity.ok(product);
    }

    /**
     * Updates an existing product.
     *
     * @param id the ID of the product to update
     * @param productDetails the new details of the product
     * @return a ResponseEntity containing the updated product
     */
    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
        Product updatedProduct = productService.updateProduct(productDetails.getId(), productDetails);
        return ResponseEntity.ok(updatedProduct);
    }

    /**
     * Deletes a product by its ID.
     *
     * @param id the ID of the product to delete
     * @return a ResponseEntity with no content
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }
}