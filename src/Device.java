public class Device {

    protected String IdentificationCode;
    protected String MakeAndModel;
    protected String Owner;
    protected String ProblemDescription;
    protected String RepairNotes;
    protected int Prioroty;




    public  Device(String IdentificationCode, String MakeAndModel, String Owner, String ProblemDescription, String RepairNotes, int Prioroty){
        this.IdentificationCode = IdentificationCode;
        this.MakeAndModel = MakeAndModel;
        this.Owner =Owner;
        this.ProblemDescription = ProblemDescription;
        this.RepairNotes = RepairNotes;
        this.Prioroty = Prioroty;

    }

    public String toString(){
        return IdentificationCode + ", " + MakeAndModel + ", " + Owner + ", " + ProblemDescription + ", " + RepairNotes + ", " + Prioroty;
    }

    public String getIdentificationCode() {
        return IdentificationCode;
    }

    public String getMakeAndModel() {
        return MakeAndModel;
    }

    public String getOwner() {
        return Owner;
    }

    public String getProblemDescription() {
        return ProblemDescription;
    }

    public String getRepairNotes() {
        return RepairNotes;
    }

    public int getPrioroty() {
        return Prioroty;
    }

    public void setIdentificationCode(String identificationCode) {
        IdentificationCode = identificationCode;
    }

    public void setMakeAndModel(String makeAndModel) {
        MakeAndModel = makeAndModel;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public void setProblemDescription(String problemDescription) {
        ProblemDescription = problemDescription;
    }

    public void setRepairNotes(String repairNotes) {
        RepairNotes = repairNotes;
    }

    public void setPrioroty(int prioroty) {
        Prioroty = prioroty;
    }
}
