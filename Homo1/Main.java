import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int length = sc.nextInt();
        int[] input = new int[length];
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }
        for (int i = 0; i < input.length; i++) {
            switch (input[i]) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("yes");
                    break;
                default:
                    System.out.println("no");
                    break;
            }
        }
    }
}
