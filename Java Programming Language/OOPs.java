public class OOPs 
{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.calpercentage(90);
        System.out.println(s1.percentage);


    }

    
}
class Student
{
    String name;
    int age;
    float percentage;
    void calpercentage(int phy, int math, int bio)
    {
         percentage=(phy+math+bio)/3;
    }
}