package JavaCore.Java8.LambdaExpression.Interface;

interface Employee{
    public String setName(String name);
}

class Company implements Employee{

    @Override
    public String setName(String name) {
        return name+" is Employee in this company";
    }
}

public class Default_Use_Of_Interface {
    public static void main(String[] args) {

        //1.Common method
        Company company = new Company();
        String s=company.setName("Anshul");
        System.out.println(s);


        //2.Anonymous interface class
        //This avoid the use of College implementation class
        Employee employee = new Employee() {
            @Override
            public String setName(String name) {
                return name+ " is Pursuing college";
            }
        };
        String ss = employee.setName("Vividh");
        System.out.println(ss);


    }
}
