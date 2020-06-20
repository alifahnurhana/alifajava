package learnOOP;

public class Car {
    private String name = "CARS";
    protected String type = "Sports Car";
    public int year = 200;

    public void run() {
        System.out.println("CAR RUN");
    }

    protected void stop() {
        brake();
        System.out.println("CAR STOP");
    }

    // Encapsulation
    private void brake() {
        System.out.println("CAR BRAKE");
    }

    // 1. public
    // 2. protected
    // 3. private

    // function = method
}
