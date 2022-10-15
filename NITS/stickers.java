package NITS;

import java.util.Scanner;

public class stickers {
    static Scanner sc;
    static int mod = (int)Math.pow(10,9)+7;
    static String yes= "YES";
    static String no = "NO";
    static int int_max = Integer.MAX_VALUE, int_min = Integer.MIN_VALUE;
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = getIntegerArray(n);
        int go = 0;
        while(true){

        }
    }
    static int[][] memo;
    static int memoize(int[] arr,int tot){
        int N = arr.length;
        memo = new int[N+1][tot+1];
        for(int i=0;i<=N;i++){
            for(int j=0;j<=tot;j++){
                memo[i][j]=-1;
            }
        }
        return rec(N-1,tot,arr);
    }
    static int rec(int ind,int sum,int[] arr){
       if(ind==-1) {
           if(sum==0)
           System.out.println(ind);
           return sum==0?1:0;
       }
        if(memo[ind][sum]!=-1) return memo[ind][sum];
        int pick = 0;
        if(sum>=arr[ind]) pick = rec(arr.length-1,sum-arr[ind],arr);
        int notPick = rec(ind-1,sum,arr);
        return memo[ind][sum] = ((pick%mod)+(notPick%mod))%mod;
    }
    static int[] getIntegerArray(int n){
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    static char[] getCharacterArray(int n){
        String s = sc.next();
        return s.toCharArray();
    }
}
