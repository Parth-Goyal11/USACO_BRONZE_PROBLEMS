import org.w3c.dom.ranges.Range;

import java.io.*;
import java.util.*;
import java.lang.Math.*;
public class Fence_Painting {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("paint.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("paint.out")));
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int IntervalOne = b-a;
        int IntervalTwo = d-c;

        int intervals = IntervalOne + IntervalTwo;

        int intersection = Math.min(b,d) - Math.max(a,c);
        int trueIntersection;
        if(intersection > 0){
            trueIntersection = intersection;
        }else{
            trueIntersection = 0;
        }

        pw.print(intervals - trueIntersection);
        pw.close();


    }
}
