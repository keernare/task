package com.color;

public class Product {
    private Product.Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public enum Color {
        BLACK, WHITE, RED
    }
}
