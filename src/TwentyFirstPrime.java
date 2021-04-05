import java.util.Scanner;

public class TwentyFirstPrime {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên cần in ra: ");
        int number = sc.nextInt();
        int count = 0;
        int n = 2;

        while (count <= number) {
            boolean check = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
                System.out.println("số nguyên tố: " + n + " thứ tự " + count);
            }
            n++;
        }
    }
}
