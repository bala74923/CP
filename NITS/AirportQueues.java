package NITS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirportQueues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            int teams = sc.nextInt();
            while(teams-->0){
                int tot = sc.nextInt(),queue = sc.nextInt();
                List<Integer
                        > l1 = new ArrayList<>(),l2 = new ArrayList<>();
                int pmin = Integer.MIN_VALUE, pmax = Integer.MAX_VALUE;
                for(int i=0;i<tot;i++){
                    int curr_position = sc.nextInt();
                    pmin = Math.min(pmin,curr_position);
                    pmax = Math.max(pmax,curr_position);
                }
                List<Integer> curr = queue==1?l1:l2;

            }
        }
    }
}
