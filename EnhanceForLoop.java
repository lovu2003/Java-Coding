import java.util.*;
public class EnhanceForLoop {

    public static void main ( String args[])
    {
        System.out.println();
        String 
        states[] ={ "TamilNadu","AndraPradesh", " UttarPradesh", " Rajasthan" };
        for (int i=0; i<states.length;i++)
        {
            System.out.println("Stander for-loop : state name :" +states[i]);
        }
        System.out.println();
        for( String  i:states)
        {
            System.out.println("Enhance for -loop : stste name : " +1);
        }
         System.out.println();
         ArrayList<String > cities = new ArrayList<String>();
         cities.add("Delhi");
         cities.add("Mumbai");
         cities.add("Calcutta");
         cities.add("Chennai");
         System.out.println();
         for (int i=0; i<cities.size();i++)
         {
            System.out.println("Stander for-loop :citi name :" +cities.get(i));
         }
         System.out.println();
         for (String cxity :cities)
          System.out.println("Enhance for -loop:city name");
          System.out.println();
          System.out.println("In Collections");
          System.out.println();
        
          printcollection(cities);

         
        }
        public static <AnyType> void printcollection (Collection<AnyType>c)
        {
            for (AnyType val : c)
            System.out.println(val);
        }

    }
    

