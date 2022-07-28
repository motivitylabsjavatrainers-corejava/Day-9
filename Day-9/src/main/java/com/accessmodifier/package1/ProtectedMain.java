package com.accessmodifier.package1;

import com.accessmodifier.package2.ProtectedExample;

public class ProtectedMain extends ProtectedExample {
    public static void main(String[] args) {
        ProtectedMain protectedMain=new ProtectedMain();
        protectedMain.getName();
        System.out.println(protectedMain.name);
    }
}
