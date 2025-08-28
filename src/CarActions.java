// In this program we used class, created objects, methods

class Car{
    String name;
    int speed;
    void start(){
        System.out.println(name+" is moving at a speed of "+speed+" kmph");
    }
    void accelerate(int increment){
        speed=speed+increment;
        System.out.println(name+" speed incresed by "+speed+" kmph");
    }
    void brake(int decrement){
        speed=speed-decrement;
        System.out.println(name+" is slowed down beacuse brakes applied. now current speed is "+ speed);
    }
}
public class CarActions{
    public static void main(String[] args){
        Car car1=new Car();
        car1.name="lamborghini";
        car1.speed=100;
        System.out.println();
        Car car2=new Car();
        car2.name="bugatti";
        car2.speed=400;
        car1.start();
        car2.accelerate(200);
        car2.brake(100);

    }
}