package com.data.product.ServiceImpl;

import com.data.product.DTO.Request.ProductRequest;
import com.data.product.Entity.Product;
import com.data.product.Repository.ProductRepository;
import com.data.product.Serivce.ProductService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void addNewProduct(ProductRequest productRequest) {
        Product product = new Product();
        product.setProduct_name(productRequest.getProduct_name());
        product.setImage(productRequest.getImage());
        product.setPrice(productRequest.getPrice());
        product.setManufacture(productRequest.getManufacture());
        product.setDetails(productRequest.getDetails());
        productRepository.save(product);
    }

    @Override
    @Transactional
    @Modifying
    public void editProduct(Long productId, ProductRequest productRequest) {

        Product product = productRepository.findByProductId(productId);

        product.setProduct_name(productRequest.getProduct_name());
        product.setImage(productRequest.getImage());
        product.setPrice(productRequest.getPrice());
        product.setManufacture(productRequest.getManufacture());
        product.setDetails(productRequest.getDetails());

//        Date date =new Date();
        product.setUpdated_at(new Date());
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long productId) {
        Date date=new Date();
        productRepository.deleteProductById(productId, date);
    }


    @Override
    public void getProduct(ProductRequest productRequest) {
       List<Product> allProducts=productRepository.findAllProduct();
    }

    @Override
    public void getProductById(Long productId) {
        productRepository.findByProductId(productId);
    }


}
