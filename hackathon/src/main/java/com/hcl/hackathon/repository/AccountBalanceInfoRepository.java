package com.hcl.hackathon.repository;

import com.hcl.hackathon.entity.AccountBalanceInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountBalanceInfoRepository extends JpaRepository<AccountBalanceInfo,Integer> {
}
