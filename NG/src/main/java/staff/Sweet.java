package staff;

public class Sweet extends Staff{
    private String brand;
    public Sweet (){}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Sweet(String name, double weight, double price, String brand) {
        super(name, weight, price);
        this.brand=brand;

    }

    @Override
    public String toString() {
        return"Sweet+["+ super.toString()+",brand = "+ brand +"]";
    }
}
