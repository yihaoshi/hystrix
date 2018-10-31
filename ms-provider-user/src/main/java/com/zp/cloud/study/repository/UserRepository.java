package com.zp.cloud.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zp.cloud.study.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
