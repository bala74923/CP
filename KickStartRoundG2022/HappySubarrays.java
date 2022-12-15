package KickStartRoundG2022;

import java.util.Scanner;

class Solution{
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
        int N = sc.nextInt() ;
        int[] arr = getIntegerArray(N);
        long res = 0 , sum =0;
        int pre =0;
        for(int i=0;i<=N;i++){
            if(i==N ||  sum+arr[i]<0){ // stop condition
                long val = sum;
                while(pre<N && pre<=i){
                    val-=arr[pre];
                    if(pre==N-1 || arr[pre+1]>=0) res+=val; //else we cannot exclude current element
                    // as the next element is negative
                    pre++;
                }
                sum = 0;
            }
            else{
                sum+= arr[i];
                res+= arr[i];
            }
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