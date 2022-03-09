package com.kapikudikalama;

abstract class Car{   //abstract class
     public void method1(){
        System.out.println("method 1");
    }

    abstract void running();//declaration
} // abstract class

class bike extends Car{ //concrete class
     public void running(){ //definition
        System.out.println("running");
    }
} // concrete class