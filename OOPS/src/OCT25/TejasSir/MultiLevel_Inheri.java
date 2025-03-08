package OCT25.TejasSir;

class Shape{
    public void Area(){
        System.out.print("Area");
    }
    public void peri(){
        System.out.print("Perimeter");
    }
    public void out(){
        System.out.print("Perimeter");
    }
}
class Triangle extends Shape{

    int base;
    int height;
    Triangle(int base,int height){
        this.base=base;
        this.height=height;
    }
    public void Area(){
        System.out.print("\nArea of triangle is: "+0.5*base*height);
    }
    public void peri(){
        System.out.print("\nPerimeter of triangle is: "+(base+height+height));
    }
}

class rectangle extends Shape{
    int length;
    int width;
    rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    public void Area(){
        System.out.print("\nArea of triangle is: "+length*width);
    }
    public void peri(){
        System.out.print("\nPerimeter of triangle is: "+2*(length+width));
    }
}
class circle1 extends Shape{
    int radius;
    circle1(int radius){
        this.radius=radius;
    }
    public void Area(){
        System.out.print("\nArea of Circle is: "+3.14*radius*radius);
    }
    public void peri(){
        System.out.print("\nPerimeter of Circle is: "+2*radius*3.14);
    }
}
public class MultiLevel_Inheri {
    public static void main(String[] args) {
        Triangle ob =  new Triangle(20,30);
        ob.Area();
        ob.peri();
        rectangle ob1 = new rectangle(10,20);
        ob1.Area();
        ob1.peri();
        circle1 ob2 = new circle1(4);
        ob2.Area();
        ob2.peri();
    }
}
