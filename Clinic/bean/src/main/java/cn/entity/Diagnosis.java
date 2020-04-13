package cn.entity;

/**
 * 疾病表
 */
public class Diagnosis {
    private Integer diagnosisId;
    private String diagnosisName;
    @Override
    public String toString() {
        return "Diagnosis{" +
                "diagnosisId=" + diagnosisId +
                ", diagnosisName='" + diagnosisName + '\'' +
                '}';
    }

    public Integer getDiagnosisId() {
        return diagnosisId;
    }

    public void setDiagnosisId(Integer diagnosisId) {
        this.diagnosisId = diagnosisId;
    }

    public String getDiagnosisName() {
        return diagnosisName;
    }

    public void setDiagnosisName(String diagnosisName) {
        this.diagnosisName = diagnosisName;
    }
}
