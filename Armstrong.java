
import java.util.*;

public class Armstrong {
  public static void main(String[] args) {
    int count = 0;
    int rem = 0;
    int div;
    int sum = 0 ;
    int x;
    double result;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int number = sc.nextInt();
    x = number;
    while (number>0) {
      rem = number % 10;
      div = number / 10;
      number = div;
      count++;
      }
    System.out.println(count);
    number =x;
    while (number>0) {
      rem = number % 10;
      result = Math.pow(rem, count);
      sum +=result;  
      number = number/10;
    }
    
    if (number==sum) {
      System.out.println(x+ " is Armstrong number");
    }else{
      System.out.println(x+ " is not Armstrong number");
    }


    }

  }
