package com.accessmodifier.package1;

//import com.accessmodifier.package2.DefaultExample;

class DefaultExample2{
    String name="sandeep";
    void getName(){
        System.out.println("name "+name);
    }
}

 class DefaultMain {
     public static void main(String[] args) {
         DefaultExample2 defaultExample2=new DefaultExample2();
         defaultExample2.getName();
         System.out.println(defaultExample2.name);
        //DefaultExample defaultExample=new DefaultExample();//com.accessmodifier.package2.DefaultExample' is not public in 'com.accessmodifier.package2'. Cannot be accessed from outside package
     }
}
