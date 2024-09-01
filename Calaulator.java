import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
    public class Calaulator {
//    main function
public static void main(String[] args) {
//    sstorw two number
    double num1, num2;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number 1: ");
    num1 = sc.nextDouble();
    System.out.print("Enter the number 2: ");
    num2 = sc.nextDouble();

    System.out.print("Enter the Operator (+, -, *, /, %) :- ");

    char op = sc.next().charAt(0);
    double ans = 0;

    switch(op) {
        case'+' :
            ans = num1 + num2;
            break;
        case'-' :
            ans = num1 - num2;
            break;
        case'*' :
            ans = num1 * num2;
            break;
        case'/' :
            ans = num1 / num2;
            break;
        case'%' :
            ans = num1 % num2;
            break;

        default:
            System.out.print("You entered wrong Operator :(");
    }
    System.out.print("The Final Result");
//    System.out.println();

    //Printing the final result
    System.out.print(num1 +" "+ op +" "+ num2 + " = " + ans);
}
}
