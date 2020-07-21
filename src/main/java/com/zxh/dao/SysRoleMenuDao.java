package com.zxh.dao;

import java.util.List;
import java.util.Map;

import com.zxh.entity.SysRoleMenuEntity;
import com.zxh.util.BaseDao;

/**
 * 角色与菜单对应关系
 *
 */
public interface SysRoleMenuDao extends BaseDao<SysRoleMenuEntity> {

    /**
     * 根据角色ID，获取菜单ID列表
     *
     * @param roleId 角色ID
     * @return 菜单ID列表
     */
    List<Long> queryMenuIdList(Long roleId);

    /**
     * 删除角色与菜单关系
     *
     * @param roleId 角色ID
     */
    void deleteNoMapper(Long roleId);

    /**
     * 保存角色与菜单关系
     *
     * @param map Map
     */
    void save(Map<String, Object> map);
}
