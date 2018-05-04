package com.sxq.eurekaclientservicehello.web.userservice;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class UserController {

    private final Logger logger = Logger.getLogger(getClass().getName());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "getUser", method = RequestMethod.GET)
    public User getUser(@RequestParam int userId) {
        logger.info(String.format("in getUser:userId=%s", String.valueOf(userId)));
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/hello, host:" + instance.getHost() + ", serviceId:" + instance.getServiceId());
        return new User(userId);
    }
}
