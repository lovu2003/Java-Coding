public class Rectanhle11 {
    int length, width;
    Rectanhle11 (int x,int y) //Definig constructor
    {
        length = x;
        width = y; 
    }
    
        int rectArea( )
        {
            return (length*width);
        }
    }
    class RectangleArea
    {
        public static void main (String args[])
         {
           Rectanhle11 rect1 =  new Rectanhle11(15,10);
            int area1 = rect1.rectArea();
            System.out.println("Area = " +area1);
        }
    }
    

