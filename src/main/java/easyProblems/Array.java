package easyProblems;

public class Array {
    public static void main(String[] args) {
          Array.strStr("hello", "ll");
    }

    public static int strStr(String haystack, String needle) {

        for(int i = 0; i < haystack.length(); i++){
            int count = i;

            for(int j = 0 ; j < needle.length(); j++){
                if(needle.charAt(j) == haystack.charAt(count)){
                    count++;
                }
            }

            if(count == needle.length()){
                return i;
            }
        }

        return -1;

    }


}
