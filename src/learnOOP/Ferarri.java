package learnOOP;
//inheritance
public class Ferarri extends Car {
    public void race() {
        // access ferrari run
        this.run();
    }

    // Polymorphism
    @Override
    public void run() {
        super.run();
        System.out.println("FERRARI");
    }
}
