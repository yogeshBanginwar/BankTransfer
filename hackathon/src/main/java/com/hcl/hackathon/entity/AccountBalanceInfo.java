package com.hcl.hackathon.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="accountBalanceInfo")
@Entity
public class AccountBalanceInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "accountDetails")
    private AccountDetailsInfo accountId;
   private Double balance;



}
