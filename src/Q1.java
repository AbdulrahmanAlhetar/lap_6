
    import java.util.Scanner;

    public class Q1
    {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int year =0;
            double rat, inv;
            System.out.println(" enter the inves ");
            inv = in.nextInt();
            System.out.println("enter rate");
            rat = in .nextInt();
            rat *=0.01;
            for (;;){
                inv+=inv*rat;

                if (inv>=1000000)break;
                else year++;
            }
            System.out.println("yor inv"+inv);
            System.out.println(" year = "+ year);

        }
}
