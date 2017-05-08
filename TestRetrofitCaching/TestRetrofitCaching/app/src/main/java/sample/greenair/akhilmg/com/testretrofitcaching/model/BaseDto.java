package sample.greenair.akhilmg.com.testretrofitcaching.model;

import android.os.Parcelable;

/**
 * Created by AKHIL MG on 27-04-2017.
 */

public abstract class BaseDto implements Parcelable {
    private Boolean Status;
    private String Message;

    public Boolean getStatus() {
        return Status;
    }

    public String getMessage() {
        return Message;
    }

    public void setStatus(Boolean status) {
        Status = status;
    }

    public void setMessage(String message) {
        Message = message;
    }

}

