package com.niit.c13_s1_pc.service;

import com.niit.c13_s1_pc.domain.Product;
import com.niit.c13_s1_pc.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    IProductRepository productRepository;

    public ProductServiceImpl(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product addProduct(Product product) {
        if (productRepository.findById(product.getProductId()).isEmpty()){
            return  productRepository.save(product);
        }
        return null;
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public String deleteProduct(int id) {
        if (productRepository.findById(id).isEmpty()){
            return "Product does not exists";
        }
        productRepository.deleteById(id);
        return "Product deleted successfully";
    }

    @Override
    public Product getAllProductById(int id) {
        return productRepository.findById(id).get();
    }
}
