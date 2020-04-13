package cn.entity;

/**
 * 医嘱表
 */
public class Doctorsadvice {

    private Integer doctorsAdviceId; //医嘱ID
    private String doctorsAdviceName;//医嘱

    @Override
    public String toString() {
        return "Doctorsadvice{" +
                "doctorsAdviceId=" + doctorsAdviceId +
                ", doctorsAdviceName='" + doctorsAdviceName + '\'' +
                '}';
    }

    public Integer getDoctorsAdviceId() {
        return doctorsAdviceId;
    }

    public void setDoctorsAdviceId(Integer doctorsAdviceId) {
        this.doctorsAdviceId = doctorsAdviceId;
    }

    public String getDoctorsAdviceName() {
        return doctorsAdviceName;
    }

    public void setDoctorsAdviceName(String doctorsAdviceName) {
        this.doctorsAdviceName = doctorsAdviceName;
    }
}
