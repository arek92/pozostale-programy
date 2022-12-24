import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile liczb bedziesz losowac?");
        int k = scanner.nextInt();
        System.out.println("Jaka jest najwieksza liczba?");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            int r = (int) (Math.random() * n);
            result[i] = numbers[r];
            numbers[r] = numbers[n - 1];
            n--;
        }
//wydruk zapisanej tablicy
        //Arrays.sort(result);
        System.out.println("Postaw na nastepujace numbers");
        for (int r : result) {
            System.out.println(r);
// }
        }
    }
}
//liczby sa intami
//