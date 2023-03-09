package com.lsw.auth;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lsw.auth.mapper.SysRoleMapper;
import com.lsw.auth.service.impl.SysRoleServiceImpl;
import com.lsw.model.system.SysRole;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

/**
 * @author 装傻
 * @create 2023-03-08 23:50
 */
@SpringBootTest()
public class SysRoleMapperTest1 {
    @Autowired
    private SysRoleServiceImpl sysRoleService;

    @Test
    public void testSelectList() {
        System.out.println("-******");
        List<SysRole> sysRoles = sysRoleService.list();
        System.out.println(sysRoles);
    }


}
