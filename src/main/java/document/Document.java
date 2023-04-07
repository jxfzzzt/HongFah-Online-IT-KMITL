package document;

public abstract class Document {

    private final String writtenAt = "คณะเทคโนโลยีสารสนเทศ สถาบันเทคโนโลยีพระจอมเกล้าเจ้าคุณทหารลาดกระบัง";
    private String requestedAtDay, requestedAtMonth, requestedAtYear;
    private String requestTitle;
    private String requestTo;
    private String requestBy;
    private String requestStatus;

    public String getWrittenAt() {
        return writtenAt;
    }

    public String getRequestedAtDay() {
        return requestedAtDay;
    }

    public void setRequestedAtDay(String requestedAtDay) {
        this.requestedAtDay = requestedAtDay;
    }

    public String getRequestedAtMonth() {
        return requestedAtMonth;
    }

    public void setRequestedAtMonth(String requestedAtMonth) {
        this.requestedAtMonth = requestedAtMonth;
    }

    public String getRequestedAtYear() {
        return requestedAtYear;
    }

    public void setRequestedAtYear(String requestedAtYear) {
        this.requestedAtYear = requestedAtYear;
    }

    public String getRequestTitle() {
        return requestTitle;
    }

    public void setRequestTitle(String requestTitle) {
        this.requestTitle = requestTitle;
    }

    public String getRequestTo() {
        return requestTo;
    }

    public void setRequestTo(String requestTo) {
        this.requestTo = requestTo;
    }

    public String getRequestBy() {
        return requestBy;
    }

    public void setRequestBy(String requestBy) {
        this.requestBy = requestBy;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }
}
