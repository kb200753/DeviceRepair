public class Component{
    private String Name;
    private double Cost;

    public Component(String name, double Cost) {
        this.Name = name;
        this.Cost = Cost;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double cost) {
        Cost = cost;
    }
}
