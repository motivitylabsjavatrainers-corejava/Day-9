package com.accessmodifier.package1;
class PrivateAccess{
    private String name="sandeep";
    private void getname(){
        System.out.println("name "+name);
    }
}

public class PrivateExample {
    public static void main(String[] args) {
    PrivateAccess privateAccess=new PrivateAccess();
    //System.out.println(privateAccess.name);//name' has private access in 'com.accessmodifier.package1.PrivateAccess'
    }
}
