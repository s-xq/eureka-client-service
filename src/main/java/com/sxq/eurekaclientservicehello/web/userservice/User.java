package com.sxq.eurekaclientservicehello.web.userservice;

import java.util.Random;

public class User {
    private int mId;
    private String mName;
    private int mAge;


    public User(int userId) {
        this.mId = userId;
        this.mName = String.format("User#%d", mId);
        this.mAge = new Random().nextInt(100);
    }


    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        mAge = age;
    }

    @Override
    public String toString() {
        return String.format("[User] mId=%s, mName=%s, mAge=%s",
                String.valueOf(mId).toString(),
                String.valueOf(mName).toString(),
                String.valueOf(mAge).toString());

    }
}
