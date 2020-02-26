package com.brownmaple.expjava.HackerRank;

public class CountingValleys {
    public static void main(String[] args) {
        int osl = 0; int nsl =0;
        int valleyCount = 0;
        String path = "UDDDUDUU";
        char[] pathArray = path.toCharArray();
        for (int i=0;i<pathArray.length;i++){
            int rep;
            if(pathArray[i]=='U')
                rep = 1;
            else rep = -1;
            nsl += rep;
            if((osl==nsl)&&(rep==1)){
                valleyCount++;
            }
        }

        System.out.println("No of valleys crossed is: "+valleyCount);
    }
}
