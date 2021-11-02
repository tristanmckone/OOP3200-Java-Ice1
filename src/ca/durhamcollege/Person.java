package ca.durhamcollege;

public class Person
{

    //  Instance variables

    private int m_age;
    private String m_name;




    // Getters and Setters
    public int getAge() {
        return m_age;
    }

    public void setAge(int age) {
        m_age = age;
    }

    public String getName() {
        return m_name;
    }

    public void setName(String name) {
        m_name = name;
    }

    public void Set(String name, int age)
    {
        setName(name);
        setAge(age);
    }



    /**
     *  Constructors
     */
    public Person()
    {
        m_name = "unknown";
        m_age = 0;


    }
    public Person(String name, int age)
    {
        this.m_name = name;
        this.m_age = age;

    }

    public Person(int age)
    {
        this.m_age = age;
        this.m_name = "unknown";
    }

    public Person(String name)
    {
        this.m_name = name;
        this.m_age = 0;
    }

    // Methods

    /**
     * This method tests personal class and returns hello
     * @return {Void}
     */
    public void SaysHello()
    {
        System.out.println(getName() + " says hello!");
    }


    /**
     * This method overrides to string method and returns person properties
     * @return {String}
     */
    @Override
    public String toString()
    {
        String outputString = "";
        outputString += "Name: " + this.m_name + " ";
        outputString += "Age: " + this.m_age;

        return outputString;
    }
}
