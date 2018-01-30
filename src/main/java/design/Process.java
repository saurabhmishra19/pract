package design;

/**
 * Created by saurabh on 30/1/18.
 */
public class Process {
    private String processId;
    //business key
    private String bk;

    public String getBk() {
        return bk;
    }

    public void setBk(String bk) {
        this.bk = bk;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }


    @Override
    public String toString() {
        return "Process{" +
                "processId='" + processId + '\'' +
                ", bk='" + bk + '\'' +
                '}';
    }
}
