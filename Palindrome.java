
import java.util.*;

public class Palindrome {
  public static void main(String[] args) {
    int oNumber;
    int snum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int number = sc.nextInt();
    int rem ;
    oNumber = number;
    while (number>0) {
      rem = number % 10;
      number/= 10;
      snum = 10 * snum + rem;
    }
    System.out.println(snum);

    if (oNumber==snum) {
      System.out.println("Number is a palindrome");
    } else {
      System.out.println("Number is not a palindrome");
    }
    }


  }
