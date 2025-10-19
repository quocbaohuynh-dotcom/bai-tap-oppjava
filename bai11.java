public class bai11 {
     private double radius;
   private String color;
   
  
   public bai11() {  
      radius = 1.0;
      color = "red";
   }
   
  
   public bai11(double r) {
      radius = r;
      color = "red";
   }
   
  
   public double getRadius() {
     return radius; 
   }
   
   
   public double getArea() {
      return radius*radius*Math.PI;
   }
}