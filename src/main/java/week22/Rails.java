package week22;

import com.sun.net.httpserver.Authenticator;
import week19.TaskCondition;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Rails {
    /**
     * The local tradition is that every train arriving from the direction A continues in the direction B with coaches reorganized in some way. Assume that the train arriving from the direction A has n ≤ 1000 coaches numbered in increasing order 1, 2, ..., n. The chief for train reorganizations must know whether it is possible to marshal coaches continuing in the direction B so that their order will be a[1], a[2], ..., a[n]. Help him and write a program that decides whether it is possible to get the required order of coaches. You can assume that single coaches can be disconnected from the train before they enter the station and that they can move themselves until they are on the track in the direction B. You can also suppose that at any time there can be located as many coaches as necessary in the station. But once a coach has entered the station it cannot return to the track in the direction A and also once it has left the station in the direction B it cannot return back to the station.
     * <p>
     * Input
     * Consists of blocks of lines. Each block except the last describes one train and possibly more requirements for its reorganization. In the first line of the block there is an integer n described above. In each of the next lines of the block there is a permutation of 1, 2, ..., n. The last line of the block contains just 0.
     * <p>
     * The last block consists of just one line containing 0.
     * <p>
     * Output
     * The output file contains the lines corresponding to the lines with permutations in the input file. A line of the output contains Yes if it is possible to marshal the coaches in the order required on the corresponding line of the input file. Otherwise it contains No. In addition, there is one empty line after the lines corresponding to one block of the input file. There is no line in the output corresponding to the last "null" block.
     * <p>
     * Examples
     * Input #1
     * 5
     * 1 2 3 4 5
     * 5 4 1 2 3
     * 0
     * 6
     * 6 5 4 3 2 1
     * 0
     * 0
     */


    public void run(InputReader in, PrintWriter out) {
        while (true) {
            int n = in.nextInt();
            if(n == 0) break;

            while(true){
                int x = in.nextInt();
                if(x == 0) break;;

                int current = 1;
                boolean success = true;
                Stack<Integer> s = new Stack<>();

                for(int i = 2; i <n ;i++ ){
                    if(success){
                        for(; current <=x; current++){
                            s.push(current);
                        }
                        if(s.peek() != x){
                            success = false;
                        }else{
                            s.pop();
                        }
                    }
                    x= in.nextInt();
                }
                System.out.println(success? "Yes" : "No");
            }
        }

    }

    public static class InputReader {

        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Rails rails = new Rails();
        rails.run(in, out);
        out.close();
    }
}
