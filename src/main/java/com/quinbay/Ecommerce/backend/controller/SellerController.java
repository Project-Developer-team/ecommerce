import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


package com.quinbay.Ecommerce.backend.controller;

import java.util.List;

@RestController
@RequestMapping("seller")
public class SellerController {
    @Autowired
    SellerService sellerService;

    @Autowired
    ProductService productService;


    @PostMapping("/add-seller")
    public void addSeller(@RequestBody Seller seller){
        sellerService.addSeller(seller);
    }

    @PostMapping("/add-product")
    public void addProduct(@RequestBody Product product){
        productService.addProducts(product);
    }

    @GetMapping("/get-all-products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("/get-product-byId")
    public Product getProductById(@RequestParam(value = "id") Long id){
        return productService.getProductById(id);
    }

    @PutMapping("/update-product")
    public void updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
    }

    @DeleteMapping("/delete-product")
    public void deleteProduct(@RequestParam(value = "id") Long id)
    {
        productService.deleteProduct(id);
    }


}
