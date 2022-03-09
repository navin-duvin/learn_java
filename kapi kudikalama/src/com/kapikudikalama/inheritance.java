package com.kapikudikalama;

class human{ //super class ,parent class
     public human(){
        System.out.println("human class default constructor");
    }
     public void test(){
        System.out.println("human class test method");
    }
} // multiple human-person-devil-angel, hirearchial human-person,human-devil,human-angel, normal human-person
//multi level not supported in java for ex: class puthusu extends human,person{}
class person extends human{
     public person(){
        System.out.println("person class default constructor");
    }
     public void per(){
        System.out.println("person inherites");
    }
}//single level inheritance
class devil extends  person{
     public devil(){
        System.out.println("devil class default constructor");
    }
     public void dis(){
        System.out.println("dev inherites");
    }
}// multiple level inheritance
class angel extends human{
     public angel(){
        System.out.println("angel class default constructor");
    }
} //hierarchical inheritance
