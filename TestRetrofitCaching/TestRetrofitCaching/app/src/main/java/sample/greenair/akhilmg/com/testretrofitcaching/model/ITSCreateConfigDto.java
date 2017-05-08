package sample.greenair.akhilmg.com.testretrofitcaching.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by AKHIL MG on 27-04-2017.
 */

public class ITSCreateConfigDto extends BaseDto implements Parcelable {
    // public Integer ITSMobileConfigID;
    public String ImageCompression;
    public Boolean EnableSessionLog;
    public String AdminPassword;

    public ITSCreateConfigDto(Parcel in) {
        // ITSMobileConfigID = in.readInt();
        ImageCompression = in.readString();
        EnableSessionLog = in.readByte() != 0x00;
        AdminPassword = in.readString();
        byte isDefaultVal = in.readByte();
    }

    // public Integer getITSMobileConfigID() {
    // return ITSMobileConfigID;
    // }
    // public void setITSMobileConfigID(Integer iTSMobileConfigID) {
    // ITSMobileConfigID = iTSMobileConfigID;
    // }
    public String getImageCompression() {
        return ImageCompression;
    }

    public void setImageCompression(String imageCompression) {
        ImageCompression = imageCompression;
    }

    public Boolean getEnableSessionLog() {
        return EnableSessionLog;
    }

    public void setEnableSessionLog(Boolean enableSessionLog) {
        EnableSessionLog = enableSessionLog;
    }

    public String getAdminPassword() {
        return AdminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        AdminPassword = adminPassword;
    }

    public int describeContents() {
        // TODO Auto-generated method stub
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        // dest.writeInt(ITSMobileConfigID);
        dest.writeString(ImageCompression);
        dest.writeByte((byte) (EnableSessionLog ? 0x01 : 0x00));
        dest.writeString(AdminPassword);

    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<ITSCreateConfigDto> CREATOR = new Parcelable.Creator<ITSCreateConfigDto>() {
        @Override
        public ITSCreateConfigDto createFromParcel(Parcel in) {
            return new ITSCreateConfigDto(in);
        }

        @Override
        public ITSCreateConfigDto[] newArray(int size) {
            return new ITSCreateConfigDto[size];
        }
    };

}

