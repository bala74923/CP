package Nov_easy_22;

import java.util.Arrays;
import java.util.Scanner;

public class healthy {
    static Scanner sc;
    static int mod = (int)1e9+7;
    static String yes= "YES";
    static String no = "NO";
    static int int_max = (int)1e9, int_min = -(int)1e9;
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        sc = new Scanner(System.in);
        int test = sc.nextInt();// sc.nextLine();
        for(int i=1;i<=test;i++)
            solution(i);
    }
    static void solution(int caseNo){
        //google kickstart -> System.out.printf("Case #%d: ",caseNo);
        int N = sc.nextInt(),intial = sc.nextInt();
        int[] arr = new int[N];
        int maxEnergy = 0;
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
            maxEnergy+=arr[i];
        }
         memo = new int[N][maxEnergy+intial+1];
        for(int i=0;i<N;i++){
            Arrays.fill(memo[i],-1);
        }
        System.out.println(rec(0,intial,arr));
    }
    static int[][] memo;
    static int rec(int ind,int energy,int[] arr){
        if(ind==arr.length) return energy==0?int_max:0;
        if(energy==0) return int_max;
        if(memo[ind][energy]!=-1)
            return memo[ind][energy];
        int pick = 1+ rec(ind+1,energy+arr[ind],arr);

        int not_pick = rec(ind+1,energy-1,arr);
        //System.out.printf("rec(ind=%d,energy=%d,arr)=%d\n",Math.min(pick,not_pick));
        return  memo[ind][energy]=Math.min(pick,not_pick);
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
