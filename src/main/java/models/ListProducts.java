package models;

import dao.Products;
import models.Product;

import java.util.ArrayList;
import java.util.List;

public class ListProducts implements Products {
    private List<Product> products = new ArrayList();
    public ListProducts(){
        insert(new Product("Playstation", 300.00));
        insert(new Product("Xbox", 400.00));
        insert(new Product("Nintendo", 200.00));
    }
    public void insert(Product product){
        this.products.add(product);
    }

    public List<Product> all(){
        return this.products;
    }
}
