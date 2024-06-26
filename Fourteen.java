/* check palindrom or not */

import java.io.*;
import java.util.Scanner;

class Fourteen {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        int no = S.nextInt();

        int temp = no, rem;
        int rev = 0;

        while(temp != 0)
         {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (rev == no) {
            System.out.println("This Number is palindrom");

        } else {
            System.out.println("This is not palindromcleṇ");
        }
    }

}