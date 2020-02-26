package hackerRank;

public class ArrayLeftRotation {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int rots = 4;
        int maxIndex = a.length - 1;
        int temp;
        for(int i=0;i<rots;i++) {
            temp = a[0];
            for (int j = 0; j < maxIndex; j++) {
                a[j] = a[j+1];
            }
            a[maxIndex] = temp;
        }
        System.out.println("displaying array contents");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
