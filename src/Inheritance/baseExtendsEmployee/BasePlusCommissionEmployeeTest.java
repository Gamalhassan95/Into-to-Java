package Inheritance.baseExtendsEmployee;

import Inheritance.baseExtendsEmployee.BasePlusCommissionEmployee2;

public class BasePlusCommissionEmployeeTest
{
    public static void main( String[] args)
    {
        BasePlusCommissionEmployee2
                employee =
                new BasePlusCommissionEmployee2(
                        "Bob","Lewis", "333-33-3333", 5000, .04, 300);


        System.out.println("Employee information obtained by get methods: \n");
        System.out.printf("%s %s\n", "Frist name is", employee.getFirstName() );
        System.out.printf( "%s %S\n", "Social security number is", employee.getSocialSecurityNumber() );
        System.out.printf("%s %.2f\n", "Gross sales is", employee.getGrossSales() );
        System.out.printf("%s %.2f\n", "Commission rate is", employee.getcommissionRate() );
        System.out.printf("%s %.2f\n", "Base salary is", employee.getBaseSalary() );
        employee.setBaseSalary( 1000 );

        System.out.printf("\n%s:\n\n%s\n", "Updated employee information obtained by toString", employee.toString() );
    }
}
