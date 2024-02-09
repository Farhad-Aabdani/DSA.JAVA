package Java_2K23.DSA;

public class insertionsortin {
    public static void main(String[] args){

    int[]array ={7,8,3,1,2};
    for(int i=1;i<array.length;i++){
        int current = array[i];//8;3;1;2
        int j=i-1; // j=0.j=1.j=2.j=3.j=4
        while(j>=0 && current<array[j]){ // 8<7 or 7>8no.; 3<8 or 8>3yes;
            array[j+1] = array[j]; //3=8 array[j+1]=8
           j=j-1; // j=0.j=1.j=2.j=3 for while condition
        }
        array[j+1]=current;// 8=8
        }
        System.out.print(array[0]+" "+array[1]+" "+array[2]+" "+array[3]+" "+array[4]);
    }
}
