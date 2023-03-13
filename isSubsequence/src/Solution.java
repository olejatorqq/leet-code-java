import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static boolean isSubsequence(String s, String t) {
        boolean flag = false;

        String[] arr_s = s.split("");
        int letter = 0;
        for (int i = 0; i < s.length(); i++){

            if (t.contains(arr_s[i])){
                t = t.substring(t.indexOf(arr_s[i]) + 1);
            } else {
                return flag;
            }
        }

//        System.out.println(Arrays.toString(arr_index));

        return !flag;
    }
}
