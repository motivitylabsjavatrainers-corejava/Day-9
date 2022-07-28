package com.accessmodifier.package1;

import com.accessmodifier.package2.PublicEaxmple;

public class PublicMain {
    public static void main(String[] args) {
        PublicEaxmple publicEaxmple=new PublicEaxmple();
        publicEaxmple.getName();
        System.out.println(publicEaxmple.name);
    }
}
