package com.color;

import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Product bike = new Product();bike.setColor(Product.Color.BLACK);
        Product phone = new Product();phone.setColor(Product.Color.WHITE);

        ArrayList<Product> products = new ArrayList<Product>();
        products.add(bike);products.add(phone);
        Order order = new Order();
        order.setProducts(products);
        List<Order> orders = Collections.singletonList(order);

        System.out.println(hasColorProduct(orders.stream() , Product.Color.WHITE));
    }

    public static Boolean hasColorProduct(final Stream<Order> orders, final Product.Color color) {
        return orders.map(Order::getProducts)
                .filter(Objects::nonNull)
                .flatMap(x -> x.stream())
                .map(Product::getColor)
                .anyMatch(color1 -> color1.equals(color));
    }
}
