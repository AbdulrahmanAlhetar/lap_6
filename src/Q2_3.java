import java.util.Scanner;

public class Q2_3 {
        public static void main(String[] args) {
            System.out.print(" Enter number  ");
            Scanner in = new Scanner(System.in);

            int sum = 0;
            int utensil = 0;
            int num = in.nextInt();

            for (; ; ) {

                utensil = num % 10;
                sum += (utensil % 2 == 1) ? utensil : 0;
                num /= 10;

                if (num== 0) {
                    break;
                }
            }

            System.out.println("The sum of all odd digits is = " + sum);
        }

    }
