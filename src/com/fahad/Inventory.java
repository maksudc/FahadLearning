package com.fahad;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maksud on 2/10/16.
 */
public class Inventory {

    List<Product> products;

    public Inventory(){
        products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }
}
