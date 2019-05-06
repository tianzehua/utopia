package com.github.utopia.common.base.enums;


/**
 * The class Error code enum.
 *
 * @author tianzehua
 */
public enum ErrorCodeEnum {
    /*参数异常 */
    GL99990100(9999100, "参数异常"),

    GL99990101(9999101, "要操作的数据不存在"),

    GL99990401(99990401, "无访问权限"),

    GL99990500(500, "服务器异常"),

    GL99990403(9999403, "无权访问"),

    GL9999404(9999404, "找不到指定资源"),

    GL99990001(99990001, "注解使用错误"),

    GL99990002(99990002, "微服务不在线,或者网络超时"),

    GL99992007(99992007,"删除失败,id = "),

    //	 1001 用户中心
    AU10010001(10010001, "会话超时,请刷新页面重试"),

    AU10010002(10010002, "TOKEN解析失败"),

    AU10011001(10011001, "用户Id不能为空"),

    AU10011002(10011002, "找不到用户,loginName=%s"),

    AU10011003(10011003, "找不到用户,userId=%s"),

    AU10011014(10011014, "密码不能为空"),

    AU10011016(10011016, "用户名或密码错误"),

    AU10011039(10011039, "验证token失败"),

    AU10011040(10011040, "解析header失败"),

    AU10011041(10011041, "页面已过期,请重新登录"),

    AU10011042(10011042, "用户名重复,userName = "),

    AU10011043(10011043, "用户保存失败,userName = "),

    AU10011044(10011044, "邮箱或联系电话重复"),

    AU10011045(10011045, "删除用户失败 userId = "),

    AU10011046(10011046, "更新用户失败 userId = "),

    AU10011047(10011047, "更新用户状态失败 userId = "),

    AU10011048(10011048, "关联角色信息失败 userRole = "),

    AU10011049(10011049, "该部门未添加角色信息 deptName = "),

    ;
    private int code;
    private String msg;

    /**
     * Msg string.
     *
     * @return the string
     */
    public String msg() {
        return msg;
    }

    /**
     * Code int.
     *
     * @return the int
     */
    public int code() {
        return code;
    }

    ErrorCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * Gets enum.
     *
     * @param code the code
     *
     * @return the enum
     */
    public static ErrorCodeEnum getEnum(int code) {
        for (ErrorCodeEnum ele : ErrorCodeEnum.values()) {
            if (ele.code() == code) {
                return ele;
            }
        }
        return null;
    }
}
