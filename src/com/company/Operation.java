package com.company;

public class Operation {
    private int a;
    private int b;

    public Operation(int x, int y){
        a=x;
        b=y;

        System.out.println(add());
        System.out.println(sub());
        System.out.println(mult());
        System.out.println(div());
    }

    public int add(){
        return (a+b);
    }

    public int sub(){
        return (a-b);
    }

    public int mult(){
        return (a*b);
    }

    public double div(){
        return ((double) a/b);
    }
}
