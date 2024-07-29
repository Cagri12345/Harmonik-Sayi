package Basic;
import java.util.Scanner;
public class HarmonikSayi {
    public static void main(String[] args) {
        int n;
        double result = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Sayınızı girin: ");
        n = input.nextInt();

        for(int i = 1 ; i <= n ; i++){
            result += (1.0/i);
        }
        System.out.println("Harmonik Sayı: " + result);
    }
}
