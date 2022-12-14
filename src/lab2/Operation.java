package lab2;

public class Operation implements Printable {

    protected static int n;
    private int id;
    private int time;
    private int cost;

    public Operation(int time, int cost) {
        this.id = ++n;
        this.time = time;
        this.cost = cost;
    }

    protected Operation() {
    }

    @Override
    public String getInfo() {
        return "Операция " + id + ": время - " + time + ", стоимость - " + cost + "."; //+
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
