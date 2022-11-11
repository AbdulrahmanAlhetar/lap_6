import java.util.Scanner;
public class Q7 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("enter num ");
            int number = in.nextInt();
            for (;;){
                if (number==0)break;
                int a =(number%2==1)?1:0;
                number/=2;
                System.out.println(a);
            }
        }
}
