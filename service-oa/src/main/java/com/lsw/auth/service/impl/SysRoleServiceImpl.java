package com.lsw.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lsw.auth.mapper.SysRoleMapper;
import com.lsw.auth.service.SysRoleService;
import com.lsw.model.system.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 装傻
 * @create 2023-03-09 23:58
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {
}
