public class Cat
{
    Cat(String name, int age, String mistress_name)
    {
        this.name = name;
        this.age = age;
        this.mistress_name = mistress_name;
    }
    private String name;
    private int age;
    private String mistress_name;

    public void Eat()
    {
        System.out.println("Nyam-nyam...");
    }
    public void Speak()
    {
        System.out.println("MEOW... MEOW...");
    }
    public void Jump()
    {
        System.out.println("Prig_Skok");
    }

    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public String getMistressName()
    {
        return mistress_name;
    }
}
