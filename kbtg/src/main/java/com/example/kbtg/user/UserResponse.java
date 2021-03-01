
package com.example.kbtg.user;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@Getter
@Setter
@SuppressWarnings("unused")
public class UserResponse {

    private Long Id;
    private String Name;
    private Long Age;

    public UserResponse(Long id, String name, Long age) {
        Age = age;
        Id = id;
        Name = name;
    }
}
