// Using super to call superclass constructor

class TwoDShape {
   private double height;
   private double width;

   TwoDShape(double h, double w) {
      height = h;
      width = w;
   }

   double getWidth() { return width; }
   double getHeight() { return height; }
   void setHeight(double h) { height = h; }
   void setWidth(double w) { width = w; }

   void showDim() {
      System.out.println("Width and height are " + width + " and " + height);
   }
}

class Triangle extends TwoDShape {
   private String style;

   Triangle(String s, double h, double w) {
      super(h, w);
      
      style = s;
   }

   double area() {
      return getHeight() * getWidth() / 2;
   }

   void showStyle() {
      System.out.println("Triange is " + style);
   }
}

class Shapes4 {
   public static void main(String args[]) {
      Triangle t1 = new Triangle("filled", 4.0, 8.0);
      Triangle t2 = new Triangle("outlined", 5.0, 12.0);

      System.out.println("Info for t1 ");
      t1.showStyle();
      t1.showDim();
      System.out.println("Triange has area " + t1.area());

      System.out.println();

      System.out.println("Info for t2: ");
      t2.showStyle();
      t2.showDim();
      System.out.println("Area is " + t2.area());
   }
}