package hackerrank.xylemraj.mmt.hackerrank.ninjacodehiring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class NumberConversion {


    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter wr = new PrintWriter(System.out);
//        int T = Integer.parseInt(br.readLine().trim());
//        for(int t_i=0; t_i<T; t_i++)
//        {
//            int n = Integer.parseInt(br.readLine().trim());
//            String[] arr_A = br.readLine().split(" ");
//            int[] A = new int[n];
//            for(int i_A=0; i_A<arr_A.length; i_A++)
//            {
//                A[i_A] = Integer.parseInt(arr_A[i_A]);
//            }
//            String[] arr_P = br.readLine().split(" ");
//            int[] P = new int[n];
//            for(int i_P=0; i_P<arr_P.length; i_P++)
//            {
//                P[i_P] = Integer.parseInt(arr_P[i_P]);
//            }
//            String[] arr_Q = br.readLine().split(" ");
//            int[] Q = new int[n];
//            for(int i_Q=0; i_Q<arr_Q.length; i_Q++)
//            {
//                Q[i_Q] = Integer.parseInt(arr_Q[i_Q]);
//            }
//
//            long out_ = solve(A, P, Q);
//            System.out.println(out_);
//        }

//        wr.close();
//        br.close();

        solve(new int[]{5,8,9}, new int[]{1,1,1}, new int[]{2,3,5});
    }

    //5 8 9
    //1 1 1
    //2 3 5
    static long solve(int[] A, int[] P, int[] Q){

        int a_length = A.length;
        List<Integer> sum = new ArrayList<>();
        List<Integer> diff = new ArrayList<>();

        ArrayList<HashMap<Integer,Integer>> mapArrayList = new ArrayList<>();

        for (int i = 0; i < a_length; i++) {

            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int j = 0; j <= P[i]; j++) {
                hashMap.put(j, A[i] + j);
            }
            mapArrayList.add(hashMap);
//            for (int j = 0; j <= Q[i] ; j++) {
//                diff.add( A[i] - j );
//            }
        }
        return 10;
    }
}
