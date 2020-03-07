public class Cat {
    private static int COUNT = 0;
    private final double MIN_WEIGHT = 1000.0;
    private final double MAX_WEIGHT = 9000.0;
    private final byte EYES = 2;
    private double originWeight;
    private double weight;
    private Color color;
    private double eaten;

    public Cat() {
        this(1500.0 + 3000.0 * Math.random());
    }

    public Cat(Double weight) {
        this.weight = weight;
        originWeight = weight;
        COUNT++;
        checkAlive();

    }

    public Cat(double originWeight, double weight, Color color, double eaten) {
        this.originWeight = originWeight;
        this.weight = weight;
        this.color = color;
        this.eaten = eaten;
    }

    public static int getCount() {
        return COUNT;
    }

    public double getOriginWeight() {
        return originWeight;
    }

    public Double getWeight() {
        return weight;
    }

    public double getEaten() {
        return eaten;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void meow() {
        weight = weight - 1;
        System.out.println("Meow");
        checkAlive();

    }

    public void drink(Double amount) {
        if (!isAlive()) {
            return;
        }
        weight = weight + amount;
        checkAlive();
    }

    public void feed(Double amount) {
        if (!isAlive()) {
            return;
        }
        weight = weight + amount;
        eaten += amount;
        checkAlive();
    }

    public void pee() {
        if (!isAlive()) {
            return;
        }
        weight -= 1;
        System.out.println("I've peed!");
        checkAlive();
    }

    public String getStatus() {
        if (weight < MIN_WEIGHT) {
            return "Dead";
        } else if (weight > MAX_WEIGHT) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    public boolean isAlive() {
        return (getStatus().equals("Playing") || getStatus().equals("Sleeping"));
    }

    public void checkAlive() {
        if (!isAlive()) {
            COUNT--;
        }
    }
}