package com.haydikodlayalim.dpatterns.facade;

class MD5Encryptor {

    public void encrypt(String text, String key) {
        System.out.println("<MD5>" + text + key + "</MD5>");
    }
}
