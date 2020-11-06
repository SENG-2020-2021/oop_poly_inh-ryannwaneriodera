import java.util.Scanner;
//Complete this program that the user will be able to choose the quadilateral it wants to calculate its perimeter and area

class Main {
  public static void main(String[] args) {
   char quad; //Declare a char to store the chosen quadilateral
Scanner sc=new Scanner(System.in);
Scanner scan = new Scanner(System.in);
   System.out.println("1.rhombus\n2.square\n3.trapezoid\n4.rectangle\n5.parallelogram");
   System.out.print("enter choice:");
   quad=sc.next().charAt(0);
    
    
    
    
    
    
    switch(quad){
       case '1':  
	   System.out.println("Calculation for a Rhombus");
       System.out.println("Input first side");
      float a = scan.nextFloat();
      System.out.println("Input second side");
      float b = scan.nextFloat();
      System.out.println("Input third side");
      float c = scan.nextFloat();
      System.out.println("Input fourth side");
      float d = scan.nextFloat();
         System.out.println("Input first diagonal");
      float d1 = scan.nextFloat();
         System.out.println("Input second diagonal");
      float d2 = scan.nextFloat();
      Rhombus r = new Rhombus(a, b, c, d,d1,d2);
      System.out.printf("The perimeter of the rhombus with First Side: %.2f, Second Side: %.2f, Third Side: %.2f, Fourth Side: %.2f,first diagonal %.2f and second diagonal %.2f is %.2f", a, b, c, d, d1, d2, r.calculatePerimeter()); 
       System.out.println("");
       System.out.printf("The area of the rhombus with First Side: %.2f, Second Side: %.2f, Third Side: %.2f, Fourth Side: %.2f,first diagonal %.2f and second diagonal %.2f is %.2f", a, b, c, d, d1, d2, r.area()); 
      break;

      case '2': System.out.println("Calculation for a square");
       System.out.println("Input one side");
      float ab = scan.nextFloat();
           Square n = new Square(ab);
      System.out.printf("The perimeter of the square with  Side: %.2f is %.2f", ab, n.calculatePerimeter()); 
       System.out.println("");
       System.out.printf("The area of the square with Side: %.2f is %.2f", ab, n.area()); 
      break;

      case '3':
     System.out.println("Calculation for a Trapezoid");
     System.out.println("Input length of first slant");
     float a1 = scan.nextFloat();
     System.out.println("Input length of second slant");
     float b1 = scan.nextFloat();
     System.out.println("Input length of top side");
     float c1 = scan.nextFloat();
     System.out.println("Input length of base side");
     float d3 = scan.nextFloat();
      System.out.println("Input height");
     float e = scan.nextFloat();
     Trapezoid t = new Trapezoid(a1, b1, c1, d3,e);
    System.out.printf("The perimeter of the Trapezoid with First Side: %.2f, Second Side: %.2f, Third Side: %.2f, and Fourth Side: %.2f is %.2f", a1, b1, c1, d3, t.calculatePerimeter()); 
    System.out.println("");
      System.out.printf("The area of the Trapezoid with First Side: %.2f, Second Side: %.2f, Third Side: %.2f, and Fourth Side: %.2f is %.2f", a1, b1, c1, d3, t.area()); 
      break;

      case '4': System.out.println("Calculation for a rectangle");
       System.out.println("Input length");
      float a2 = scan.nextFloat();
        System.out.println("Input breadth");
      float b2 = scan.nextFloat();
           Rectangle re = new Rectangle(a2,b2);
      System.out.printf("The perimeter of the rectangle with  length: %.2f and breadth %.2f is %.2f", a2,b2, re.calculatePerimeter()); 
       System.out.println("");
       System.out.printf("The area of the rectangle with length: %.2f and breadth %.2f is %.2f", a2,b2, re.area()); 
      break;

      case '5': System.out.println("This program calculates the area and perimeter of the parallelogram.");
    System.out.println("Input the base of your Parallelogram");
    
    float pBase = scan.nextFloat();
    System.out.println("Input the height of your Parallelogram");
    float pHeight = scan.nextFloat();
    Parallelogram p = new Parallelogram(pBase, pHeight);
    
    Quadilateral q = p;

  
    System.out.println("Input the dimension of the first pair of your Parallelogram");
    q.setLength(scan.nextFloat());
    System.out.println("Input the second pair of your Parallelogram");

    q.setBreadth(scan.nextFloat());
    
    System.out.printf("The area of the parallelogram with base %.2f and height %.2f is %.2f", pBase, pHeight, p.area());

    System.out.println("");
    System.out.printf("The perimeter of the parallelogram with First Pair: %.2f and SecondPair: %.2f is %.2f", q.getLength(), q.getBreadth(), q.calculatePerimeter());
    System.out.println("");
    System.out.println("");
    System.out.println("");
      break;
	  
	  default: System.out.println("this is not a valid input");
    }
    
    
    
    
    
    
    
    
    
    //using a switch check what the user selected and use it to calculate the perimeter and area of the desired quadilateral

    //this should be in the parallelogram case
   


  }
}

//Create class for Rhombus
 class Rhombus extends Quadilateral{
  private float side1;
  private float side2;
  private float side3;
  private float side4;
  private float diag1;
  private float diag2;

  public Rhombus(float s1,float s2,float s3,float s4,float d1,float d2){
   side1=s1;
   side2=s2;
   side3=s3;
   side4=s4;
   diag1=d1;
   diag2=d2;
  }
    public float calculatePerimeter(){
    return side1+side2+side3+side4;
  }
    public float area(){
    return (diag1*diag2)/2;
  }


}

//Create class for square
class Square extends Quadilateral{
   private float side1;

public Square(float s1){
    if (s1 <= 0){
      System.out.println("You cannot have a negative or zero base. Therfore base returns to default which is 1");
      s1 = 1;
    }
    else
      side1 = s1;
}
    
    public float calculatePerimeter(){
    return 4*side1;
  }
    public float area(){
    return side1*side1;
  }

}



//create class for Rectangle
class Rectangle extends Quadilateral{
  private float length;
  private float breadth;

  public Rectangle(float l,float b){
    length=l;
    breadth=b;
  }

    public float area(){
    return length*breadth;
  }

    public float calculatePerimeter(){
    return 2*(length+breadth);
  }
}

class Trapezoid extends Quadilateral{
  private float side1;
  private float side2;
  private float side3;
  private float side4;
  private float side5;
  public Trapezoid (float a, float b, float c, float d,float e){
    side1 = a;
    side2 = b;
    side3 = c;
    side4 = d;
    side5 = e;
  }

  public float calculatePerimeter(){
    return side1+side2+side3+side4;
  }

  public float area(){
    return ((side3+side4)/2)*side5;
  }

}
class Parallelogram extends Quadilateral{
  private float base;
  private float height;
  public Parallelogram (float b, float h){
    if (b <= 0){
      System.out.println("You cannot have a negative or zero base. Therfore base returns to default which is 1");
      base = 1;
    }
    else
      base = b;
    if (h <= 0){
      System.out.println("You cannot have a negative or zero height. Therfore height returns to default which is 1");
      height = 1;
    }
    else
      height = h;
  }
  public float area(){
    return base*height;
  }

}
class Quadilateral {
  private float length;
  private float breadth;

  public void setLength(float l){
    this.length = l;
  }

  public float getLength(){
    return this.length;
  }

  public void setBreadth(float b){
    this.breadth = b;
  }

  public float getBreadth(){
    return this.breadth;
  }

  public float calculatePerimeter(){
    return 2*(this.length+this.breadth);
  }
}