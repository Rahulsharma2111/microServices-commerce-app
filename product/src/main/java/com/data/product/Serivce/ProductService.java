package com.data.product.Serivce;

import com.data.product.DTO.Request.ProductRequest;
import com.data.product.Entity.Product;

import java.util.List;

public interface ProductService {
    void addNewProduct(ProductRequest productRequest);

    void editProduct(Long productId, ProductRequest productRequest);

    void deleteProduct(Long productId);

    List<Product> getProduct();

    void getProductById(Long productId);
}
