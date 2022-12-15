package Template;

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
        //google kickstart -> System.out.printf("Case #%d: ",caseNo);
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
    static boolean isOdd(int n){
        return (n&1)==1;
    }
    static boolean isEven(int n){
        return (n&1)==0;
    }
    static long fact(int n){
        return n*fact(n-1);
    }
    static long gcd(long a,long b){ // a is big
        if(b==0) return a;
        return gcd(b,a%b);
    }
    static long lcm(long a,long b){
        return (a*b)/gcd(a,b);
    }
}