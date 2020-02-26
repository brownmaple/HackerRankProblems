package hackerRank;

public class RepeatedString {
    public static void main(String[] args) {
        String s ="a";
        long n = 100000000;
        long quo = n/s.length();
        long rem = n%s.length();
        int aInString =0;
        long res;
        int aInRemStr = 0;
        if(s.length()>1) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a') {
                    aInString++;
                }
            }

            res = aInString * quo;

            if(rem!=0){
                String remStr = s.substring(0,(int)rem);
                for(int i=0;i<remStr.length();i++){
                    if(remStr.charAt(i)=='a'){
                        aInRemStr++;
                    }
                }
            }
            res+= aInRemStr;
            System.out.println("a occurs"+ res+" times");
        }
        else{
            if(s.charAt(0)=='a'){
                System.out.println("a occurs"+ n+" times");
            }
            else
                System.out.println("string doesn't contain a");
        }
        //System.out.println(aInString);
    }
}
