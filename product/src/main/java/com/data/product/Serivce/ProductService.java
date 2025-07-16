package com.data.product.Serivce;

import com.data.product.DTO.Request.ProductRequest;

public interface ProductService {
    void addNewProduct(ProductRequest productRequest);

    void editProduct(Long productId, ProductRequest productRequest);

    void deleteProduct(Long productId);

    void getProduct(ProductRequest productRequest);

    void getProductById(Long productId);
}
