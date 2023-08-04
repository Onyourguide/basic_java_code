import java.util.Scanner;

public class basic_java1_3 {
    public static void main(String[] args) {
        int x ;
        Scanner intput = new Scanner(System.in);
        x = intput.nextInt();

        if ((x < -1) || (x > 1)) {
            System.out.println(" x in lange ");
        }

    }
}
