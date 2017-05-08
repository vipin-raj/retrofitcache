package sample.greenair.akhilmg.com.testretrofitcaching.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by AKHIL MG on 27-04-2017.
 */

public class IssueTypesDto extends BaseDto implements Parcelable {

    @SerializedName("IssueTypeID")
    private Integer issueTypeID;
    @SerializedName("SiteID")
    private String siteID;
    @SerializedName("IssueTypeDesc")
    private String issueTypeDesc;
    @SerializedName("PriorityID")
    private String priorityID;
    @SerializedName("IssueClassID")
    private Integer issueClassID;
    @SerializedName("IssueGroupID")
    private String issueGroupID;
    @SerializedName("IssueCategoryID")
    private String issueCategoryID;
    @SerializedName("Level1DepartmentID")
    private String level1DepartmentID;
    @SerializedName("Level2DepartmentID")
    private String level2DepartmentID;
    @SerializedName("AssigneeUserID")
    private String assigneeUserID;
    @SerializedName("AssigneeAnyUser")
    private Boolean assigneeAnyUser;
    @SerializedName("GuestServiceIssue")
    private Boolean guestServiceIssue;
    @SerializedName("RequiresGuestCallback")
    private String requiresGuestCallback;
    @SerializedName("RequiresLocationOwnerAction")
    private String requiresLocationOwnerAction;
    @SerializedName("IVRCode")
    private String iVRCode;
    @SerializedName("SendPreAlert")
    private String sendPreAlert;
    @SerializedName("SendAlert")
    private String sendAlert;
    @SerializedName("AlertForGuestServiceAndPublic")
    private String alertForGuestServiceAndPublic;
    @SerializedName("AlertForGuestServiceAndCrew")
    private String alertForGuestServiceAndCrew;
    @SerializedName("AlertForNonGuestServiceAndPublic")
    private String alertForNonGuestServiceAndPublic;
    @SerializedName("AlertForNonGuestServiceAndCrew")
    private String alertForNonGuestServiceAndCrew;
    @SerializedName("DisplayOnMonitor")
    private String displayOnMonitor;
    @SerializedName("Active")
    private Boolean active;
    @SerializedName("CreationDate")
    private String creationDate;
    @SerializedName("LastUpdateDate")
    private String lastUpdateDate;
    @SerializedName("LastUpdateUserID")
    private String lastUpdateUserID;
    @SerializedName("UpdateBySQLUser")
    private String updateBySQLUser;
    @SerializedName("UpdateDateUTC")
    private String updateDateUTC;
    @SerializedName("ToDelete")
    private String toDelete;
    @SerializedName("gUID")
    private String gUID;
    @SerializedName("AllowUserAssignment")
    private Boolean allowUserAssignment;
    @SerializedName("IssueClass")
    private String issueClass;

    public Integer getIssueTypeID() {
        return issueTypeID;
    }

    public String getSiteID() {
        return siteID;
    }

    public String getIssueTypeDesc() {
        return issueTypeDesc;
    }

    public String getPriorityID() {
        return priorityID;
    }

    public Integer getIssueClassID() {
        return issueClassID;
    }

    public String getIssueGroupID() {
        return issueGroupID;
    }

    public String getIssueCategoryID() {
        return issueCategoryID;
    }

    public String getLevel1DepartmentID() {
        return level1DepartmentID;
    }

    public String getLevel2DepartmentID() {
        return level2DepartmentID;
    }

    public String getAssigneeUserID() {
        return assigneeUserID;
    }

    public Boolean getGuestServiceIssue() {
        return guestServiceIssue;
    }

    public String getRequiresGuestCallback() {
        return requiresGuestCallback;
    }

    public String getRequiresLocationOwnerAction() {
        return requiresLocationOwnerAction;
    }

    public String getiVRCode() {
        return iVRCode;
    }

    public String getSendPreAlert() {
        return sendPreAlert;
    }

    public String getSendAlert() {
        return sendAlert;
    }

    public String getAlertForGuestServiceAndPublic() {
        return alertForGuestServiceAndPublic;
    }

    public String getAlertForGuestServiceAndCrew() {
        return alertForGuestServiceAndCrew;
    }

    public String getAlertForNonGuestServiceAndPublic() {
        return alertForNonGuestServiceAndPublic;
    }

    public String getAlertForNonGuestServiceAndCrew() {
        return alertForNonGuestServiceAndCrew;
    }

    public String getDisplayOnMonitor() {
        return displayOnMonitor;
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

    public String getLastUpdateUserID() {
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


    public String getIssueClass() {
        return issueClass;
    }

    public void setIssueTypeID(Integer issueTypeID) {
        this.issueTypeID = issueTypeID;
    }

    public void setSiteID(String siteID) {
        this.siteID = siteID;
    }

    public void setIssueTypeDesc(String issueTypeDesc) {
        this.issueTypeDesc = issueTypeDesc;
    }

    public void setPriorityID(String priorityID) {
        this.priorityID = priorityID;
    }

    public void setIssueClassID(Integer issueClassID) {
        this.issueClassID = issueClassID;
    }

    public void setIssueGroupID(String issueGroupID) {
        this.issueGroupID = issueGroupID;
    }

    public void setIssueCategoryID(String issueCategoryID) {
        this.issueCategoryID = issueCategoryID;
    }

    public void setLevel1DepartmentID(String level1DepartmentID) {
        this.level1DepartmentID = level1DepartmentID;
    }

    public void setLevel2DepartmentID(String level2DepartmentID) {
        this.level2DepartmentID = level2DepartmentID;
    }

    public void setAssigneeUserID(String assigneeUserID) {
        this.assigneeUserID = assigneeUserID;
    }

    public void setGuestServiceIssue(Boolean guestServiceIssue) {
        this.guestServiceIssue = guestServiceIssue;
    }

    public void setRequiresGuestCallback(String requiresGuestCallback) {
        this.requiresGuestCallback = requiresGuestCallback;
    }

    public void setRequiresLocationOwnerAction(
            String requiresLocationOwnerAction) {
        this.requiresLocationOwnerAction = requiresLocationOwnerAction;
    }

    public void setiVRCode(String iVRCode) {
        this.iVRCode = iVRCode;
    }

    public void setSendPreAlert(String sendPreAlert) {
        this.sendPreAlert = sendPreAlert;
    }

    public void setSendAlert(String sendAlert) {
        this.sendAlert = sendAlert;
    }

    public void setAlertForGuestServiceAndPublic(
            String alertForGuestServiceAndPublic) {
        this.alertForGuestServiceAndPublic = alertForGuestServiceAndPublic;
    }

    public void setAlertForGuestServiceAndCrew(
            String alertForGuestServiceAndCrew) {
        this.alertForGuestServiceAndCrew = alertForGuestServiceAndCrew;
    }

    public void setAlertForNonGuestServiceAndPublic(
            String alertForNonGuestServiceAndPublic) {
        this.alertForNonGuestServiceAndPublic = alertForNonGuestServiceAndPublic;
    }

    public void setAlertForNonGuestServiceAndCrew(
            String alertForNonGuestServiceAndCrew) {
        this.alertForNonGuestServiceAndCrew = alertForNonGuestServiceAndCrew;
    }

    public void setDisplayOnMonitor(String displayOnMonitor) {
        this.displayOnMonitor = displayOnMonitor;
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

    public void setLastUpdateUserID(String lastUpdateUserID) {
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


    public void setIssueClass(String issueClass) {
        this.issueClass = issueClass;
    }

    public Boolean getAssigneeAnyUser() {
        return assigneeAnyUser;
    }

    public void setAssigneeAnyUser(Boolean assigneeAnyUser) {
        this.assigneeAnyUser = assigneeAnyUser;
    }

    public Boolean getAllowUserAssignment() {
        return allowUserAssignment;
    }

    public void setAllowUserAssignment(Boolean allowUserAssignment) {
        this.allowUserAssignment = allowUserAssignment;
    }

    protected IssueTypesDto(Parcel in) {
        issueTypeID = in.readInt();
        siteID = in.readString();
        issueTypeDesc = in.readString();
        priorityID = in.readString();
        issueClassID = in.readByte() == 0x00 ? null : in.readInt();
        issueGroupID = in.readString();
        issueCategoryID = in.readString();
        level1DepartmentID = in.readString();
        level2DepartmentID = in.readString();
        assigneeUserID = in.readString();
        byte assigneeAnyUserVal = in.readByte();
        assigneeAnyUser = assigneeAnyUserVal == 0x02 ? null
                : assigneeAnyUserVal != 0x00;
        byte guestServiceVal = in.readByte();
        guestServiceIssue = guestServiceVal == 0x02 ? null
                : guestServiceVal != 0x00;
        requiresGuestCallback = in.readString();
        requiresLocationOwnerAction = in.readString();
        iVRCode = in.readString();
        sendPreAlert = in.readString();
        sendAlert = in.readString();
        alertForGuestServiceAndPublic = in.readString();
        alertForGuestServiceAndCrew = in.readString();
        alertForNonGuestServiceAndPublic = in.readString();
        alertForNonGuestServiceAndCrew = in.readString();
        displayOnMonitor = in.readString();
        byte activeVal = in.readByte();
        active = activeVal == 0x02 ? null : activeVal != 0x00;
        creationDate = in.readString();
        lastUpdateDate = in.readString();
        lastUpdateUserID = in.readString();
        updateBySQLUser = in.readString();
        updateDateUTC = in.readString();
        toDelete = in.readString();
        gUID = in.readString();
        byte allowUserAssignmentVal = in.readByte();
        allowUserAssignment = allowUserAssignmentVal == 0x02? null: allowUserAssignmentVal != 0x00;
        issueClass = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(issueTypeID);
        dest.writeString(siteID);
        dest.writeString(issueTypeDesc);
        dest.writeString(priorityID);
        if (issueClassID == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(issueClassID);
        }
        dest.writeString(issueGroupID);
        dest.writeString(issueCategoryID);
        dest.writeString(level1DepartmentID);
        dest.writeString(level2DepartmentID);
        dest.writeString(assigneeUserID);
        if (assigneeAnyUser == null) {
            dest.writeByte((byte) (0x02));
        } else {
            dest.writeByte((byte) (assigneeAnyUser ? 0x01 : 0x00));
        }
        if (guestServiceIssue == null) {
            dest.writeByte((byte) (0x02));
        } else {
            dest.writeByte((byte) (guestServiceIssue ? 0x01 : 0x00));
        }
        dest.writeString(requiresGuestCallback);
        dest.writeString(requiresLocationOwnerAction);
        dest.writeString(iVRCode);
        dest.writeString(sendPreAlert);
        dest.writeString(sendAlert);
        dest.writeString(alertForGuestServiceAndPublic);
        dest.writeString(alertForGuestServiceAndCrew);
        dest.writeString(alertForNonGuestServiceAndPublic);
        dest.writeString(alertForNonGuestServiceAndCrew);
        dest.writeString(displayOnMonitor);
        if (active == null) {
            dest.writeByte((byte) (0x02));
        } else {
            dest.writeByte((byte) (active ? 0x01 : 0x00));
        }
        dest.writeString(creationDate);
        dest.writeString(lastUpdateDate);
        dest.writeString(lastUpdateUserID);
        dest.writeString(updateBySQLUser);
        dest.writeString(updateDateUTC);
        dest.writeString(toDelete);
        dest.writeString(gUID);

        if (allowUserAssignment == null) {
            dest.writeByte((byte) (0x02));
        } else {
            dest.writeByte((byte) (allowUserAssignment ? 0x01 : 0x00));
        }
        dest.writeString(issueClass);
    }

    public static final Parcelable.Creator<IssueTypesDto> CREATOR = new Parcelable.Creator<IssueTypesDto>() {
        @Override
        public IssueTypesDto createFromParcel(Parcel in) {
            return new IssueTypesDto(in);
        }

        @Override
        public IssueTypesDto[] newArray(int size) {
            return new IssueTypesDto[size];
        }
    };
}

