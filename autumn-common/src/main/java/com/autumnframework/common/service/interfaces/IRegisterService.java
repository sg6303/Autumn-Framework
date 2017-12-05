package com.autumnframework.common.service.interfaces;


import com.autumnframework.common.model.bo.DataPageResponseMsg;
import com.autumnframework.common.model.bo.ResponseMsg;
import com.autumnframework.common.model.po.User;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 15:09 2017/10/25.
 */
public interface IRegisterService {
    /**
     * 根据登录名查询用户
     * @param userLoginName
     * @return
     */
    User selectUserByloginName(String userLoginName);

    /**
     * 获取所有的用户
     * @return
     */
    DataPageResponseMsg selectAllUser(int page, int limit);

    /**
     * 插入一条用户
     * @param user
     * @return
     */
    ResponseMsg registerUser(User user);

    /**
     * 根据用户登录名改变用户状态
     * @param state
     * @param user_login_name
     * @return
     */
    ResponseMsg updateUserStateByLoginName(int state, String user_login_name);

    /**
     * 用户激活认证
     * @param user_login_name
     * @param activation_code
     * @param time
     * @return
     */
    ResponseMsg registerAuth(String user_login_name, String activation_code, String time);
}
