import java.io.*;
import java.security.Principal;
public class Invest {
    public static void main(String args[])
    {
        Float PrincipalAmount = new Float(0);
        Float interestRate = new Float(0);
        int numYears = 0;
        try
        {
            DataInputStream in = new DataInputStream(System.in);
            System.out.print("Enter Principle Amount :");
            System.out.flush();
            String principalString = in.readLine();
            PrincipalAmount = Float.valueOf(principalString);
            System.out.print("Enter interest Rate :");
            System.out.flush();
            String intereString = in.readLine();
            interestRate = Float.valueOf(intereString);
            System.out.print("Enter number of years :");
            System.out.flush();
            String yearsString = in.readLine();
            numYears = Integer.parseInt(yearsString);
            


            

        }
        catch (IOException e)
        {
            System.out.println("I/O Error");
            System.exit(1);
        }
        float value = loan(PrincipalAmount.floatValue(),interestRate.floatValue(), numYears);
        printline();
        System.out.println("Final Value ="+value);
        printline();

    }
    static float loan (float p,float r,int n)
    {
        int year = 1;
        float sum = p;
        while (year <=n)
        {
            sum = sum*(1+r);
            year = year +1;
        }
        return sum;
    }
    static void printline()
    {
        for(int i=1; i<=30; i++)
        {
            System.out.print("=");
        }
        System.out.println(" ");
    }
    
}
