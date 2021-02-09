package com.learning.XPath;

import java.util.ArrayList;

public class CaseNote {

    ArrayList<TriggerRequestResource> triggerDetails;
    ArrayList<String> handledByBusinessGroup;
    private Long noteID;
    private String title;
    private String type;
    private String origin;
    private Long created;
    private String createdBy;
    private Long lastModified;
    private String lastModifiedBy;
    private String componentCode;
    private String issueCode;
    private String affectedProduct;
    private String jobRole;
    private String escalationQueue = null;
    private String caller;
    private String customerCountry;
    private String customerFirstName;
    private String customerLastName;
    private String noteSignature = null;
    private String complexity;
    private String affectedDsid;

    public Long getNoteID() {
        return noteID;
    }

    public CaseNote setNoteID(Long noteID) {
        this.noteID = noteID;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public CaseNote setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getType() {
        return type;
    }

    public CaseNote setType(String type) {
        this.type = type;
        return this;
    }

    public String getOrigin() {
        return origin;
    }

    public CaseNote setOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    public Long getCreated() {
        return created;
    }

    public CaseNote setCreated(Long created) {
        this.created = created;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public CaseNote setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Long getLastModified() {
        return lastModified;
    }

    public CaseNote setLastModified(Long lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public CaseNote setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public String getComponentCode() {
        return componentCode;
    }

    public CaseNote setComponentCode(String componentCode) {
        this.componentCode = componentCode;
        return this;
    }

    public String getIssueCode() {
        return issueCode;
    }

    public CaseNote setIssueCode(String issueCode) {
        this.issueCode = issueCode;
        return this;
    }

    public String getAffectedProduct() {
        return affectedProduct;
    }

    public CaseNote setAffectedProduct(String affectedProduct) {
        this.affectedProduct = affectedProduct;
        return this;
    }

    public String getJobRole() {
        return jobRole;
    }

    public CaseNote setJobRole(String jobRole) {
        this.jobRole = jobRole;
        return this;
    }

    public String getEscalationQueue() {
        return escalationQueue;
    }

    public CaseNote setEscalationQueue(String escalationQueue) {
        this.escalationQueue = escalationQueue;
        return this;
    }

    public String getCaller() {
        return caller;
    }

    public CaseNote setCaller(String caller) {
        this.caller = caller;
        return this;
    }

    public String getCustomerCountry() {
        return customerCountry;
    }

    public CaseNote setCustomerCountry(String customerCountry) {
        this.customerCountry = customerCountry;
        return this;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public CaseNote setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
        return this;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public CaseNote setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
        return this;
    }

    public String getNoteSignature() {
        return noteSignature;
    }

    public CaseNote setNoteSignature(String noteSignature) {
        this.noteSignature = noteSignature;
        return this;
    }

    public String getComplexity() {
        return complexity;
    }

    public CaseNote setComplexity(String complexity) {
        this.complexity = complexity;
        return this;
    }

    public String getAffectedDsid() {
        return affectedDsid;
    }

    public CaseNote setAffectedDsid(String affectedDsid) {
        this.affectedDsid = affectedDsid;
        return this;
    }

    public ArrayList<TriggerRequestResource> getTriggerDetails() {
        return triggerDetails;
    }

    public CaseNote setTriggerDetails(ArrayList<TriggerRequestResource> triggerDetails) {
        this.triggerDetails = triggerDetails;
        return this;
    }
}
