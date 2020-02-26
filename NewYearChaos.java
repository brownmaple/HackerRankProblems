package hackerRank;

public class NewYearChaos {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 3, 7, 8, 6, 4}; // {1,2,4,5,3}
        int bribes = 0;
        for(int i=a.length-1;i>=0;i--){
            if(a[i]!=i+1){
                if(a[i-1]==i+1){
                    bribes+=1;
                    swap(a,i-1, i);
                }
               else if(a[i-2]==i+1){
                    bribes+=2;
                    swap(a,i-2,i-1);
                    swap(a,i-1,i);
                }
                else {
                    System.out.println("Too Chaotic");
                    return;
                }
            }
        }
        System.out.println("total bribes "+bribes);
    }

    public static void swap(int[] arr, int src, int dest){
        int temp = arr[src];
        arr[src] = arr[dest];
        arr[dest] = temp;
    }
}
