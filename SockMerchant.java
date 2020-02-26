package hackerRank;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {
    public static void main(String[] args) {
        int[] socks = new int[]{4, 5, 5, 5, 6, 6, 4, 1, 4, 4, 3, 6, 6, 3, 6, 1, 4, 5, 5, 5};
        int sockPairs = 0;
        HashMap<Integer,Integer> sockRack = new HashMap<>();
        for(int i=0;i<socks.length;i++) {
            if (sockRack.isEmpty()) {
                sockRack.put(socks[i],1);
            }
            else{
                Integer value = sockRack.get(socks[i]);
                if(value != null){
                    sockRack.put(socks[i],++value);
                }
                else{
                    sockRack.put(socks[i],1);
                }
            }
        }

        sockRack.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v));

        for(Map.Entry<Integer,Integer> sockRow: sockRack.entrySet()){
            int sockCount = sockRow.getValue();
            if(sockCount >=2){
                sockPairs+= sockCount/2;
            }
        }

        System.out.println("Valid sock pairs are: "+sockPairs);

    }
}
