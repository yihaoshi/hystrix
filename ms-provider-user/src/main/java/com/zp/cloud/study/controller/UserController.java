package com.zp.cloud.study.controller;

import com.zp.cloud.study.entity.User;
import com.zp.cloud.study.repository.UserRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
  private final Logger logger = Logger.getLogger(getClass());
	
  @Autowired
  private UserRepository userRepository;
  @Autowired
  private Registration registration;
  

  @GetMapping("/{id}")
  public User findById(@PathVariable Long id) throws Exception {
	  logger.info("用户中心接口：查询用户"+ id +"信息");
      if(id == 10){
          throw new NullPointerException();
      }
	  User findOne = userRepository.findOne(id);

	  return findOne;
  }
  
  @GetMapping("/getIpAndPort")
  public String findById() {
	  return registration.getHost() + ":" + registration.getPort();
  }
}
