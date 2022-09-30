import java.util.Scanner;
import java.util.Arrays;

public class Main2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int length = sc.nextInt();
        String[] input = new String[length];
        sc.nextLine();
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextLine();
        }
        for(int i=0;i<input.length;i++){//0,2是x1,x2；1,3是y1,y2
            String[] Snumbers =input[i].split(" ");
            double[] numbers = Arrays.stream(Snumbers).mapToDouble(Double::parseDouble).toArray();
            double k = (numbers[1]-numbers[3])/(numbers[0]-numbers[2]);
            double b =numbers[1]-numbers[0]*k;
            System.out.println(String.format("%.1f",k*numbers[4]+b));
        }
    }
}
