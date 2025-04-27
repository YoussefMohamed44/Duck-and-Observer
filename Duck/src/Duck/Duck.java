package Duck;

public abstract class Duck {
    private SoundBehavior soundBehavior = new Muted();
    private FlyBehavior flyBehavior = new NoFly();

    public void setFly(FlyBehavior ob) {
        flyBehavior = ob;
    }

    public void setSound(SoundBehavior ob) {
        soundBehavior = ob;
    }

    public String performFly() {
        return flyBehavior.fly();
    }

    public String performSound() {
        return soundBehavior.sound();
    }
}