import java.util.Scanner;

public class Main4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int length = sc.nextInt();
        int[] numbers = {0, 0, 0, 0};//0A1B2C3D
        for (int i = 0; i < length; i++) {
            switch (sc.nextInt() / 10) {
                case 10:
                case 9:
                    numbers[0]++;
                    break;
                case 8:
                    numbers[1]++;
                    break;
                case 7:
                    numbers[2]++;
                    break;
                case 6:
                    numbers[3]++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("A: " + numbers[0]);
        System.out.println("B: " + numbers[1]);
        System.out.println("C: " + numbers[2]);
        System.out.println("D: " + numbers[3]);
    }
}
