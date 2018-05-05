package com.sxq.eurekaclientservicehello.web.userservice;

import com.sxq.eurekaclientservicehello.web.utils.ConvertUtil;
import com.sxq.eurekaclientservicehello.web.utils.UserGenerator;
import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
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
        logger.info("/getUser, host:" + instance.getHost() + ", serviceId:" + instance.getServiceId());
        return new User(userId);
    }

    @RequestMapping(value = "getUsers", method = RequestMethod.GET)
    public List<User> getUsers(@RequestParam String userIds) {
        logger.info(String.format("in getUsers:usesIds=%s", userIds));
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/getUsers, host:" + instance.getHost() + ", serviceId:" + instance.getServiceId());

        int[] ids = ConvertUtil.convertToIntArr(StringUtils.split(userIds, ","));
        return UserGenerator.generateUsers(ids);
    }
}
