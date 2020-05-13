package com.cool.productmanagement.jpa.repo;

import com.cool.productmanagement.jpa.model.ProductAttribute;
import org.springframework.data.repository.CrudRepository;

public interface ProductAttributeRepository extends CrudRepository<ProductAttribute,Long> {
}
