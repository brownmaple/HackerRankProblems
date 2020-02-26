package hackerRank;

public class MinimumSwaps2 {
    static int swap = 0;
    public static void main(String[] args) {
        int[] a = {2,3,4,1,5};
        int n = a.length;


        for(int i=0;i<n-1;i++){
            if((a[i]!=i+1)){
                for(int j=0;j<n-i-1;j++) {
                    int temp = 0;
                    swap(a, i, i + 1);
                }
            }
        }

        System.out.println("swap count is "+swap);
    }

    public static void swap(int[] a, int from, int to){
        System.out.println("swapping "+from+" and "+to);
        int temp = a[from];
        a[from] = a[to];
        a[to] = temp;
        swap++;
    }
}
