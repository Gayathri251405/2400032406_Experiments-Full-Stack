package com.example.loader;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.example.entity.Product;

public class ProductDataLoader {

public static void loadProducts(Session session){

Transaction tx=session.beginTransaction();

session.save(new Product("Laptop",899.99,15,"Electronics"));
session.save(new Product("Mouse",25.50,50,"Electronics"));
session.save(new Product("Keyboard",45.00,30,"Electronics"));
session.save(new Product("Monitor",299.99,20,"Electronics"));

tx.commit();

}

}