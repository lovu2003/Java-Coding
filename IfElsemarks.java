public class IfElsemarks {
        public static void main (String args[]) {
            int rollnumber [] = { 111,222,333,4444 };
            int marks [] = { 81,75,43,58};
            for (int i= 0; i< rollnumber.length; i++)
            {
                if (marks[i]> 79)
                System.out.println (rollnumber[i] + " Honours");
                else if ( marks[i] >59)
                System.out.println( rollnumber[i] + " I Division");
    
                else if (marks[i]>49)
                System.out.println( rollnumber[i] + " II Division");
    
                else 
                System.out.println(rollnumber[i] + "FAIL");
    
            }
        }
        
    }
    
    

