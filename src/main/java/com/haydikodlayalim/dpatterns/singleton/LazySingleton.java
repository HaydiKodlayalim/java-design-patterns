package com.haydikodlayalim.dpatterns.singleton;

public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton(){

    }

    public static LazySingleton getLazySingleton() {
        if (lazySingleton == null)
            lazySingleton = new LazySingleton();
        return lazySingleton;
    }

    public void singletonTest(){
        System.out.println("Lazy Singleton method calisti");
    }
}
