import java.util.Scanner;

public class loops {
  public static void main(String[] args) {
    
    // while loop

    //print n numbers
    /*Scanner sc = new Scanner(System.in);
    int Range = sc.nextInt();
    int x = 1;
    while (x <= Range) {
      System.out.println(x);
      x++;
    }*/

    //sum of first 5 natural numbers
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    int i = 1;
    while(i <= n){
      sum = sum + i;
      i++;
    }
    
    System.out.println(sum);






    // for loop

    /*for(int y = 0; y<=10; y++){
      System.out.println(y);
    }
    */


    // do while

    
  }
}
