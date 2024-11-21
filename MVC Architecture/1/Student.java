public class Student{
    private int age;
    private String name;

    public Student(){
        age = 0;
        name = "";
    }

    public void setAge(int age)
    {
        this.age = age;

    }
    
    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}