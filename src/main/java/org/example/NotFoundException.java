package org.example;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String s) {
        super(s);
    }
//    public NotFoundException(int id) {
//        if (id < 0) {
//            RuntimeException e = new RuntimeException(
//                    "Продукта с таким ID не найдено" +id
//            );
//            throw e;
//        }
//    }
}
