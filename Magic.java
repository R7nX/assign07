package assign07;

public class Magic extends Item {
    private int power;
    private int cost;

    public Magic(String name, int power, int cost) {
        super(name);
        this.power = power;
        this.cost = cost;
    }

    public String toString() {
        return "Magic: " + name + " - power = " + this.power + ", cost = " + this.cost;
    }

    @Override
    public void merge(Item other) {
        if (other instanceof Magic) {
            this.cost -= 1;
        }

    }

    @Override
    public int compareTo(Item other) {
        // TODO Auto-generated method stub
        if (!(other instanceof Magic))
            return -1;
        else {
            if ((this.power / this.cost) > ((((Magic) other).power) / (((Magic) other).cost)))
                return 1;
            else if ((this.power / this.cost) < ((((Magic) other).power) / (((Magic) other).cost)))
                return -1;
            else
                return 0;
        }
    }
}
