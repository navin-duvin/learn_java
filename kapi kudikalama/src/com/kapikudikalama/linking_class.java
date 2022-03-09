package com.kapikudikalama;

public class linking_class {
    void linker(){
        System.out.println("linking_class");
    }
    private void link(){
        System.out.println("private linking class");
    }
    protected void links(){
        System.out.println("protected linking class");
    }
}

/*
    empty - not accessible in another package
    public - can use everywhere
    private - only in that class
    protected - only in that package

 */
