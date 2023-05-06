interface Area //interface defined
{
    final static float pi=3.17F;
    float compute(float x,float y);
}
class Rectangle implements Area // interface implementatin
{
    public float compute(float x,float y)
{
    return(x*y);
}

}
class Circle implements Area // another implementatin
{
    public float compute(float x, float y)
    {
        return(pi*x*x);
    }

}
public class InterfaceTest {
    public static void main(String args[ ])

    {
        Rectangle rect = new Rectangle();
        Circle cir = new Circle();
        Area area; // interface object
        area = rect; // area refers for rectasngle 
        System.out.println("Area of Reactangle= " +area.compute(10,20));

        area = cir; //area refer for circle 
        System.out.println("Area of Circle = " +area.compute(10,0));
    }
    
}
