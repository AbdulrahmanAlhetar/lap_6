import java.util.Scanner;
public class Q5 {
        public static void main(String[] args) {
            Scanner in = new Scanner (System.in);
            System.out.println(" Enter text ");
            String abd= in.next();
            int count =0;
            for (int i=1; i<abd.length();i++){
                char A =abd.charAt(i);
                if (A=='a'||A=='b'||A=='o'||A=='o'||A=='d'||A=='e');{
                    count++;
                }
            }
            System.out.println("number of vowels " +count);

        }
}
