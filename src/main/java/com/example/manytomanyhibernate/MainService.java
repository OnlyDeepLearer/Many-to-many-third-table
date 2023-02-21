package com.example.manytomanyhibernate;


import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class MainService {

    private final UserRepo userRepo;

    private final GroupRepo groupRepo;


    public MainService(UserRepo userRepo, GroupRepo groupRepo) {
        this.userRepo = userRepo;
        this.groupRepo = groupRepo;
    }


    public void test() {

        User user = new User("Akmal", "Mingyasharov", "99890");
        Group group = new Group("English", 22);


        UserGroup userGroup = new UserGroup(user, group, LocalDateTime.now());
//        user.addUserGroup(userGroup);

        group.addUserGroup(userGroup);



        System.out.println("user = " + user);
        System.out.println("group = " + group);

//        userRepo.save(user);
        groupRepo.save(group);
    }

}
