package div3_828;

import java.util.Scanner;

public class Traffic_Light {
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
        char curr = sc.next().charAt(0);
        char[] arr= sc.next().repeat(2).toCharArray();
        int lastFound=2*N;
        long maxi = -1;
        for(int i=2*N-1;i>=0;i--){
            if(arr[i]=='g') lastFound = i;
            if(i<=N-1 && arr[i]==curr) maxi = Math.max(maxi,lastFound-i);
        }
        System.out.println(maxi);
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
}
