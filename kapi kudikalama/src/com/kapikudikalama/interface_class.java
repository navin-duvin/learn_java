package com.kapikudikalama;

public class interface_class {

    interface inter {
        void m1(); // method only defined not declared it always abstract method.

    }
    interface inter1{
        public void m2();
    }

    class inter2 implements inter,inter1{ //multiy inheritance can be achieved by interface
        public void m1(){

        }
        public void m2(){

        }
    }


}
