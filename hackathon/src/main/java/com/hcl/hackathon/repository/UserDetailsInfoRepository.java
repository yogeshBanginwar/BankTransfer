package com.hcl.hackathon.repository;

import com.hcl.hackathon.entity.UserDetailsInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsInfoRepository extends JpaRepository<UserDetailsInfo,String> {

}
