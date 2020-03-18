package com.haydikodlayalim.dpatterns.decorator;

public class DecoratorRunner {

    public static void main(String[] args) {
        Phone phone = new Iphone11ProMax(new IPhone());

        System.out.println(" Name : " + phone.getName());
        System.out.println(" Price : " + phone.getPrice());
        System.out.println(" Camera count : " + phone.cameraCount());
    }
}
