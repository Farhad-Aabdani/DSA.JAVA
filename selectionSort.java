package Java_2K23.DSA;

public class selectionSort {
    public static void main(String[] args){
        int[]arr = {7,8,3,2,1};
        for(int i=0;i< arr.length-1;i++){ // 4 time loop runs
            int smallest =i; // for compare. stores index. smallest =0
            for(int j=i+1;j< arr.length;j++){ // j=1.j<5 = 4TIMES ALSO
                if(arr[smallest]>arr[j]) {// e.g 7>8no. 8>3 yes.
                    smallest=j; // 0=2.
            }
        }
            int temp = arr[smallest]; // temp = 3 at index = 2
            arr[smallest] = arr[i]; // 3=7 =7

            arr[i]=temp; //7=3 = 3.
    }
        for(int i=0;i< arr.length;i++) {
            System.out.print(" "+arr[i]);
        }

    }
}
