package com.haydikodlayalim.dpatterns.decorator;

public class NormalSample {

    public static class Iphone11 {
        public String name(){
            return "Iphone 11"; //100x100
        }

        int getCameraCount() {
            return 2;
        }
    }

    public static class Iphone11Pro {

        public String name(){
            return "Iphone 11 Pro"; //120x120
        }

        int getCameraCount() {
            return 3;
        }
    }

    public static class Iphone11Max {

        public String name(){
            return "Iphone 11 Pro Max"; //150x150
        }

        int getCameraCount() {
            return 3;
        }
    }
}
