package com.sanshao.jpa.domain.many2many2many_b;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class SinoRole {
    @Id
    @GeneratedValue
    private long id;

    private String roleName;

    @ManyToMany(mappedBy = "roleList")
    private List<SinoUser> userList = new ArrayList<SinoUser>();

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="sino_role_permission",joinColumns = {@JoinColumn(name="r_id")},
            inverseJoinColumns ={@JoinColumn(name="p_id")})
    private List<SinoPermission> permissionList = new ArrayList<SinoPermission>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<SinoUser> getUserList() {
        return userList;
    }

    public void setUserList(List<SinoUser> userList) {
        this.userList = userList;
    }

    public List<SinoPermission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<SinoPermission> permissionList) {
        this.permissionList = permissionList;
    }

    public void addPermission(SinoPermission sinoPermission){
        permissionList.add(sinoPermission);
    }
}
