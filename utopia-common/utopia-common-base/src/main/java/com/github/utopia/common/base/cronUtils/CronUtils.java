package com.github.utopia.common.base.cronUtils;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description: cron
 * @author: zgk
 * @date: 2018-10-17 17:34
 */
public class CronUtils {

    private static final String FORMAT = "ss mm HH dd MM ? yyyy";

    /**
     * @description: 常用调度
     * @param date 常用调度时间
     * @author: zgk
     * @date: 2018-10-17 22:22
     * @company: ©2018版权所有 中科浩鼎科技股份有限公司
     */

    public static String commonScheduling(Date date){

        //传入的时间
        //格式化时间
        String cronTime = new SimpleDateFormat(FORMAT).format(date);

        //转化为数组并遍历存入时间类中
        String[] times = cronTime.split(" ");
        //取出时分秒存入时间类
        Time time = new Time();
        time.setHour(times[2]);
        time.setMinute(times[1]);
        time.setSecond(times[0]);

        return time.toString();
    }

    /**
     * @description: 特殊调度时间
     * @param date 特殊调度时间
     * @author: zgk
     * @date: 2018-10-17 22:35
     * @company: ©2018版权所有 中科浩鼎科技股份有限公司
     */
    public static String specialScheduling(Date date){

        //传入的时间
        //格式化时间
        String cronTime = new SimpleDateFormat(FORMAT).format(date);

        //转化为数组并遍历存入时间类中
        String[] times = cronTime.split(" ");
        //取出月日时分秒存入时间类
        Time time = new Time();
        time.setMonth(times[4]);
        time.setDay(times[3]);
        time.setHour(times[2]);
        time.setMinute(times[1]);
        time.setSecond(times[0]);

        return time.toString();

    }
}
