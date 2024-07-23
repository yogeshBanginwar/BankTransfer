package com.hcl.hackathon.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="user_details_info")
@Entity
public class UserDetailsInfo {
    @Id
    private String userId;
    private String userName;
    private String password;
    @OneToMany(mappedBy = "userDetails")
    private List<AccountDetailsInfo> accounts;

}
