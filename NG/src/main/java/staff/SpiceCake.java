package staff;

public class SpiceCake extends  Staff {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SpiceCake(String name, double weight, double price, String type) {
        super(name, weight, price);
        this.type=type;
    }

    @Override
    public String toString() {
        return "SpiceCake+["+ super.toString()+",type = "+ type +"]";
    }
}
