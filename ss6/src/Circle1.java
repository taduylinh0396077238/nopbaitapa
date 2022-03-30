public class Circle1 {
    // Biến cá thể riêng tư
    private double radius;  // biến
    private String color;
    // Constructors (được nạp chồng)

    public Circle1(){
        radius = 1.0;
        color = "red";
    }
    public Circle1(double r) {
        radius = r;
        color =" red";
    }
    public Circle1(double r, String c) {
        radius = r;
        color = c;
    }

    public double getRadius(){
        return radius;

    }
    public String getColor(){
        return color;

    }
    public double getArea(){
        return radius * radius * Math.PI;
    }

}
