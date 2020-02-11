package chapter9;

public class InheritanceTester {
    public static void main(String args[]) {
        Person person = new Person();
        person.setAge(12);

        Employee employee = new Employee();
        employee.getGender();
        employee.setEmployeeId("a234b");

        System.out.println("id: "+employee.getEmployeeId());
    }
}
