
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


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

}