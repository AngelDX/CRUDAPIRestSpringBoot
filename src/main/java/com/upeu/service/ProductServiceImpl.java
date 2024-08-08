package com.upeu.service;

import com.upeu.entity.Product;
import com.upeu.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> listAll() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product addProduct(Product item) {
        item.setCreateAt(new Date());
        return productRepository.save(item);
    }

    @Override
    public Product editProduct(Product item) {
        Product itemDB=getProduct(item.getId());
        if(itemDB==null){
            return null;
        }
        itemDB.setName(item.getName());
        itemDB.setDescription(item.getDescription());
        itemDB.setPrice(item.getPrice());
        itemDB.setCategory(item.getCategory());
        return productRepository.save(item);
    }

    @Override
    public void delProduct(Long id) {
        productRepository.deleteById(id);
    }
}
