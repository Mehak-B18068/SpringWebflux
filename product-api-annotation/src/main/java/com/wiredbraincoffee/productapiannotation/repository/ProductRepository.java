package com.wiredbraincoffee.productapiannotation.repository;

import com.wiredbraincoffee.productapiannotation.model.Product;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductRepository extends ReactiveCrudRepository<Product,String> {

}
