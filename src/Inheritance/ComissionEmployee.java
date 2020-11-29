package Inheritance;

public class ComissionEmployee extends Object
{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales;
    private double comissionRate;

    public ComissionEmployee( String first, String last, String ssn, double sales, double rate )
    {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        setGrossSales( sales );
        setComissionRate( rate );
    }

    public void setFirstName( String first )
    {
        firstName = first;
    }

    public String getFirstName()
    {
        return firstName;
    }
    public void setLastName( String last )
    {
        lastName = last;
    }
    public String getLastName(){
        return lastName;
    }
    public void setSocialSecurityNumber( String ssn )
    {
        socialSecurityNumber = ssn;
    }
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }
    public void setGrossSales( double sales )
    {
        if( sales >= 0.0 )
            grossSales = sales;
        else
            throw new IllegalArgumentException(
                    "Gross sales must be >= 0.0"
            );
    }
    public double getGrossSales()
    {
        return grossSales;
    }
    public void setComissionRate( double rate)
    {
        if ( rate > 0.0 && rate < 1.0 )
            comissionRate = rate;
        else
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0"
            );
    }

    public double getComissionRate()
    {
        return comissionRate;
    }

    public double earnings()
    {
        return comissionRate * grossSales;
    }
    @Override
    public String toString()
    {
        return String.format("%s:%s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", grossSales,
                "commission rate", comissionRate );
    }
}
