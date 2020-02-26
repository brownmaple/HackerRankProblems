package hackerRank;

public class TwoDArrayDS {
    public static void main(String[] args) {
        int[][] a = new int[][]{{-1, -1, 0, -9, -2, -2}, {-2, -1, -6, -8, -2, -5}, {-1, -1, -1, -2, -3, -4}, {-1, -9, -2, -4, -4, -5}, {-7, -3, -3, -2, -9, -9}, {-1, -3, -1, -2, -4, -5}};
        int max = 0;
        int out = 0;

        for (int i = 0; i+2 < a.length; i++) {
            System.out.println(" ");
                for (int j = 0; j+2 < a.length; j++) {
                    int topBowl = 0;
                    int botBowl = 0;
                    int vein = 0;
                    int total;
                        topBowl += a[i][j];
                        topBowl += a[i][j + 1];
                        topBowl += a[i][j + 2];
                        vein += a[i + 1][j + 1];
                        botBowl += a[i + 2][j];
                        botBowl += a[i + 2][j + 1];
                        botBowl += a[i + 2][j + 2];
                       total = topBowl + botBowl + vein;

                    if(out == 0){
                        max += total;
                        out++;
                    }
                    else if(total>max){
                        max = total;
                    }
                }
        }

        System.out.println("max is "+max);
    }
}
