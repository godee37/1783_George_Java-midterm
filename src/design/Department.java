package design;

public abstract class Department {
    final String hr = "HR";
    final String marketing = "Marketing";
    final String sales = "Sales";
    final String it = "IT";
    final String accounting = "Accounting";

    public abstract String assignDepartment(String dept);

}

