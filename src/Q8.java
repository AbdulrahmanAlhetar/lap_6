import java.util.Scanner;
public class Q8 {



        public static void main(String[] args) {
            int x,m;
            Scanner e=new Scanner(System.in);
            System.out.println("enter num ");
            x=e.nextInt();
            for (int i=1 ;i<x; i++)
            {
                m=0;
                for (int j=2 ;j<i ; j++)
                {
                    if (i%j==0)
                        m=1;
                }
                if (m==0)
                    System.out.println(i);
            }
        }

    }
