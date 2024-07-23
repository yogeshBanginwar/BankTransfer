package com.hcl.hackathon.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="accountAmountBlockedDetails")
@Entity
public class AccountAmountBlockedDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Double blockedAmount;
    private String blockedReferanceNo;
    private Boolean blockedStatus;
    @ManyToOne
    @JoinColumn(name="account_amount_blocked_details", nullable=false)
    private AccountDetailsInfo accountDetailsInfo;
}
