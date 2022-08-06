import javax.print.attribute.IntegerSyntax;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bucket_List {
    public static void main(String[] args) throws IOException{
        ArrayList<Integer> pairs1 = new ArrayList<Integer>();
        ArrayList<Integer> pairs2 = new ArrayList<Integer>();
        ArrayList<Integer> buckets = new ArrayList<Integer>();
        Scanner sc = new Scanner(new FileReader("blist.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("blist.out")));
        int bucketsNeeded = 0;
        int maxBuckets = 0;
        int N = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i<N; i++){
            pairs1.add(sc.nextInt());
            pairs2.add(sc.nextInt());
            buckets.add(sc.nextInt());
        }
        for(int j = 0; j< Collections.max(pairs2); j++){
            bucketsNeeded = 0;
            for(int x = 0; x<N; x++){
                if(j+1>=pairs1.get(x) && j+1<=pairs2.get(x)){
                    bucketsNeeded += buckets.get(x);
                }
            }
            maxBuckets = Math.max(maxBuckets, bucketsNeeded);
        }
        pw.println(maxBuckets);
        pw.close();

    }
    static class Pair {
        int first;
        int second;
        public Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }


}
