public class StaffHiring extends Staff{

    public StaffHiring(int staffNumber, String location) {
        super(staffNumber, location);
    }

    @Override
    public String getStaffHiringProcess() {
                if (staffNumber < 20 ) {
            return "The hiring Process must start.";
        } else {
            return "The hiring process must not start";
        }

    }

    public String printStaffHiring(){
        System.out.println("Staff Members: " + getStaffNumber());
        System.out.println("Staff Location: " + getStaffLocation());
        System.out.println("Staff Hiring: " + getStaffHiringProcess());

        return getStaffNumber() + getStaffLocation() + getStaffHiringProcess();


    }
}
