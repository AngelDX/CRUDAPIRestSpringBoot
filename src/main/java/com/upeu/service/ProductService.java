package com.upeu.service;

import com.upeu.entity.Product;
import java.util.List;

public interface ProductService {
    public List<Product> listAll();
    public Product getProduct(Long id);
    public Product addProduct(Product item);
    public Product editProduct(Product item);
    public void delProduct(Long id);
}
