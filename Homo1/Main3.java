import java.util.Scanner;

public class Main3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int length = sc.nextInt();
        int[] input = new int[length];
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }
        for(int i=0;i<input.length;i++){
            if((input[i]%4 ==0&&input[i]%100 !=0)||input[i]%400==0)
            {
                System.out.println("Yes");
                CalculateTime(input[i]);
            }
            else{
                System.out.println("No");
            }
        }
    }
    static void CalculateTime(int k){
        int days=366-60;
        for(int i=k+1;i<2000;i++){
            if((i%4 ==0&&i%100 !=0)||i%400==0)
            {
                days += 366;
            }
            else{
                days +=365;
            }
        }
        System.out.println(days +1);
    }
}
