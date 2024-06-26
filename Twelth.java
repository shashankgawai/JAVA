// Print Fibonicies series

import java.io.*;
import java.util.Scanner;

class Twelth {
    public static void main(String[] args) 
    {

        int a=0,b=1,c;
        for (int i = 1; i <10; i++)
         {
            c=a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
        }
    }

}