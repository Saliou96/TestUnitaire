package com.example.text;

import com.example.text.entity.Product;
import com.example.text.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TextApplicationTests {
    @Autowired
    private ProductRepository productRepository;

//    @Test
//    public void testCreateProduit() {
//        Product prod = new Product("PC Dell", 1000);
//        productRepository.save(prod);
//    }

    @Test
    public void testFindProduit() {
        Product p = productRepository.findById(2L).get();
        System.out.println(p);
    }

    @Test
    public void testUpdateProduit() {
        Product p = productRepository.findById(2L).get();
        p.setName("hp");
        p.setPrice(350000);
        productRepository.save(p);
    }

    @Test
    public void testDeleteProduit() {
        productRepository.deleteById(2L);
    }

    @Test
    public void testListerTousProduits() {
        List<Product> prods = productRepository.findAll();
        for (Product p : prods) {
            System.out.println(p);
        }
    }


}
