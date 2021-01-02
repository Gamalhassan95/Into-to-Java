package Polymorphism2.Abstract;

public abstract class Employee implements Payable
{
    private String firstName;
    private String lastName;
    private String socialsecurityNumber;

    public Employee( String first, String last, String ssn )
    {
        firstName = first;
        lastName = last;
        socialsecurityNumber = ssn;
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
    public String getLastName()
    {
        return lastName;
    }
    public void setSocialsecurityNumber( String ssn )
    {
        socialsecurityNumber = ssn;
    }

    public String getSocialsecurityNumber()
    {
        return socialsecurityNumber;
    }

    @Override
    public String toString()
    {
        return String.format(
                "%s %s \nsocial security number: %s",
                getFirstName(), getLastName(), getSocialsecurityNumber() );

    }
}
