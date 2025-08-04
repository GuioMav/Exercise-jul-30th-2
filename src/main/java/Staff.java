public abstract class Staff implements iStaff {

    int staffNumber;
    String staffLocation;

    public Staff(int staffNumber, String location){
        this.staffNumber = staffNumber;
        this.staffLocation = location;
    }

    @Override
    public int getStaffNumber() {
        return this.staffNumber;
    }
    @Override
    public String getStaffLocation(){
        return this.staffLocation;
    }
}
