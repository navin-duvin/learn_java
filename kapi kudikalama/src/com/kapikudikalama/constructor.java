package com.kapikudikalama;

public class constructor {

        int speed;
        String color;

      public constructor(){//default constructor
            System.out.println("default-constructor");
        }
    public constructor(int s,String c){// two parameter constructor
            speed = s;
            color =c;
            System.out.println("2 parameter constructor:speed" +' '+s);
            System.out.println("2 parameter constructor:color" +' '+c);
        }
    public constructor(int sp){ // single parameter constructor
            speed=sp;
            System.out.println("1 parameter constructor:" +' '+sp);
        }

    public void run(){ // car class method
            System.out.println("car is running");
        }


}
