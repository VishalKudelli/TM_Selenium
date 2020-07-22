package POJOMethods;

public class EmployeePersonalDetails {

    private String empName;
    private double phoneNumber;
    private String company;


    public EmployeePersonalDetails(String empName, long phoneNumber, String company) {
        this.empName = empName;
        this.phoneNumber = phoneNumber;
        this.company = company;

    }

    public String getEmpName() {
        return empName;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public String getCompany() {
        return company;
    }


    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "EmployeePersonalDetails{" +
                "empName='" + empName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", company='" + company + '\'' +
                '}';
    }
}

