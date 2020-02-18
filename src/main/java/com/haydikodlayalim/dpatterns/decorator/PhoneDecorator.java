package com.haydikodlayalim.dpatterns.decorator;

public class PhoneDecorator implements Phone {

    protected Phone basicPhone;

    public PhoneDecorator(Phone basicPhone) {
        this.basicPhone = basicPhone;
    }


    @Override
    public String getName() {
        return basicPhone.getName();
    }

    @Override
    public int cameraCount() {
        return basicPhone.cameraCount();
    }

    @Override
    public double getPrice() {
        return basicPhone.getPrice();
    }
}
