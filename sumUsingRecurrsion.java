package Java_2K23.DSA;

public class sumUsingRecurrsion {
    public static void PrintSum(int i, int n, int sum) {
        // just wanting sum till 5

        if (n == i) { // base condition // 5==1 no.
            sum = sum + i;// 10=10+5=>15
            System.out.print(sum);
            return;
        }
        sum = sum + i; // 0=0+1 = 1.3.6.10. 4 times
        PrintSum(i + 1, 5, sum);
    }
        public static void main (String[]args){
            PrintSum(1, 5, 0);
        }
    }

