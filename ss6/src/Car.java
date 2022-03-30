public class Car {

    String plateNumber;
    int speed;
    int x;
    int y;

    public Car() {
        plateNumber = "Linh";
        x = 0;
        y = 0;
        speed = 0;
    }
    public void move() {
        plateNumber = "move";
        x = 12;
        y = 16;
        speed = 20;
    }
    public void park() {
        plateNumber = "park";
        x = 13;
        y = 17;
        speed = 21;
    }
    public void accelerate() {
        plateNumber= "accelerate";
        x = 10;
        y = 20;
        speed = 30;
    }
}
