import java.io.*;
import java.util.Scanner;

public class Blocked_Billboard_II {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("billboard.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("billboard.out")));
        int answer;

        int rect1Xll = sc.nextInt();
        int rect1Yll = sc.nextInt();
        int rect1Xur = sc.nextInt();
        int rect1Yur = sc.nextInt();

        int rect2Xll = sc.nextInt();
        int rect2Yll = sc.nextInt();
        int rect2Xur = sc.nextInt();
        int rect2Yur = sc.nextInt();

        int length1 = Math.abs(rect1Xur - rect1Xll);
        int width1 = Math.abs(rect1Yur - rect1Yll);
        int area1 = length1*width1;

        int length2 = Math.abs(rect2Xur - rect2Xll);
        int width2 = Math.abs(rect2Yur - rect2Yll);
        int area2 = length2*width2;

        int Xbound1 = Math.max(rect1Xll, rect2Xll);
        int Xbound2 = Math.min(rect1Xur, rect2Xur);

        int Ybound1 = Math.max(rect1Yll, rect2Yll);
        int Ybound2 = Math.min(rect1Yur, rect2Yur);

        int intersectionX = Xbound2 - Xbound1;
        int intersectionY = Ybound2 - Ybound1;
        int intersectionArea = intersectionX*intersectionY;

        if(intersectionY<width1 && intersectionX<length1 || rect1Xll < Xbound1 && rect1Xur > Xbound2 || rect1Yll < Ybound1 && rect1Xur > Ybound2){
            answer = area1;
        }else if(intersectionArea > 0){
            answer = area1 - intersectionArea;
        }else{
            answer = area1;
        }

        pw.print(answer);
        pw.close();

    }
}
