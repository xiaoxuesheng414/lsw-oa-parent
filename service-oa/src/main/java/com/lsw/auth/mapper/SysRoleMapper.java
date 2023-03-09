package com.lsw.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lsw.model.system.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author 装傻
 * @create 2023-03-09 0:17
 */
//@Repository
@Repository
public interface SysRoleMapper extends BaseMapper<SysRole> {
}
