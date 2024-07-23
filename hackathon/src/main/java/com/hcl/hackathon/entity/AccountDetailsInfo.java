package com.hcl.hackathon.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="accountDetailsInfo")
@Entity
public class AccountDetailsInfo {

    @Id
    private String accountId;
    private String accountNumber;
    private String bankName;
    private String account_iban;
    private String currency;
    private Date accountOpeningDate;
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private UserDetailsInfo userDetails;
    @OneToMany
    private List<AccountAmountBlockedDetails> accountAmountBlockedDetails;



}
