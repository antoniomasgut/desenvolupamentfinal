package com.daw.desplegament02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String home() {
        System.out.println("Entrant a home");
        return "home";
    }
    @GetMapping("/con")
    public String congratulations() {

        System.out.println("Entrant a congratulations");
        return "congratulations";
    }

    @GetMapping("/products")
    public String products(Model model) {
        System.out.println("Entrant a products");
        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }    
 }
