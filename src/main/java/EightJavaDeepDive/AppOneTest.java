package EightJavaDeepDive;

import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by saurabh on 16/2/19.
 */
public class AppOneTest {

    Map<Integer,Employee> employees=new HashMap<Integer, Employee>();

    @Before
    public void init(){
        Random rnd=new Random(123);

        int total=20;

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

            if(employees.put(emp.id, emp)!=emp){
                System.out.println("Added employee");
                emp.id=rnd.nextInt(2000)+1000;;
                employees.put(emp.id, emp);
            }
        }
    }

    @Test
    public void testAll(){

    }



}
