package com.sanshao.jpa.service;

import com.sanshao.jpa.domain.many2many2many_b.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

//@Service
public class Many2Many2ManybService implements CommandLineRunner {
    @Autowired
    SinoUserRepository sinoUserRepository;

    @Autowired
    SinoRoleRepository sinoRoleRepository;

    @Autowired
    SinoPermissionRepository sinoPermissionRepository;


    @Override
    @Transactional
    public void run(String... args) throws Exception {
        SinoUser sinoUser1 = new SinoUser();
        sinoUser1.setUserName("钱寅");

        SinoUser sinoUser2 = new SinoUser();
        sinoUser2.setUserName("sanshao");

        SinoRole sinoRole1 = new SinoRole();
        sinoRole1.setRoleName("总经理");

        SinoRole sinoRole2 = new SinoRole();
        sinoRole2.setRoleName("保洁员");

        SinoPermission sinoPermission1 = new SinoPermission();
        sinoPermission1.setPermissionName("开除员工");

        SinoPermission sinoPermission2 = new SinoPermission();
        sinoPermission2.setPermissionName("打扫卫生");

        sinoUser1.addRole(sinoRole1);
//        sinoUser1.addRole(sinoRole2);
//        sinoUser2.addRole(sinoRole1);
        sinoUser2.addRole(sinoRole2);

        sinoRole1.addPermission(sinoPermission1);
        sinoRole1.addPermission(sinoPermission2);
        sinoRole2.addPermission(sinoPermission2);

        sinoPermissionRepository.save(sinoPermission1);
        sinoPermissionRepository.save(sinoPermission2);
        sinoRoleRepository.save(sinoRole1);
        sinoRoleRepository.save(sinoRole2);
        sinoUserRepository.save(sinoUser1);
        sinoUserRepository.save(sinoUser2);

        //获取
//        List<SinoUser> sinoUserArrayList = sinoUserRepository.findAll();
//        for(SinoUser sinoUser:sinoUserArrayList){
//            List<SinoRole> sinoRoles = sinoUser.getRoleList();
//            for(SinoRole sinoRole:sinoRoles){
//                List<SinoPermission> sinoPermissions = sinoRole.getPermissionList();
//                for(SinoPermission sinoPermission:sinoPermissions){
//                    System.out.println(sinoUser.getUserName()+":"+sinoRole.getRoleName()+":"+sinoPermission.getPermissionName());
//                }
//            }
//        }




    }
}
