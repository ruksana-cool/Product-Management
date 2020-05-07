package com.cool.ProductManagement.jpa.repo;

import com.cool.ProductManagement.jpa.model.ProductTransaction;
import org.springframework.data.repository.CrudRepository;

public interface ProductTransactionRepository extends CrudRepository<ProductTransaction,Long> {
}
