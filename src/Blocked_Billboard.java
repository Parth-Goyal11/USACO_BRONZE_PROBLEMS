import java.io.*;
import java.util.*;
import java.awt.*;
public class Blocked_Billboard{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("billboard.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("billboard.out")));
        ArrayList<Integer> testInput= new ArrayList<>();
        int width;
        int length;

        //First Billboard
        int X1ll = sc.nextInt();
        int Y1ll = sc.nextInt();
        int X2ur = sc.nextInt();
        int Y2ur = sc.nextInt();

        //Second Billboard
        int X3ll = sc.nextInt();
        int Y3ll = sc.nextInt();
        int X4ur = sc.nextInt();
        int Y4ur = sc.nextInt();

        //Truck
        int X5ll = sc.nextInt();
        int Y5ll = sc.nextInt();
        int X6ur = sc.nextInt();
        int Y6ur = sc.nextInt();

        int intersectionOne;
        int totalVisible1, totalVisible2;
        int area1, area2;

        area1 = (X2ur - X1ll) * (Y2ur - Y1ll);
        area2 = (X4ur - X3ll) * (Y4ur - Y3ll);

        //Check if truck intersects the first billboard
        if(X1ll > X6ur || X5ll > X2ur         //If true, rectangles do not intersect
        || Y1ll > Y6ur || Y2ur < Y1ll){
            intersectionOne = 0;
            totalVisible1 = area1;
        }else{
            length = Math.min(X2ur, X6ur) - Math.max(X1ll, X5ll);
            width = Math.min(Y2ur, Y6ur) - Math.max(Y1ll, Y5ll);

            intersectionOne = length*width;
            totalVisible1 = area1 - intersectionOne;
        }

        int intersectionTwo;

        //Check if second rectangle intersects truck
        if(X3ll > X6ur || X5ll > X4ur                   //If true, rectangles do not intersect
                || Y3ll > Y6ur || Y4ur < Y1ll){
            intersectionTwo = 0;
            totalVisible2 = area2;
        }else{
            length = Math.min(X4ur, X6ur) - Math.max(X3ll, X5ll);
            width = Math.min(Y4ur, Y6ur) - Math.max(Y3ll, Y5ll);

            intersectionTwo = length*width;
            totalVisible2 = area2 - intersectionTwo;
        }


        pw.print(totalVisible1 + totalVisible2);
        pw.close();

    }
}
