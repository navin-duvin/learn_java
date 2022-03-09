package com.kapikudikalama;

import com.kapikudikalama.New_package.new_package_class;

import java.util.Scanner;

class ne_class{
    static void use(){
        System.out.println("use method");
    }
}

public class Main<name> {

    public static void main(String[] args) {
	// write your code here
        int[] arr = new int[]{1, 2, 3, 4};
        char[] c = {'q','w','c','l'};
        char[] clo=c.clone();

       // for(char clone:clo){
         //   System.out.println(clone);
        //}
        //System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(clo));

        String name= "navinduvin" ;
        //System.out.println(name +' '+ "tinker");
        //System.out.println(name.split("in"));

         int age_of_person=14;//BODMAS --> precedence execution wise (brakets ,poweroperators,division,multiply,add,sub)

        //age_of_person *= 10;
        //System.out.println( age_of_person);
                                //condition        true         false
        //System.out.println(age_of_person >= 18 ? "voted":"not able to vote");

        // getting input
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter the input:");
        // String sc = input.next();
        // //System.out.println(sc);
        //
        //
        // switch (sc){
        //     case 1:"lokith":
        //         System.out.println("little brother");
        //         break;
        //     case 2:"duvin":
        //         System.out.println("duvin");
        //         break;
        //     case 3:"navin":
        //         System.out.println("elder navin");
        //         break;
        //     default:
        //         System.out.println("no name");
        // }
        //m1();//calling method
        //System.out.println(m2(12,23));
        //System.out.println(m3(12.23,2.2));

        int number =10;//variable
        String na = new String("tester");// object
        //System.out.println(na.length());

        ne_class object = new ne_class();//object creation
       // ne_class.use();

        //car audi = new car();  //object creating with name audi
        //car ford = new car(200,"white");//parameter passing to method
       // car mahindra = new car(200);
        //audi.run(); //run method calling
        //System.out.println(ford);

        //System.out.println("method overloading with 1 paramter:" +' '+ add(2));//method overloading
        //System.out.println("method overloading with 2 paramter:" +' '+ add(2,3.6));//method overloading

        /* This keyword
        This th= new This(10);
        System.out.println(th.num);
        */
        /*
        human child= new human();//human class object creation

        person boy = new person();//person class object creation
        boy.test();//inherits human class with object create for person class
        devil dev = new devil();//devil class object creation
        dev.per(); //inherits human class with object created for devil class
        angel an = new angel();
       // an.per();//not inherites person class so it canot be used
        */
        /* method override object creation
        a ride = new a();
        a.test();
        b rider = new b();
        b.test();
        */

        /*  encapsulation
        encap data = new encap();
        data.username = "navinduvin";
        data.setPassword("tester");
        System.out.println(data.getPassword());

        */
        /* abstract class object creation
        Car obj = new bike();
        obj.method1();
        obj.running();
        */

        linking_class lc = new linking_class();//linking class in another class file
        lc.linker();//linking_class method
        //lc.link(); //private method not accessible in another file
        lc.links();//protected method  accessible in another file

        new_package_class  npc= new new_package_class();//package class created from another package
        npc.Package_class();// package class method calling

        /*try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number:");
            int number1 = scan.nextInt(); //it scan for integer if string given it throws error
            System.out.println(number1);
        }
        catch(Exception exception_object){
            System.out.println("You did something error");
        }
        finally {
            System.out.println("it will execute always whether right/wrong");
        }*/

        inner_class in = new inner_class();
        in.inner();

        inner_class.innerkullla inn = in.new innerkullla();
        inn.innerkulla();


    }

    // method overloading
    //      public static int add(){
    //      return 0;
    // }
    // public static  int add(int num1){
    //     return num1;
    // }
    // public static int add(int num1,int num2){
    //     return num1 + num2;
    // }
    // public static double add(int num1,double num2){
    //     return num1 + num2;
    // }
    //


    //method creating
    /*
    public static void m1(){
        System.out.println("m1-method");
    }
     private  static int m2(int n1, int n2){
        return  n1 + n2;
    }
    static  double m3(double d1,double d2){
        return d1 +d2;
    }*/


}
