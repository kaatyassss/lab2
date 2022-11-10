package lab2;

public class FreeOperation extends Operation {

    private int time;

    public FreeOperation(int time) {
        this.time = time;
    }

    @Override
    public String getInfo() {
        return "время - " + time + ", стоимость - бесплатно.";
    }

    @Override
    public int getTime() {
        return time;
    }

    @Override
    public void setTime(int time) {
        this.time = time;
    }
}
