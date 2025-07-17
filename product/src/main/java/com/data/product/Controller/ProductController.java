package com.data.product.Controller;


import com.data.product.DTO.Request.ProductRequest;
import com.data.product.Entity.Product;
import com.data.product.Serivce.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<String > addNewProductData(@RequestBody ProductRequest productRequest) {

        productService.addNewProduct(productRequest);
        return ResponseEntity.ok("Product added successfully");
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<String> editProduct(@PathVariable("id") Long productId, @RequestBody ProductRequest productRequest) {

        productService.editProduct(productId,productRequest);
        return ResponseEntity.ok("Product edit successfully");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") Long productId) {

        productService.deleteProduct(productId);
        return ResponseEntity.ok("Product deleted successfully");
    }

    @GetMapping("/{id}")
    public void getProductById(@PathVariable("id") Long productId) {

        productService.getProductById(productId);

    }
    @GetMapping("/all-items")
    public ResponseEntity<?> getProduct() {

      List<Product> productList=productService.getProduct();

        return ResponseEntity.ok(productList);
    }

}
