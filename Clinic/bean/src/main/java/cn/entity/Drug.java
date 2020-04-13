package cn.entity;

import cn.entity.entity2.Drug2;

/**
 * 药品表
 */
public class Drug {

    private Integer id; //药品ID
    private Integer drugClassId; //药品
    private String drugName;//药品名称
    private String drugBarcode;//药品条形码
    private String genericName;//药品通用名
    private String pinyin;//药品拼音
    private String drugSpecifications;//药品规范
    private Integer dosageFormId;//药剂类型ID
    private Integer otc;
    private Integer suppLierId;//药品供应商ID
    private Integer state;//药品状态
    private Integer invoiceId;//发票类型
    private String theTitanic;//
    private Integer type;//类型中药或西药
    private String creationTime;

    private Drug2 drug2; //补充字段

    @Override
    public String toString() {
        return "Drug{" +
                "id=" + id +
                ", drugClassId=" + drugClassId +
                ", drugName='" + drugName + '\'' +
                ", drugBarcode='" + drugBarcode + '\'' +
                ", genericName='" + genericName + '\'' +
                ", pinyin='" + pinyin + '\'' +
                ", drugSpecifications='" + drugSpecifications + '\'' +
                ", dosageFormId=" + dosageFormId +
                ", otc=" + otc +
                ", suppLierId=" + suppLierId +
                ", state=" + state +
                ", invoiceId=" + invoiceId +
                ", theTitanic='" + theTitanic + '\'' +
                ", type=" + type +
                ", creationTime='" + creationTime + '\'' +
                ", drug2=" + drug2 +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDrugClassId() {
        return drugClassId;
    }

    public void setDrugClassId(Integer drugClassId) {
        this.drugClassId = drugClassId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugBarcode() {
        return drugBarcode;
    }

    public void setDrugBarcode(String drugBarcode) {
        this.drugBarcode = drugBarcode;
    }

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getDrugSpecifications() {
        return drugSpecifications;
    }

    public void setDrugSpecifications(String drugSpecifications) {
        this.drugSpecifications = drugSpecifications;
    }

    public Integer getDosageFormId() {
        return dosageFormId;
    }

    public void setDosageFormId(Integer dosageFormId) {
        this.dosageFormId = dosageFormId;
    }

    public Integer getOtc() {
        return otc;
    }

    public void setOtc(Integer otc) {
        this.otc = otc;
    }

    public Integer getSuppLierId() {
        return suppLierId;
    }

    public void setSuppLierId(Integer suppLierId) {
        this.suppLierId = suppLierId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getTheTitanic() {
        return theTitanic;
    }

    public void setTheTitanic(String theTitanic) {
        this.theTitanic = theTitanic;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public Drug2 getDrug2() {
        return drug2;
    }

    public void setDrug2(Drug2 drug2) {
        this.drug2 = drug2;
    }
}
