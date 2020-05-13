package com.cool.productmanagement.jpa.repo;

import com.cool.productmanagement.jpa.model.ProductTransaction;
import org.springframework.data.repository.CrudRepository;

public interface ProductTransactionRepository extends CrudRepository<ProductTransaction,Long> {
}
