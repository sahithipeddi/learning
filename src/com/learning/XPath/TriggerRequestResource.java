package com.learning.XPath;

public class TriggerRequestResource {

    private Boolean phiFlag;
    private String type;
    private String businessUnit;
    private String questionId;
    private String questionText;
    private String answerId;
    private String answerText;
    private String templateId;
    private String treeId;
    private String jobRole;

    public Boolean getPhiFlag() {
        return phiFlag;
    }

    public TriggerRequestResource setPhiFlag(Boolean phiFlag) {
        this.phiFlag = phiFlag;
        return this;
    }

    public String getType() {
        return type;
    }

    public TriggerRequestResource setType(String type) {
        this.type = type;
        return this;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public TriggerRequestResource setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    public String getQuestionId() {
        return questionId;
    }

    public TriggerRequestResource setQuestionId(String questionId) {
        this.questionId = questionId;
        return this;
    }

    public String getQuestionText() {
        return questionText;
    }

    public TriggerRequestResource setQuestionText(String questionText) {
        this.questionText = questionText;
        return this;
    }

    public String getAnswerId() {
        return answerId;
    }

    public TriggerRequestResource setAnswerId(String answerId) {
        this.answerId = answerId;
        return this;
    }

    public String getAnswerText() {
        return answerText;
    }

    public TriggerRequestResource setAnswerText(String answerText) {
        this.answerText = answerText;
        return this;
    }

    public String getTemplateId() {
        return templateId;
    }

    public TriggerRequestResource setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    public String getTreeId() {
        return treeId;
    }

    public TriggerRequestResource setTreeId(String treeId) {
        this.treeId = treeId;
        return this;
    }

    public String getJobRole() {
        return jobRole;
    }

    public TriggerRequestResource setJobRole(String jobRole) {
        this.jobRole = jobRole;
        return this;
    }

    @Override
    public String toString() {
        return "TriggerRequestResource{" +
                "phiFlag=" + phiFlag +
                ", type='" + type + '\'' +
                ", businessUnit='" + businessUnit + '\'' +
                ", questionId='" + questionId + '\'' +
                ", questionText='" + questionText + '\'' +
                ", answerId='" + answerId + '\'' +
                ", answerText='" + answerText + '\'' +
                ", templateId='" + templateId + '\'' +
                ", treeId='" + treeId + '\'' +
                ", jobRole='" + jobRole + '\'' +
                '}';
    }
}
