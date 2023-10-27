package assign07;

public class Tool extends Item {
    private int power;

    public Tool(String name, int power) {
        super(name);
        this.power = power;
    }

    public String toString() {
        return "Tool: " + name + " - power = " + power;
    }

    @Override
    public int compareTo(Item other) {
        if (!(other instanceof Tool))
            return 1;
        else {
            if (this.power > ((Tool) other).power)
                return 1;
            else if (this.power < ((Tool) other).power)
                return -1;
            else
                return 0;

        }
    }

    @Override
    public void merge(Item other) {
        if (other instanceof Tool) {
            this.power += ((Tool) other).power;
        }
    }
}
