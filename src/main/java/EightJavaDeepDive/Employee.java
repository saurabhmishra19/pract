package EightJavaDeepDive;

/**
 * Created by saurabh on 16/2/19.
 */
public class Employee {

    String name;
    int id;
    long salary;
    int age;
    String gender;
    @Override
    public int hashCode(){
        //planned bucket size of 400
        return (id+name.hashCode())%400;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
