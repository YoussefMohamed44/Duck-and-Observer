package Duck;

public class Main {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.setFly(new Fly());
        mallardDuck.setSound(new Quack());
        System.out.println(mallardDuck.performFly());
        System.out.println(mallardDuck.performSound());
    }
}