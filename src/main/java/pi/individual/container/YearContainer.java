package pi.individual.container;

import java.io.Serializable;

@SuppressWarnings("unused")
public class YearContainer implements Serializable {
    private int errorCode;
    private String dataMessage;

    public YearContainer() {
    }

    public YearContainer(int errorCode, String dataMessage) {
        this.errorCode = errorCode;
        this.dataMessage = dataMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }
    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getDataMessage() {
        return dataMessage;
    }
    public void setDataMessage(String dataMessage) {
        this.dataMessage = dataMessage;
    }
}
