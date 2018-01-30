package design;

/**
 * Created by saurabh on 30/1/18.
 */
public class Application {

    private String bk;
    private int status;
    private String appId;

    public Application(String bk, int status, String appId) {
        this.bk = bk;
        this.status = status;
        this.appId = appId;
    }

    public String getBk() {
        return bk;
    }

    public void setBk(String bk) {
        this.bk = bk;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Override
    public String toString() {
        return "Application{" +
                "bk='" + bk + '\'' +
                ", status=" + status +
                ", appId='" + appId + '\'' +
                '}';
    }
}
