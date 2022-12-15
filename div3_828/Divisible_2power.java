package div3_828;

import java.util.Scanner;

public class Divisible_2power {
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
    //TLE
    static void solution(int caseNo){
        int N = sc.nextInt();
        long prod = 1L, total = (long)Math.pow(2,N);
        for(int i=1;i<=N;i++) prod*=sc.nextInt();
       // long need = total/gcd(prod,total);
        long need = total/get2FactorSeparately(prod);
        long res =0;
        //System.out.println(need);
        for(int ind=N;ind>1 && need>1;ind--){
            if(need%ind==0){
                res++;
                need/=ind;
            }
            //System.out.println(ind+" is the ind");
        }
        System.out.println(need!=1?-1:res);
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
    static long get2FactorSeparately(long a){
        long res =1;
        while(a%2==0){
            res<<=1;
            a>>=1;
        }
        return res;
    }
    static long lcm(long a,long b){
        return (a*b)/gcd(a,b);
    }
}
