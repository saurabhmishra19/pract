import design.Application;
import design.BusinessProcess;
import design.Process;
import design.Variable;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * Created by saurabh on 31/1/18.
 */
public class BusinessProcessTest {

    List<Variable> variables;
    Map<String, Process> processes;
    List<Application> applications;
    BusinessProcess bp;

    @Before
    public void prepareTest(){
        bp=new BusinessProcess();
        int capVar=3;
        int capPro=5;
        int capapp=7;
        this.variables=new ArrayList<Variable>(capVar);
        this.processes=new HashMap<String, Process>(capPro);
        this.applications=new ArrayList<Application>(capapp);
        Random rnd=new Random(100);
        Random rndPro=new Random(10);
        Random rndBk=new Random(1000);
        for(int i=0;i<capVar;i++){
            String proId="prd"+rnd.nextInt(100);
            variables.add(new Variable(proId));
        }
        rnd.setSeed(100);
        for(int i=0;i<capPro;i++){
            String proId="prd";
            proId+=i%2==0?rnd.nextInt(100):rndPro.nextInt(100);
            String bk="BK"+rndBk.nextInt(100);
            Process process=new Process();
            process.setProcessId(proId);
            process.setBk(bk);
            processes.put(proId,process);
        }
        rndBk=new Random(1000);
        Random rndBkNew=new Random(10000);
        Random rndApp=new Random(10001);
        for(int i=0;i<capapp;i++){
            String bk="BK";
            bk+=i%2==0?rndBk.nextInt(100):rndBkNew.nextInt(100);
            String appId="app"+rndApp.nextInt(100);

            applications.add(new Application(bk,0,appId));

        }


        System.out.println(variables+" \n"+processes +" \nappl "+applications);
        bp.processInput(this.variables,this.processes,this.applications);
      //  System.out.println("after procee "+applications);


    }

    @Test
    public void testprocessInput(){


}

}
