package sample.greenair.akhilmg.com.testretrofitcaching.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AKHIL MG on 27-04-2017.
 */

public class IssueClassDto extends BaseDto implements Parcelable {

    @SerializedName("IssueClassID")
    private Integer issueClassID;

    @SerializedName("SiteID")
    private Integer siteID;

    @SerializedName("IssueClassCode")
    private String issueClassCode;

    @SerializedName("IssueClassDesc")
    private String issueClassDesc;

    @SerializedName("IsDefault")
    private Boolean isDefault;

    @SerializedName("Active")
    private Boolean active;

    @SerializedName("CreationDate")
    private String creationDate;

    @SerializedName("LastUpdateDate")
    private String lastUpdateDate;

    @SerializedName("LastUpdateUserID")
    private Integer lastUpdateUserID;

    @SerializedName("UpdateBySQLUser")
    private String updateBySQLUser;

    @SerializedName("UpdateDateUTC")
    private String updateDateUTC;

    @SerializedName("ToDelete")
    private String toDelete;

    @SerializedName("gUID")
    private String gUID;

    @SerializedName("IssueTypes")
    private List<IssueTypesDto> issueTypes;

    public Integer getIssueClassID() {
        return issueClassID;
    }

    public Integer getSiteID() {
        return siteID;
    }

    public String getIssueClassCode() {
        return issueClassCode;
    }

    public String getIssueClassDesc() {
        return issueClassDesc;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public Boolean getActive() {
        return active;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public Integer getLastUpdateUserID() {
        return lastUpdateUserID;
    }

    public String getUpdateBySQLUser() {
        return updateBySQLUser;
    }

    public String getUpdateDateUTC() {
        return updateDateUTC;
    }

    public String getToDelete() {
        return toDelete;
    }

    public String getgUID() {
        return gUID;
    }

    public List<IssueTypesDto> getIssueTypes() {
        return issueTypes;
    }

    public void setIssueClassID(Integer issueClassID) {
        this.issueClassID = issueClassID;
    }

    public void setSiteID(Integer siteID) {
        this.siteID = siteID;
    }

    public void setIssueClassCode(String issueClassCode) {
        this.issueClassCode = issueClassCode;
    }

    public void setIssueClassDesc(String issueClassDesc) {
        this.issueClassDesc = issueClassDesc;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public void setLastUpdateUserID(Integer lastUpdateUserID) {
        this.lastUpdateUserID = lastUpdateUserID;
    }

    public void setUpdateBySQLUser(String updateBySQLUser) {
        this.updateBySQLUser = updateBySQLUser;
    }

    public void setUpdateDateUTC(String updateDateUTC) {
        this.updateDateUTC = updateDateUTC;
    }

    public void setToDelete(String toDelete) {
        this.toDelete = toDelete;
    }

    public void setgUID(String gUID) {
        this.gUID = gUID;
    }

    public void setIssueTypes(List<IssueTypesDto> issueTypes) {
        this.issueTypes = issueTypes;
    }


    protected IssueClassDto(Parcel in) {
        issueClassID = in.readByte() == 0x00 ? null : in.readInt();
        siteID = in.readByte() == 0x00 ? null : in.readInt();
        issueClassCode = in.readString();
        issueClassDesc = in.readString();
        byte isDefaultVal = in.readByte();
        isDefault = isDefaultVal == 0x02 ? null : isDefaultVal != 0x00;
        byte activeVal = in.readByte();
        active = activeVal == 0x02 ? null : activeVal != 0x00;
        creationDate = in.readString();
        lastUpdateDate = in.readString();
        lastUpdateUserID = in.readByte() == 0x00 ? null : in.readInt();
        updateBySQLUser = in.readString();
        updateDateUTC = in.readString();
        toDelete = in.readString();
        gUID = in.readString();
        if (in.readByte() == 0x01) {
            issueTypes = new ArrayList<IssueTypesDto>();
            in.readList(issueTypes, IssueTypesDto.class.getClassLoader());
        } else {
            issueTypes = null;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (issueClassID == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(issueClassID);
        }
        if (siteID == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(siteID);
        }
        dest.writeString(issueClassCode);
        dest.writeString(issueClassDesc);
        if (isDefault == null) {
            dest.writeByte((byte) (0x02));
        } else {
            dest.writeByte((byte) (isDefault ? 0x01 : 0x00));
        }
        if (active == null) {
            dest.writeByte((byte) (0x02));
        } else {
            dest.writeByte((byte) (active ? 0x01 : 0x00));
        }
        dest.writeString(creationDate);
        dest.writeString(lastUpdateDate);
        if (lastUpdateUserID == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(lastUpdateUserID);
        }
        dest.writeString(updateBySQLUser);
        dest.writeString(updateDateUTC);
        dest.writeString(toDelete);
        dest.writeString(gUID);
        if (issueTypes == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(issueTypes);
        }
    }

    public static final Parcelable.Creator<IssueClassDto> CREATOR = new Parcelable.Creator<IssueClassDto>() {
        @Override
        public IssueClassDto createFromParcel(Parcel in) {
            return new IssueClassDto(in);
        }

        @Override
        public IssueClassDto[] newArray(int size) {
            return new IssueClassDto[size];
        }
    };
}
