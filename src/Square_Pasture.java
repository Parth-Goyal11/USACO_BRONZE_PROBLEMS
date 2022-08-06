import java.io.*;
import java.util.Scanner;

public class Square_Pasture {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new FileReader("square.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("square.out")));

        //Pasture 1
        int X1ll = sc.nextInt();
        int Y1ll = sc.nextInt();
        int X2ur = sc.nextInt();
        int Y2ur = sc.nextInt();

        //Pasture 2
        int X3ll = sc.nextInt();
        int Y3ll = sc.nextInt();
        int X4ur = sc.nextInt();
        int Y4ur = sc.nextInt();

        int highest = Math.max(Y2ur, Y4ur);
        int lowest = Math.min(Y1ll, Y3ll);

        int left = Math.min(X1ll, X3ll);
        int right = Math.max(X2ur, X4ur);

        int verticalDistance = Math.abs(highest-lowest);
        int horizontalDistance = Math.abs(right-left);

        int side = Math.max(verticalDistance, horizontalDistance);


        pw.print((int)Math.pow(side, 2));
        pw.close();

    }
}
