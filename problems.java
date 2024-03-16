import java.util.*;

public class problems {


  // no.1
  // Sum Of Product Of N numbers



  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number");
    int n = sc.nextInt();
    long sum = 0;
    long product = 1;
    for(int i=1; i<=n; i++){
      product = product * i;
      sum = sum + product;
    }
    System.out.println("answer is"+sum);
  }


  

  // no.2
  // no.3
  // no.4
}
