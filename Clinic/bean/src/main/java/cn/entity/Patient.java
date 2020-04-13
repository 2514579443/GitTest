package cn.entity;

/**
 * 患者类
 */
public class Patient {
    private Integer patientId;//患者ID
    private String patientName;//患者名称
    private String kaHao;//患者卡号
    private Integer age;//患者年龄
    private String chuShengRQ;//患者出生日期
    private Integer gender;//患者性别
    private String cellphone;//患者手机号码
    private String idcard;//患者证件号
    private String address;//地址
    private Integer detailed;//详细
    private String grade;//VIP等级

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", kaHao='" + kaHao + '\'' +
                ", age=" + age +
                ", chuShengRQ='" + chuShengRQ + '\'' +
                ", gender=" + gender +
                ", cellphone='" + cellphone + '\'' +
                ", idcard='" + idcard + '\'' +
                ", address='" + address + '\'' +
                ", detailed=" + detailed +
                ", grade='" + grade + '\'' +
                '}';
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getKaHao() {
        return kaHao;
    }

    public void setKaHao(String kaHao) {
        this.kaHao = kaHao;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getChuShengRQ() {
        return chuShengRQ;
    }

    public void setChuShengRQ(String chuShengRQ) {
        this.chuShengRQ = chuShengRQ;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getDetailed() {
        return detailed;
    }

    public void setDetailed(Integer detailed) {
        this.detailed = detailed;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
