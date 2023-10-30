import java.util.Scanner;

class Student2 {
    String name;
    int regNo;
    int total = 0;
    double avg = 0;
    int[] marks = new int[5];

    void get(String a, int b, int c[]) {
        name = a;
        regNo = b;
        marks = c;
    }

    void calculate() {
        int i;
        for (i = 0; i < 5; i++) {
            total += marks[i];
        }
        avg = (double) total / 5;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Registration No: " + regNo);
        System.out.println("Average marks: " + avg);
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String x;
        int y;
        int z[] = new int[5]; 

        System.out.println("Enter name:");
        x = s.nextLine();
        System.out.println("Enter regno:");
        y = s.nextInt();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter marks " + (i + 1) + ":");
            z[i] = s.nextInt();
        }

        Student obj = new Student();
        obj.get(x, y, z);
        obj.calculate();
        obj.display();
    }
}
