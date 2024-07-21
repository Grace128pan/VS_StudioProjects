/*
 This program will demonstrate how to use this keyword in Java
 */

 package JPrograms;

 class Pwr {
    double b;
    int e;
    double val;

    //constructor
    Pwr(double base, int exp) {
        b = base;
        e = exp;

        val = 1;
        if(exp == 0) return;
        for(; exp>0; exp--) val = val *base;
  
    }
    double getVal() {
            return val;  //within a method, the other members of the class can be accessed without using this keyword
        }
 }

 class DemoPwr {
    public static void main(String[] args) {
        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);

        System.out.println(x.b  + " raised to the " + x.e + " power is " + x.getVal());
        System.out.println(y.b + " raised to the " + y.e + " power is " + y.getVal());
        System.out.println(z.b + " raised to the " + z.e + " power is " + z.getVal());
    }
 }

 /*
 1. this reference can also be used:
 Class Pwr {
    double b;
    int e;
    double val;

    //constructor
    Pwr(double base, int exp) {
        this.b = base;
        this.e = exp;

        val = 1;
        if(exp == 0) return;
        for(; exp>0; exp--) this.val = this.val *base;
  
    }
    double getVal() {
            return this.val;  //within a method, the other members of the class can be accessed without using this keyword
        }
  */