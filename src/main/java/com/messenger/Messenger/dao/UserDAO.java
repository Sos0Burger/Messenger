package com.messenger.Messenger.dao;

import com.messenger.Messenger.dto.ResponseUserDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDAO {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "nickname")
    private String nickname;
    @Column(name = "pending")
    private List<Integer> pendingFriends;
    @Column(name = "friends")
    private List<Integer> friends;


    public ResponseUserDTO toDTO(){
        return new ResponseUserDTO(id, email, password);
    }
}
