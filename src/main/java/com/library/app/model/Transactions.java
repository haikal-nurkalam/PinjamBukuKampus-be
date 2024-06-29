package com.library.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer book_id;

    private Integer member_id;

    private Integer status_id;

    private String loan_start_date;

    private String loan_end_date;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at = new Date();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookId() {
        return book_id;
    }

    public void setBookId(Integer book_id) {
        this.book_id = book_id;
    }

    public Integer getMemberId() {
        return member_id;
    }

    public void setMemberId(Integer member_id) {
        this.member_id = member_id;
    }

    public Integer getStatusId() {
        return status_id;
    }

    public void setStatusId(Integer status_id) {
        this.status_id = status_id;
    }

    public String getLoanStartDate() {
        return loan_start_date;
    }

    public void setLoanStartDate(String loan_start_date) {
        this.loan_start_date = loan_start_date;
    }

    public String getLoanEndDate() {
        return loan_end_date;
    }

    public void setLoanEndDate(String loan_end_date) {
        this.loan_end_date = loan_end_date;
    }

}
