package com.sanshao.jpa.domain.many2many2many_b;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class SinoPermission {
    @Id
    @GeneratedValue
    private long id;

    private String permissionName;

    @ManyToMany(mappedBy = "permissionList")
    private List<SinoRole> roleList = new ArrayList<SinoRole>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public List<SinoRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<SinoRole> roleList) {
        this.roleList = roleList;
    }
}
