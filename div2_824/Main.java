package div2_824;

import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        sc = new Scanner(System.in);
        int test = sc.nextInt();sc.nextLine();
        while(test-->0){
            // return solution method
            workingWeek();
        }
    }
    static void workingWeek(){
        long n = sc.nextLong(), max =0;
//        long ptr = 4;
//        long prev = Integer.MIN_VALUE;
//
//        long mid = (n-3)/3;
//        for(int i=-1;i<=1;i++){
//            ptr = mid+i;
//            System.out.println(ptr);
//            if(ptr<n-1){
//                long w1 = 1, w2 = ptr-3, w3 = n-ptr-1;
//                long l1 = Math.abs(w1-w2), l2 = Math.abs(w1-w3),l3 = Math.abs(w2-w3);
//                long curr = Math.min(l1,Math.min(l2,l3));
//                max = Math.max(max,curr);
//            }
//        }

//        while(ptr<n-1){
//              long w1 = 1, w2 = ptr-3, w3 = n-ptr-1;
//              long l1 = Math.abs(w1-w2), l2 = Math.abs(w1-w3),l3 = Math.abs(w2-w3);
//            long curr = Math.min(l1,Math.min(l2,l3));
//              max = Math.max(max,curr);
//              if(prev>curr) break;
//              else prev =curr;
//              ptr++;
//        }
        //System.out.println("ptr ="+ptr);
        System.out.println(((n-3)/3)-1);
    }

}

