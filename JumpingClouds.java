package hackerRank;

public class JumpingClouds {
    public static void main(String[] args) {
        int[] clouds = {0, 0, 1, 0, 0, 1, 0};
        int totalJumps = 0;
        for(int i=0;i<clouds.length;) {

            if (i + 2 < clouds.length) {
                if (clouds[i + 2] != 1) {
                    totalJumps += 1;
                    i += 2;
                }
                else if (clouds[i + 1] != 1){
                    totalJumps += 1;
                    i += 1;
                }
                }
            else if ((i + 1 < clouds.length)) {
                totalJumps += 1;
                i += 1;
            }
            else
                 break;

        }

        System.out.println("minimum jumps reqd: "+totalJumps);
    }
}
