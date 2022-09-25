package div2_823;


import java.util.Arrays;
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
            minNotation();
        }
    }
    static void minNotation(){
        char[] s = sc.next().toCharArray();
        int[][] arr = new int[s.length][2];
        for(int i=0;i<s.length;i++){
            arr[i][0] =s[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr,(a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
        StringBuilder sb =  new StringBuilder("");
        int maxIndex=-1;
        for(int[] a:arr){
            char c = (char)a[0];
            int index = a[1];
            if(index>maxIndex){
                sb.append(c);
            }else{
                if(c!='9') c = (char)(++c);
                sb.append(c);
            }
            maxIndex = Math.max(index,maxIndex);
        }
        System.out.println(sb.toString());
    }
    static void planet(){
        int n = sc.nextInt(),c = sc.nextInt();
        int[] map = new int[101];
        while(n-->0) map[sc.nextInt()]++;
        int sum = 0;
        for(int i=0;i<=100;i++){
            sum+= Math.min(map[i],c);
        }
        System.out.println(sum);
    }
}

