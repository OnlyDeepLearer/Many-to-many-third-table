package com.example.manytomanyhibernate;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "groups")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String groupName;

    private int groupNumber;


    @OneToMany(
            mappedBy = "group",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<UserGroup> userGroups;

    public Group(String groupName, int groupNumber) {
        this.groupName = groupName;
        this.groupNumber = groupNumber;
    }

    public void addUserGroup(UserGroup userGroup) {
        if (Objects.isNull(this.userGroups)) this.userGroups = new ArrayList<>();
        this.userGroups.add(userGroup);
    }


}
