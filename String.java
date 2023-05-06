import java.lang.annotation.*;
import java. lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME);
@interface MyString
{
    int value();
}
public class String {
    @MyString(100)
    public static void myMeth()
    {
        String ob = new String();
        try{
            Method m = ob.getClass().getMethod("myMeth");
            MyString anno = m.getAnnotation(MyString.class) ;
            System.out.println("The value is: " anno.value());
        }
        catch(NoSuchMethodException exc)
        {
            System.out.println("Method Not Found.");
        }
    }
    public static void main(String args[])
{
    myMeth();
}
    
}
