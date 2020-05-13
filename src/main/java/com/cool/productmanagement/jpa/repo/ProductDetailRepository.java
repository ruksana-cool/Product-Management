package com.cool.productmanagement.jpa.repo;

import com.cool.productmanagement.jpa.model.ProductDetail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDetailRepository extends CrudRepository<ProductDetail,Long> {

}
