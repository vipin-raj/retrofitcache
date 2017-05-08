package sample.greenair.akhilmg.com.testretrofitcaching.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AKHIL MG on 27-04-2017.
 */

public class IssueClassWrapperDto extends BaseDto implements Parcelable {

    @SerializedName("UserId")
    private Integer userId;

    private Integer DepartmentId;

    @SerializedName("IssueClass")
    private List<IssueClassDto> issueClass;

    public Integer getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        DepartmentId = departmentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public List<IssueClassDto> getIssueClass() {
        return issueClass;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setIssueClass(List<IssueClassDto> issueClass) {
        this.issueClass = issueClass;
    }

    protected IssueClassWrapperDto(Parcel in) {
        userId = in.readByte() == 0x00 ? null : in.readInt();
        DepartmentId = in.readByte() == 0x00 ? null : in.readInt();
        if (in.readByte() == 0x01) {
            issueClass = new ArrayList<IssueClassDto>();
            in.readList(issueClass, IssueClassDto.class.getClassLoader());
        } else {
            issueClass = null;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (userId == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(userId);
        }
        if (DepartmentId == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(DepartmentId);
        }
        if (issueClass == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(issueClass);
        }
    }

    public static final Parcelable.Creator<IssueClassWrapperDto> CREATOR = new Parcelable.Creator<IssueClassWrapperDto>() {
        @Override
        public IssueClassWrapperDto createFromParcel(Parcel in) {
            return new IssueClassWrapperDto(in);
        }

        @Override
        public IssueClassWrapperDto[] newArray(int size) {
            return new IssueClassWrapperDto[size];
        }
    };
}

