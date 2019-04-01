package EightJavaDeepDive;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by saurabh on 19/2/19.
 */
public class Employeeplayer {

    public Map<Integer,Employee> employees=new HashMap<Integer, Employee>();
    int x=40000;
    String genderMale="male";
    int ageRange=45;
    int bonusAmount=10000;
   public  Predicate<Map.Entry<Integer, Employee>> salaryAboveRange=
            (entry)->entry.getValue().salary>x;
    public Predicate<Map.Entry<Integer, Employee>> genderBasedFilter=
            (entry)->entry.getValue().gender.equals(genderMale);
   public Predicate<Map.Entry<Integer, Employee>> ageBasedFilter=(entry)->entry.getValue().age>ageRange;

   public Predicate<Map.Entry<Integer, Employee>> salaryAndAge=salaryAboveRange.and(ageBasedFilter);

   public Consumer<Map.Entry<Integer, Employee>> addSalaryBonus=(entry)->{
     entry.getValue().salary+=  bonusAmount;
   };

   public 



    public static void main(String [] args){

        Employeeplayer empPlayer=new Employeeplayer();
        empPlayer.prepareMockEmployees();

        Map<Integer, Employee> filteredResultOfAgeAndSalary=
                empPlayer.employees.entrySet().stream().filter(empPlayer.salaryAndAge).
                        collect(Collectors.toMap(entry->entry.getKey(), entry->entry.getValue()));
        empPlayer.printEmpList();
        empPlayer.employees.entrySet().stream().filter(empPlayer.ageBasedFilter).forEach(empPlayer.addSalaryBonus);
        System.out.println("----------");
        empPlayer.printEmpList();
        




    }


    public void printEmpList(){

        this.employees.forEach(
                (k,v)->{
                    System.out.println(v);
                }
        );
    }



    public void prepareMockEmployees(){

        Random rnd=new Random(123);

        int total=10;

        String [] randomNames=new String [] {"saurabh", "pushkar", "vijen", "pradep", "kunal"};

        String [] randomLastNames=new String [] {"kumar", "tiwari", "sahu", "soni", "kumar"};


        for(int i=0;i<total;i++){

            String [] gender=new String [] {"male", "female"};

            Employee emp=new Employee();
            emp.id=rnd.nextInt(2000)+1000;;
            emp.name=randomNames[rnd.nextInt(4)]+" "+randomLastNames[rnd.nextInt(4)];;
            emp.age=rnd.nextInt(40)+20;
            emp.salary=rnd.nextInt(50000)+20000;
            emp.gender=gender[rnd.nextInt(1)];
            employees.put(emp.id, emp);
        }

    }



}
