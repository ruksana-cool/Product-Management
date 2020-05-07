package com.cool.ProductManagement.jpa.service;

import com.cool.ProductManagement.jpa.repo.ProductTransactionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductTransactionService {
    private static final Logger log = LoggerFactory.getLogger(ProductTransactionService.class);

    @Autowired
    ProductTransactionRepository productTransactionRepository;

}
