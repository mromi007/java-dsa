public class pattern {
  /*public static void main(String[] args) {
    for(int i=0; i<=5; i++){
      for(int j=0; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }*/
  /*public static void main(String[] args) {
    for(int line=0; line<=5; line++){
      for(int star=0; star<=5-line+1; star++){
        System.out.print("*");
      }
      System.out.println();
    }
  }*/

  /*public static void main(String[] args) {
    int a = 1;
    for(int line=1; line<=5; line++){
      for(int star=1; star<=line; star++){
        System.out.print(a);
        a++;
      }
      System.out.println();
    }
  }*/


  /*public static void main(String[] args) {
    char ch = 'A';
    for(int line=1; line<=5; line++){
      for(int chars=1; chars<=line; chars++){
        System.out.print(ch);
        ch++;
      }
      System.out.println();
    }
  }*/






















/* 

  static void print_rectangle(int n, int m)
    {
        int i, j;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= m; j++)
            {
                if (i == 1 || i == n || 
                    j == 1 || j == m)            
                    System.out.print("*");            
                else
                    System.out.print(" ");            
            }
            System.out.println();
        }
      
    }
      
    // Driver program for above function
    public static void main(String args[])
    {
        int rows = 6, columns = 20;
        print_rectangle(rows, columns);
    }
*/






/*public static void main(String[] args) {
  for(int line=1; line<=5; line++){

    for(int star=1; star<= line-1; star++){
      System.out.print(" ");
    }
    for(int star=1; star<=5-line+1; star++){
      System.out.print("*");
    }
    System.out.println();
  }
}
*/


public static void main(String[] args) {
  for(int i=0; i<=5; i++){
    for(int j=0; j<=5-i; j++){
      System.out.print(" ");
    }
    for(int j=0; j<=i; j++){
      System.out.print("*");
    }
    System.out.println();
  }
}






    
    
}
 