package com.sxq.eurekaclientservicehello.web.utils;

import com.sxq.eurekaclientservicehello.web.userservice.User;

import java.util.ArrayList;
import java.util.List;

public class UserGenerator {

    /**
     * generate list of user by ids
     *
     * @param userIds
     * @return
     */
    public static List<User> generateUsers(int[] userIds) {
        List<User> res = new ArrayList<>();
        for (int id : userIds) {
            res.add(new User(id));
        }
        return res;
    }
}
