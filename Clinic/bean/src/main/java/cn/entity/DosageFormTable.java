package cn.entity;

/**
 * 剂型表
 */
public class DosageFormTable {
    private Integer dosageFormId;
    private String dosageFormName;

    @Override
    public String toString() {
        return "DosageFormTable{" +
                "dosageFormId=" + dosageFormId +
                ", dosageFormName='" + dosageFormName + '\'' +
                '}';
    }

    public Integer getDosageFormId() {
        return dosageFormId;
    }

    public void setDosageFormId(Integer dosageFormId) {
        this.dosageFormId = dosageFormId;
    }

    public String getDosageFormName() {
        return dosageFormName;
    }

    public void setDosageFormName(String dosageFormName) {
        this.dosageFormName = dosageFormName;
    }
}
