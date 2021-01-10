package com.zain.jo.multithreadedboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "user_dpi")
public class User {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Type(type="org.hibernate.type.UUIDCharType")
    @Column(length = 66, columnDefinition = "varchar", nullable = false, updatable = false)
    private UUID id;

    private String firstName;

    private String lastName;

    private String email;

    private Gender gender;

    private String ipAddress;

    private String creditCard;
}
