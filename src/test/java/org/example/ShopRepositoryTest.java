package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {

    Product product1 = new Product (123, "Бекон", 320);
    Product product2 = new Product (10, "Масло", 110);
    Product product3 = new Product (7, "Хлеб", 50);
    Product product4 = new Product (335, "Сыр", 215);


    @Test

    public void removeByIdProduct() {
    ShopRepository repo = new ShopRepository();
    repo.add(product1);
    repo.add(product2);
    repo.add(product3);
    repo.add(product4);

    repo.remove(10);

    Product[] expected = {product1, product3, product4};
    Product[] actual = repo.findAll();

    Assertions.assertArrayEquals(expected, actual);

    }
    @Test

    public void remove() {
        ShopRepository repo = new ShopRepository();
        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        repo.add(product4);

//        repo.remov(6);
//        Product[] expected = {product1,product2, product3, product4};
//        Product[] actual = repo.findAll();
//        Assertions.assertArrayEquals(expected, actual);


        Assertions.assertThrows(NotFoundException.class, () -> {
           repo.removeById(-7);
       });
    }
}
