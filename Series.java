import java.util.Scanner;
class Series {
  public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);

    int n;
    int sum = 0;


    System.out.print("Enter N value: ");
    n = scan.nextInt();


    for(int i=1; i<=n; i++) {
      sum = sum + i;
    }

    System.out.println("Sum = " + sum);
  }
}