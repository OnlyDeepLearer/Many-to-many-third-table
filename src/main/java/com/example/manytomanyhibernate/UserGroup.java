package com.example.manytomanyhibernate;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "UserGroup")
@Table(name = "users_groups")
public class UserGroup {


    @EmbeddedId
    private UserGroupId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("userId")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("groupId")
    private Group group;


    private LocalDateTime createdAt;


    public UserGroup(User user, Group group, LocalDateTime createdAt) {
        this.user = user;
        this.group = group;
        this.createdAt = createdAt;
        this.id = new UserGroupId(user.getId(), group.getId());
    }


}
