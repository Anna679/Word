package staff;

public class Cookie extends Staff {
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Cookie(String name, double weight, double price,String size) {
        super(name, weight, price);
        this.size=size;
    }

    @Override
    public String toString() {
        return "Cookie+["+ super.toString()+",size = "+ size +"]";
    }
}
