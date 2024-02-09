package Java_2K23.DSA;

public class stackHeightByrecurrsion {
    public static int PrintPow(int x , int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        //kaam
        int xpownm1 = PrintPow(x,n-1); //n= 5.4.3.2.1
        int xpown = x*xpownm1;//x*1. x*2....so on
        return xpown;
    }
    public static void main(String[] args){
        int x=2,n=5;
        int ans = PrintPow(2,5);
        System.out.println(ans);
    }

}
//n=5-2