package com.cool.ProductManagement.jpa.repo;

import com.cool.ProductManagement.jpa.model.ProductAttribute;
import org.springframework.data.repository.CrudRepository;

public interface ProductAttributeRepository extends CrudRepository<ProductAttribute,Long> {
}
