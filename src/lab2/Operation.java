package lab2;

public class Operation implements Printable {

    private int time;
    private int cost;

    public Operation(int time, int cost) {
        this.time = time;
        this.cost = cost;
    }

    protected Operation() {
    }

    @Override
    public String getInfo() {
        return "время - " + time + ", стоимость - " + cost + ".";
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
