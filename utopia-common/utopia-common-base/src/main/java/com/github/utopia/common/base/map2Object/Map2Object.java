package com.github.utopia.common.base.map2Object;


import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * @description: 将map转换为对象
 * @author: zgk
 * @date: 2018-08-28 11:07
 */
public class Map2Object {

    /**
     * @description: 参数一为要转换的map,参数2位要转换的对象
     * @author: zgk
     * @date: 2018-08-28 11:31
     */
    public static <T> T map2Object(Map<String,Object> map,Class<T> clazz){
        String s = JSON.toJSONString(map);
        T t = JSON.parseObject(s, clazz);
        return t;
    }

}
