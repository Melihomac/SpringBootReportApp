package com.Staj.springboot.Melih.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Report {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @NotBlank(message = "documentNumber is mandatory")
    @Column(name = "documentNumber")
    private String documentNumber;
    
    @NotBlank(message = "patientName is mandatory")
    @Column(name = "patientName")
    private String patientName;

    @NotBlank(message = "patientId is mandatory")
    @Column(name = "patientId")
    private String patientId;

    @NotBlank(message = "documentTitle is mandatory")
    @Column(name = "documentTitle")
    private String documentTitle;

    @NotBlank(message = "documentDetail is mandatory")
    @Column(name = "documentDetail")
    private String documentDetail;

    @NotBlank(message = "documentDate is mandatory")
    @Column(name = "documentDate")
    private String documentDate;

    @Column(name = "photo", nullable = true, length = 64)
    private String photo;
    
    public Report() {}

    public Report(String documentNumber, String patientName, String patientId, String documentTitle, String documentDetail, String documentDate, String photo) {
        this.documentNumber = documentNumber;
        this.patientName = patientName;
        this.patientId = patientId;
        this.documentTitle = documentTitle;
        this.documentDetail = documentDetail;
        this.documentDate = documentDate;
        this.photo = photo;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public long getId() {
        return id;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDocumentTitle() {
        return documentTitle;
    }

    public void setDocumentTitle(String documentTitle) {
        this.documentTitle = documentTitle;
    }

    public String getDocumentDetail() {
        return documentDetail;
    }

    public void setDocumentDetail(String documentDetail) {
        this.documentDetail = documentDetail;
    }

    public String getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(String documentDate) {
        this.documentDate = documentDate;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

}