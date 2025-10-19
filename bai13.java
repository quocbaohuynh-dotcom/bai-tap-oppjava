public class bai13 {
     private float length;
    private float width;

  
    public bai13() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

 
    public bai13(float length, float width) {
        this.length = length;
        this.width = width;
    }

  
    public float getLength() {
        return length;
    }

    
    public void setLength(float length) {
        this.length = length;
    }

    
    public float getWidth() {
        return width;
    }

   
    public void setWidth(float width) {
        this.width = width;
    }


    public float getArea() {
        return length * width;
    }


    public float getPerimeter() {
        return 2 * (length + width);
    }

  
    @Override
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }
}
