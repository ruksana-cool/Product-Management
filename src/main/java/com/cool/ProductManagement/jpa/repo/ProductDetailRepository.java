package com.cool.ProductManagement.jpa.repo;

import com.cool.ProductManagement.jpa.model.ProductDetail;
import org.springframework.data.repository.CrudRepository;

public interface ProductDetailRepository extends CrudRepository<ProductDetail,Long> {

}
