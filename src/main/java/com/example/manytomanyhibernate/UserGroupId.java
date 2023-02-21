package com.example.manytomanyhibernate;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class UserGroupId implements Serializable {


    @Column(name = "user_id")
    private int userId;

    @Column(name = "group_id")
    private int groupId;


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//
//        if (o == null || getClass() != o.getClass())
//            return false;
//
//        UserGroupId that = (UserGroupId) o;
//        return Objects.equals(userId, that.userId) &&
//                Objects.equals(groupId, that.groupId);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(userId, groupId);
//    }


}
