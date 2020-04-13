package cn.entity.entity2;

/**
 * 药品表2
 * 补充
 */
public class Drug2 {
    private String drugClassName; //药品类型
    private String dosageFormName;//药剂类型
    private String suppLierNumber;//供应商名称
    private String invoiceName;//发票类型名称

    @Override
    public String toString() {
        return "Drug2{" +
                "dosageFormName='" + dosageFormName + '\'' +
                ", suppLierNumber='" + suppLierNumber + '\'' +
                ", invoiceName='" + invoiceName + '\'' +
                '}';
    }

    public String getDrugClassName() {
        return drugClassName;
    }

    public void setDrugClassName(String drugClassName) {
        this.drugClassName = drugClassName;
    }

    public String getDosageFormName() {
        return dosageFormName;
    }

    public void setDosageFormName(String dosageFormName) {
        this.dosageFormName = dosageFormName;
    }

    public String getSuppLierNumber() {
        return suppLierNumber;
    }

    public void setSuppLierNumber(String suppLierNumber) {
        this.suppLierNumber = suppLierNumber;
    }

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName;
    }
}
