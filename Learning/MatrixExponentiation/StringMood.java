package Learning.MatrixExponentiation;

import java.util.Scanner;

public class StringMood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        memo = new int[times+1][2];
        for(int i=0;i<=times;i++) memo[i][0] = memo[i][1]= -1;
        System.out.println(rec(times,1));
    }
    static int mod = (int)Math.pow(10,9)+7;
    static int[][] memo ;
    static int rec(int times,int state){
        if(times==0){
            return state;
        }
        if(memo[times][state]!=-1) return memo[times][state];
        int sum = 0;
        for(char c = 'a';c<='z';++c){
            int curr = c=='h'?1: ("aeiou".indexOf(c)!=-1)?
                    (state+1)%2:c=='s'||c=='d'?0: state;
            sum= sum%mod + rec(times-1,curr)%mod ;
           // System.out.println(c+"->"+curr);
        }
        return memo[times][state] = sum%mod;
    }
}
