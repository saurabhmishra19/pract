package ReadFailures.Dto;

public class RegressionDto {

    private String fileName;
    private String owner;
    private String reason;
    private String comments;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }


    @Override
    public String toString() {
        return "RegressionDto{" +
                "fileName='" + fileName + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
