public class Rectangle {
    int length,width; //Declaration of variable 

    void getData(int x, int y) // Definition methd
    {
        length= x;
        width = y;
  

    }
    int rectArea()   //Definition of another class 
    {
        int area =length*width;
        return(area);
    }
    class RectArea // class with main method
    {
        public static void main (String args[])
        {
            int area1,area2;
            Rectangle rect1= new Rectangle(); //creating object 
            Rectangle rect2 = new Rectangle ();

            rect1.length = 15; //Accessing variable 
            rect1.width = 10;
            area1=rect1.length*rect1.width;
            rect2.getData(20,12); //Accessing method
            area2= rect2.rectArea();

            System.out.println("Area1 = "+area1);
            System.out.println("Area2 =" +area2);
        }
    }
    
}
