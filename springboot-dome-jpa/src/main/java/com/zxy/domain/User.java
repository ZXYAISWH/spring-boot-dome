package com.zxy.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "users")
public class User {
    @Id
    private Integer u_Id;
    @Column(name = "u_name")
    private String u_name;
    @Column(name = "u_password")
    private String u_password;
}
