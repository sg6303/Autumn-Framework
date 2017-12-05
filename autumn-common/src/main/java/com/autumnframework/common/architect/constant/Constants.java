package com.autumnframework.common.architect.constant;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 13:37 2017/11/2.
 */
public class Constants {

    /**用户登录名称*/
    public static final String SESSION_KEY_LOGIN_NAME="LOGIN_NAME";
    /**初始化密码*/
    public static final String INIT_LOGIN_PWD = "123456";

    public static final String REGISTER_AUTH_EMAIL_SUBJECT = "Autumn-Blog注册激活邮件";
    public static final String REGISTER_AUTH_LINK = "https://shuaijunlan.cn/autumn-blog/register/auth?user_login_name=#1&activation_code=#2&time=#3";
    public static final String REGISTER_AUTH_TEMPLATE = "<a href = '?'>账号激活链接，24小时后此链接失效</a>";
}
