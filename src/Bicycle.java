class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    // default constructor when no value is specified
    public Bicycle(){};

    public Bicycle(int cadence, int speed, int gear) {
        this.cadence = cadence;
        this.speed = speed;
        this.gear = gear;
    }

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed += increment;
    }

    void applyBrakes(int decrement) {
        speed -= decrement;
    }

    void printStates() {
        System.out.println(
                "cadence:" + this.cadence + "\n" +
                "speed:" + this.speed + "\n" +
                "gear:" + this.gear + "\n"
        );
    }
}
