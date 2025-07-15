import java.util.Scanner;

public class J15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        long rollNumber = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Stream: ");
        String stream = sc.nextLine();

        System.out.println("\n--- Student Details ---");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Stream: " + stream);

        sc.close();
    }
}
