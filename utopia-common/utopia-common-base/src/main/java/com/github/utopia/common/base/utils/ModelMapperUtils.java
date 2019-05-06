package com.github.utopia.common.base.utils;


import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: Dto和转换
 * @author: tianzehua
 * @date: 2018-09-15 22:33
 */
public class ModelMapperUtils {

   private static ModelMapper modelMapper = new ModelMapper();

    /**
     * @description: 将实体类转成Dto
     * @param o 需要被转换的实体
     * @param t 要转换成的Dto
     */
    public  static <T> T  Main2Dto(Object o,Class<T> t){
        T map = modelMapper.map(o, t);

        return map;
    }

    /**
     * @description: 将Dto转换为实体类
     * @param o 需要被转换的Dto
     * @param t 要被转换成的实体类
     */
    public static <T> T Dto2Main(Object o,Class<T> t){
        T map = modelMapper.map(o, t);

        return map;
    }

    /**
     * @description: 将实体类集合转换成Dto集合
     * @param objects 要被转换的实体类集合
     * @param t 要转换成的Dto
     */
    public static <T> List<T> MainList2DtoList (List objects,Class<T> t){

        List<T> ts = new ArrayList<>();

        for (Object o: objects){
            T map = modelMapper.map(o, t);
            ts.add(map);
        }
        return ts;
    }

    /**
     * @description: 将Dto集合转换成实体类集合
     * @param objects 要被转换的Dto
     * @param t 要转换成的实体类
     */
    public static <T> List<T> DtoList2MainList(List objects,Class<T> t){

        List<T> ts = new ArrayList<>();

        for (Object o: objects){
            T map = modelMapper.map(o, t);
            ts.add(map);
        }
        return ts;
    }

}
