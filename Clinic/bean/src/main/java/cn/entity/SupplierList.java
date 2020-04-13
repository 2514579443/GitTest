package cn.entity;

/**
 * 供应商表
 */
public class SupplierList {
    private Integer suppLierId; //供应商ID
    private Integer suppLierNumber;//供应商编号
    private Integer suppLierName;//供应商名称
    private Integer theContact;//供应商联系人
    private Integer number;//供应商联系号码
    private Integer creationTime;//供应商创建时间
    private Integer founder;//供应商创建人
    private Integer state;//状态0启用1不启用

    @Override
    public String toString() {
        return "SupplierList{" +
                "suppLierId=" + suppLierId +
                ", suppLierNumber=" + suppLierNumber +
                ", suppLierName=" + suppLierName +
                ", theContact=" + theContact +
                ", number=" + number +
                ", creationTime=" + creationTime +
                ", founder=" + founder +
                ", state=" + state +
                '}';
    }

    public Integer getSuppLierId() {
        return suppLierId;
    }

    public void setSuppLierId(Integer suppLierId) {
        this.suppLierId = suppLierId;
    }

    public Integer getSuppLierNumber() {
        return suppLierNumber;
    }

    public void setSuppLierNumber(Integer suppLierNumber) {
        this.suppLierNumber = suppLierNumber;
    }

    public Integer getSuppLierName() {
        return suppLierName;
    }

    public void setSuppLierName(Integer suppLierName) {
        this.suppLierName = suppLierName;
    }

    public Integer getTheContact() {
        return theContact;
    }

    public void setTheContact(Integer theContact) {
        this.theContact = theContact;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Integer creationTime) {
        this.creationTime = creationTime;
    }

    public Integer getFounder() {
        return founder;
    }

    public void setFounder(Integer founder) {
        this.founder = founder;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
