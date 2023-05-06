import java.util.*;
public class Workingdays {
    enum Days
    {
        Sunday,
        monday,
        Tuesday,
        Wednesday,
        Thurstday,
        Friday,
        Saturday
    }
    public static void main(String[] args)
    {
        for(Days d : Days.values())
        {
            Weekend(d);
        }

    }
    private static void Weekend(Days d)
    {
        if(d.equals(Days.Sunday))
        System.out.println("value = " + d+ " is a Holiday" );
        else 
        System.out.println("value= "+ d+ "is a Working day");

    }
    
}
