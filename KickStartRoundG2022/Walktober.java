package KickStartRoundG2022;

import java.util.Scanner;

class Solution {
    static Scanner sc;
    static int mod = (int)1e9+7;
    static String yes= "YES";
    static String no = "NO";
    static int int_max = Integer.MAX_VALUE, int_min = Integer.MIN_VALUE;
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        sc = new Scanner(System.in);
        int test = sc.nextInt();sc.nextLine();
        for(int i=1;i<=test;i++)
            solution(i);
    }
    static void solution(int caseNo){
        int  m = sc.nextInt(), n = sc.nextInt(), p = sc.nextInt();
        long res = 0;
        int[] marr = new int[n];
        int[][] in = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int curr = sc.nextInt();
                in[i][j] = curr;
                marr[j] = Math.max(curr,marr[j]);
            }
        }
        for(int day=0;day<n;day++){
            res+= Math.max(marr[day]-in[p-1][day],0);
        }
        System.out.printf("Case #%d: ",caseNo);
        System.out.println(res);
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
