package com.archie.ShowPal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity(name = "SP_USER")
public class User extends BaseModel{
    private String name;
    private String email;
    private String password;
    @OneToMany
    private List<Ticket> tickets;
}
