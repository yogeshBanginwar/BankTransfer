package com.hcl.hackathon.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="transactionDetails")
@Entity
public class TransactionDetails {
     @Id
    private String transactionId;
    private String userid;
    private String fromAccount;
    private String toAccount;
    private Double amount;
    private Timestamp transactionTime;

}
