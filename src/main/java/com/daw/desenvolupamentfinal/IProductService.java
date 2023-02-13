package com.daw.desplegament02;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IProductService {
    
    List<com.daw.desplegament02.Product> getAllProducts();
    
    List<Product> getProductByName(String name);
    
    Product saveProduct(Product product);
    
    Product getProductById(Long id);
    
    Product updateProduct(Product product);
    
    void deleteProductById(Long id);

}
