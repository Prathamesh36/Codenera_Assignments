/*Create a Car class that implements Comparable and compares cars based on their top speed.*/
package JAN3.Que7;

public class car implements Comparable<car>{
    private String car_name;
    private int speed;

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public car(String car_name, int speed) {
        this.car_name = car_name;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "\n{" +
                "car_name='" + car_name + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public int compareTo(car o) {
        return this.speed-o.speed;
    }
}
