package com.hcl.hackathon.repository;

import com.hcl.hackathon.entity.AccountDetailsInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDetailsInfoRepository extends JpaRepository<AccountDetailsInfo,String> {
}
