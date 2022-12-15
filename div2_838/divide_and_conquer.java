package div2_838;

import java.util.Scanner;

public class divide_and_conquer {
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
        int N = sc.nextInt();
        int[] arr = getIntegerArray(N);
        long res =0;
        for(int n: arr)
            res+=n;

        if(res%2==0)
            System.out.println(0);
        else{
            int min = int_max;
            for(int val: arr){
                int last = (val&1)^1; // opposite of last bit
                int ind = 0;
                while((1<<ind)<=val){
                    //System.out.println((1<<ind)+" for val="+val+" last  ="+last);
                    int bit = ((1<<ind)&val)!=0?1:0;
                    if(bit==last){
                        //System.out.println("found at"+ind+" for val = "+val);
                        break;
                    }
                    ind++;
                }
                min = Math.min(min,ind);
            }
            System.out.println(min);
        }
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
