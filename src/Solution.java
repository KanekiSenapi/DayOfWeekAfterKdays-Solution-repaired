
import java.util.Arrays;
import java.util.List;

public class Solution {
    private final static List<String> DAYS = Arrays.asList("Mon","Tue","Wed","Thu","Fri","Sat","Sun");
    private final static int days = 7;

    public static String solution(String d, int k){
        if(k%7==0)
            return d;
        k%=7;
        int day = DAYS.indexOf(d);
        int toJump = days - day;
        if(toJump <= k)
            return solution("Mon", k - toJump);
        else
            return DAYS.get(day+k);

    }

}
