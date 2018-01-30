package design;

import java.util.List;
import java.util.Map;

/**
 * Created by saurabh on 30/1/18.
 */
public class BusinessProcess {


    public void processInput(final List<Variable> variables,
                             final Map<String, Process> processes,
                            final List<Application> applications){

        processes.forEach((k, v) -> {
           long t= variables.stream().filter(variable ->
                    variable.getProcessId().equals(k)).count();

            if (t>0) {

                applications.stream().forEach(application -> {
                    if (application.getBk().equals(v.getBk())) {
                     //   System.out.println("matching "+application);
                        application.setStatus(90);
                    }

                })
                ;
            }
        });



        System.out.print("results "+applications);


    }







}
