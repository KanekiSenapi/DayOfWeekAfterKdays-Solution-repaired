
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class TestDays {

    @Test
    public void Test6Days(){
        String except = "Tue";
        String get = Solution.solution("Wed", 6);
        Assertions.assertEquals(except,get);
    }

    @Test
    public void Test7Days(){
        String except = "Wed";
        String get = Solution.solution("Wed", 7);
        Assertions.assertEquals(except,get);
    }

    @Test
    public void Test8Days(){
        String except = "Mon";
        String get = Solution.solution("Sun", 8);
        Assertions.assertEquals(except,get);
    }

    @Test
    public void Test99Days(){
        String except = "Tue";
        String get = Solution.solution("Mon", 99);
        Assertions.assertEquals(except,get);
    }

    @Test
    public void Test1Days(){
        String except = "Thu";
        String get = Solution.solution("Wed", 1);
        Assertions.assertEquals(except,get);
    }

    @Test
    public void Test5Days(){
        String except = "Wed";
        String get = Solution.solution("Fri", 5);
        Assertions.assertEquals(except,get);
    }

    @Test
    public void Test300DaysEveryDay() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse("01-07-2019"));
        for(int i = 0 ; i< 7 ; i++) {
            String KK = x(c.get(Calendar.DAY_OF_WEEK));
            for (int k = 0; k < 300; k++) {
                String get = Solution.solution(KK, k);
                String exc = x(c.get(Calendar.DAY_OF_WEEK));
                Assertions.assertEquals(exc, get);
                c.set(Calendar.DAY_OF_MONTH, c.get(Calendar.DAY_OF_MONTH) + 1);
            }
        }
    }

    private String x(int k){
        List<String> DAYS = Arrays.asList("0","Sun","Mon","Tue","Wed","Thu","Fri","Sat");
        return DAYS.get(k);
    }

}