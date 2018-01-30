package design;

/**
 * Created by saurabh on 30/1/18.
 */
public class Variable {

    private String processId;

    public Variable(String processId){
        this.processId=processId;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    @Override
    public String toString() {
        return "Variable{" +
                "processId='" + processId + '\'' +
                '}';
    }
}
