package assign07;

public class Armor extends Item {
    private int defense;
    private int condition;

    public Armor(String name, int defense, int condition) {
        super(name);
        this.defense = defense;
        this.condition = condition;
    }

    public String toString() {
        return "Armor: " + name + " - defense = " + this.defense + ", condition = " + this.condition;
    }

    @Override
    public void merge(Item other) {
        if (other instanceof Armor) {
            this.defense += ((Armor) other).defense;
            this.condition = Math.max(this.condition, ((Armor) other).condition);
        }

    }

    @Override
    public int compareTo(Item other) {
        // TODO Auto-generated method stub
        if (other instanceof Tool)
            return -1;
        else if (other instanceof Magic)
            return 1;
        else {
            if ((this.defense * this.condition) > (((Armor) other).condition * ((Armor) other).defense))
                return 1;
            else if ((this.defense * this.condition) < (((Armor) other).condition * ((Armor) other).defense))
                return -1;
            else
                return 0;
        }
    }
}
