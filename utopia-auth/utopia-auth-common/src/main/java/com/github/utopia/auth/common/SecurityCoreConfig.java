package com.github.utopia.auth.common;


import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *  为EnableConfigurationProperties注解中的类带有提供有效的支持的安全配置基类
 * @author tianzehua
 * @date 2019/05/06
 */
@Component
@EnableConfigurationProperties()
public class SecurityCoreConfig {
}
