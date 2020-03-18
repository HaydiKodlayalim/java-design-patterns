package com.haydikodlayalim.dpatterns.decorator;

public class Iphone11Pro extends PhoneDecorator {

    public Iphone11Pro(Phone basicPhone) {
        super(basicPhone);
    }

    @Override
    public double getPrice() {
        return basicPhone.getPrice() + 100;
    }

    @Override
    public String getName() {
        return basicPhone.getName() + "11 Pro";
    }

    @Override
    public int cameraCount() {
        return super.cameraCount() + 1 ;
    }
}
