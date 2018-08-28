package com.sanshao.jpa.domain.many2many2many_b;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class SinoUser {
    @Id
    @GeneratedValue
    private long id;
    private String userName;

    @ManyToMany
    @JoinTable(name="sino_user_role",joinColumns = {@JoinColumn(name="u_id")},
            inverseJoinColumns ={@JoinColumn(name="r_id")} )
    private List<SinoRole> roleList = new ArrayList<SinoRole>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<SinoRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<SinoRole> roleList) {
        this.roleList = roleList;
    }

    public void addRole(SinoRole sinoRole){
        roleList.add(sinoRole);
    }


}
