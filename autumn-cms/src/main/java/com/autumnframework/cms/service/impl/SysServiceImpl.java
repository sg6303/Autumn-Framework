package com.autumnframework.cms.service.impl;

import com.autumnframework.cms.dao.vomapper.interfaces.ISysMapper;
import com.autumnframework.cms.model.vo.SysMenu;
import com.autumnframework.cms.service.interfaces.ISysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 20:37 2017/9/4.
 */
@Service
public class SysServiceImpl implements ISysService {
    @Autowired
    private ISysMapper iSysMapper;
    @Override
    public List<SysMenu> getMenuBySys(String sys) {
        List<SysMenu> sysMenuList = new ArrayList<>();
        try {
            sysMenuList = iSysMapper.getMenuBySys(sys);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sysMenuList;
    }
}
