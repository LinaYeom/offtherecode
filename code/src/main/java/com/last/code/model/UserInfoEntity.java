package com.last.code.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="userinfo")
public class UserInfoEntity {

    @Id
    @OneToOne
    @JoinColumn(name = "user_pno")
    private UserEntity userEntity;
    private String userinfo_lang;
    private String userinfo_pofol;
    private String userinfo_photo;
    private String userinfo_other;


}
