package cn.entity;

/**
 * 附加费类
 */
public class Surchar {

    private Integer surcharId;//附加费ID
    private String surcharName;//附加费名称
    private double surcharPrice;//附加费费用

    @Override
    public String toString() {
        return "Surchar{" +
                "surcharId=" + surcharId +
                ", surcharName='" + surcharName + '\'' +
                ", surcharPrice=" + surcharPrice +
                '}';
    }

    public Integer getSurcharId() {
        return surcharId;
    }

    public void setSurcharId(Integer surcharId) {
        this.surcharId = surcharId;
    }

    public String getSurcharName() {
        return surcharName;
    }

    public void setSurcharName(String surcharName) {
        this.surcharName = surcharName;
    }

    public double getSurcharPrice() {
        return surcharPrice;
    }

    public void setSurcharPrice(double surcharPrice) {
        this.surcharPrice = surcharPrice;
    }
}
