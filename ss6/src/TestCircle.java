public class TestCircle {
    public static void main(String[] args) {
        // Khai báo và xây dựng một thể hiện của lớp Circle được gọi là c1
        Circle1 c1 = new Circle1(2.0, "blue");
        System.out.println("The radius is:" + c1.getRadius());
        System.out.println("The color is:" + c1.getColor());
        System.out.printf("The area is: %.2f%n", + c1.getArea()); // toán tử dấu chấm

        Circle1 c2 = new Circle1(2.0);
        System.out.println("The radius is:" + c2.getRadius());
        System.out.println("The color is:" + c2.getColor());
        System.out.printf("The area is: %.2f%n", + c2.getArea());


        Circle1 c3 = new Circle1();
        System.out.println("The radius is:" + c3.getRadius());
        System.out.println("The color is:" + c3.getColor());
        System.out.printf("The area is: %.2f%n", + c3.getArea());

    }
}

