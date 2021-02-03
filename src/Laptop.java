import java.util.ArrayList;

public class Laptop extends Device {
    ArrayList<Component> ComponentList = new ArrayList<>();

    public Laptop(String IdentificationCode, String MakeAndModel, String Owner, String ProblemDescription, String RepairNotes, int Prioroty) {
        super(IdentificationCode, MakeAndModel, Owner, ProblemDescription, RepairNotes, Prioroty);

    }

    public ArrayList<Component> getComponentList() {
        return ComponentList;
    }
    public void addComponent(Component Component){
        ComponentList.add(Component);
    }
    public void deleteComponent(int index){
        if (index >= 0 && index < ComponentList.size()) {
            ComponentList.remove(index);
        }
        }

}
