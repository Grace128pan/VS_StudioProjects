/*
 This program will demonstrate the usage of continue statement in Java
 */

 package JPrograms;

 public class Conti {
    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            System.out.println(i + "");
            if((i%2) == 0) continue;
            System.out.println();
        }
    }
 }