package com.niit.c13_s1_pc.service;

import com.niit.c13_s1_pc.domain.Product;

import java.util.List;

public interface IProductService {

    public Product addProduct(Product product);
    public List<Product>getAllProduct();
    public String deleteProduct(int id);
    public Product getAllProductById(int productId);
}
