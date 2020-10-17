import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        String triangle = "YES";
        String notTriangle = "NO";
        if (A + B > C && A +C > B && B + C > A){
            System.out.println(triangle);
        } else {
            System.out.println(notTriangle);
        }

    }
}