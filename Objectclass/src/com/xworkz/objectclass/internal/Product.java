package com.xworkz.objectclass.internal;

public class Product {
    public String name;
    public int id;
    public double price;
    public float weight;
    public boolean inStock;

    public Product() {
        System.out.println("Product record added");
    }

    public Product(String name, int id, double price, float weight, boolean inStock) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.weight = weight;
        this.inStock = inStock;
    }

    public String toString() {
        return "Product{name=" + name + ", id=" + id + ", price=" + price +
                ", weight=" + weight + ", inStock=" + inStock + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Product)) return false;
        Product p = (Product) obj;
        return name.equals(p.name) && id == p.id &&
                price == p.price && weight == p.weight && inStock == p.inStock;
    }
}

