package com.github.utopia.common.base.support;


import com.github.utopia.common.base.constant.GlobalConstant;
import com.github.utopia.common.base.dto.LoginAuthDto;
import com.github.utopia.common.base.enums.ErrorCodeEnum;
import com.github.utopia.common.base.exception.BusinessException;
import com.github.utopia.common.base.utils.PublicUtil;
import com.github.utopia.common.base.utils.ThreadLocalMap;

/**
 * 登陆的相关信息
 * @author tianzehua
 */
public class LoginAuth {

    /**
     * Gets login auth domain.
     *
     * @return the login auth domain
     */
    public static LoginAuthDto getLoginAuthDto() {
        LoginAuthDto loginAuthDto = (LoginAuthDto) ThreadLocalMap.get(GlobalConstant.Sys.TOKEN_AUTH_DTO);
        if (PublicUtil.isEmpty(loginAuthDto)) {
            throw new BusinessException(ErrorCodeEnum.AU10011041);
        }
        return loginAuthDto;
    }
}
