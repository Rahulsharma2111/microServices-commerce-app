package com.data.product.Controller;


import com.data.product.DTO.Request.ProductRequest;
import com.data.product.Serivce.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public void addNewProductData(@RequestBody ProductRequest productRequest) {

        productService.addNewProduct(productRequest);

    }

    @PutMapping("/edit/{id}")
    public void editProduct(@PathVariable("id") Long productId,@RequestBody ProductRequest productRequest) {

        productService.editProduct(productId,productRequest);

    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable("id") Long productId) {

        productService.deleteProduct(productId);

    }

    @GetMapping("/{id}")
    public void getProductById(@PathVariable("id") Long productId) {

        productService.getProductById(productId);

    }
    @GetMapping("")
    public void getProduct(@RequestBody ProductRequest productRequest) {

        productService.getProduct(productRequest);

    }

}
