package com.lsw.auth;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lsw.auth.mapper.SysRoleMapper;
import com.lsw.model.system.SysRole;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @author 装傻
 * @create 2023-03-08 23:50
 */
@SpringBootTest()
public class SysRoleMapperTest {
    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Test
    public void testSelectList() {
        System.out.println("-******");
        List<SysRole> sysRoles = sysRoleMapper.selectList(null);
        System.out.println(sysRoles);
    }

    @Test
    public void testInsert() {
        SysRole sysRole = new SysRole();
        sysRole.setRoleName("角色管理员");
        sysRole.setRoleCode("role");
        sysRole.setDescription("角色管理员");

        int row = sysRoleMapper.insert(sysRole);
        System.out.println(row);
        System.out.println(sysRole);
        System.out.println(sysRole.getId());

    }

    @Test
    public void testUpdateById() {
        SysRole sysRole = new SysRole();
        sysRole.setId(1L);
        sysRole.setRoleName("角色管理员1");

        int row = sysRoleMapper.updateById(sysRole);
        System.out.println(row);
    }

    @Test
    public void testDeleteById(){
        int row = sysRoleMapper.deleteById(2L);
        System.out.println(row);
    }

    @Test
    public void testDeleteBatchIds(){
        int row = sysRoleMapper.deleteBatchIds(Arrays.asList(1, 10));
        System.out.println(row);
    }

    @Test
    public void testSelect1(){
        QueryWrapper<SysRole> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("role_name","角色管理员");
        List<SysRole> sysRoles = sysRoleMapper.selectList(queryWrapper);
        System.out.println(sysRoles);
    }

    @Test
    public void testSelect2(){
        LambdaQueryWrapper<SysRole> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(SysRole::getRoleName,"角色管理员");
        List<SysRole> sysRoles = sysRoleMapper.selectList(queryWrapper);
        System.out.println(sysRoles);
    }
}
