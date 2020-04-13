package cn.entity;

/**
 * 发票类型类
 */
public class Invoice {
    private Integer invoiceId;//发票类型ID
    private String invoiceName;//发票类型名称

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName;
    }
}
