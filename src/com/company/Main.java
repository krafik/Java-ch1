package com.company;

import java.io.Console;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    //    public static final int DAYS_WEEK = 7;
    public static void main(String[] args) {
        // write your code here
//        System.out.println("Hello, World!");
        Scanner in = new Scanner(System.in);
//        System.out.println("name");
//        String name = in.nextLine();
//        System.out.println(name);
//        Console terminal = System.console();
//        String username = terminal.readLine("User name: ");
//        char[] passwd = terminal.readPassword("Password: ");
//        System.out.println(username);
//        System.out.println(passwd);
//        Random generator = new Random();
//        System.out.println(generator.nextInt());
//        System.out.println(generator.nextInt());
        // byte b = 126; // Вот тут будет ошибка, т.к. у нас диапазон от -128 до 127!
        //  short s = 1123;
        //  int i = 64536;
        //  long l = 2147483648L; // Постфикс l или L обозначает литералы типа long
        //  System.out.println("int="+i);
//        System.out.println(DAYS_WEEK);
//        System.out.println(b);
//        System.out.println(s);
//        System.out.println(l);
        //      System.out.println(1<<5);
//        System.out.println(1.0f / 0);
//        System.out.println(15%5);
//        if (15%6 == 0){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }
        //    System.out.println(Math.toIntExact(1000000000*3));
//        double x = 3.75;
//        int n = (int) Math.round(x);
//        System.out.println("n = "+n);
//        BigInteger n =BigInteger.valueOf()


//        System.out.printf("%,+.2f", 100000.0 / 3.0);
        int target = 10;
//        for (int i=1; i<target; i*=2){
//            System.out.println(i);
//        }

      /*  while (true){
            String input = in.next();
            if (input.equals("Q")) break;
            System.out.println(input);
        }*/

      /*  while (in.hasNextInt()) {
            int input = in.nextInt();
            if (input < 0) continue;
            System.out.println(input);
        } */

      /*
        String[] names = new String[100];
        for (int i = 0; i < names.length; i++) {
            names[i] = String.format("%s", i);
//            names[i]=i;
            System.out.println(names[i]);
        }
        if (names[5] instanceof String) {
            System.out.println("true");
        }
//        System.out.println(names[5]);
*/

        ArrayList<String> friends = new ArrayList<>();
        friends.add("peter");
        friends.add("paul");
        for(int i=0; i<friends.size(); i++){
            System.out.println(friends.get(i));
        }
    }
}
