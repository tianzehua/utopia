package com.github.utopia.common.base.utils;


import com.xiaoleilu.hutool.date.DateField;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * The class Date util.
 *
 * @author tianzehua
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DateUtil {

	/**
	 * 获取系统之前时间.
	 *
	 * @param minute the minute
	 *
	 * @return the before time[yyyy-MM-dd HH:mm:ss]
	 */
	public static String getBeforeTime(int minute) {
		Date newDate = com.xiaoleilu.hutool.date.DateUtil.offset(new Date(), DateField.MINUTE, -minute);
		return com.xiaoleilu.hutool.date.DateUtil.formatDateTime(newDate);
	}

	/**
	 * 获取系统当前时间.
	 *
	 * @param
	 *
	 * @return the before time[yyyy-MM-dd HH:mm:ss]
	 */
	public static String getNowTime() {
		Date newDate = new Date();
		return com.xiaoleilu.hutool.date.DateUtil.formatDateTime(newDate);
	}

	/**
	 * 将时间转化为时间戳.
	 *
	 * @param  s
	 *
	 * @return long 时间戳
	 */

	public static Long dateToStamp(String s) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = simpleDateFormat.parse(s);
		long ts = date.getTime();
		return ts;
	}

	/**
	 * 将日期转化为字符串.
	 *
	 * @param date 日期
	 *
	 * @return string 时间
	 */
	public static String dateToString(Date date) throws ParseException{
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return simpleDateFormat.format(date);
	}

	/**
	 * 截取日期字符串 不要年 比如2018-10-16 转成 10-16 .
	 *
	 * @param  date
	 *
	 * @return string 时间
	 */

	public static String subDate(String date){
		return date.substring(5,10);
	}

	/**
	 * 指定返回当天的前几天 正数往后推 负数往前推
	 * @auther: niugengyun
	 * @param date
	 * @param day
	 * @return
	 */
	public static Date returnPre(Date date, int day) {
	 	Calendar calendar = new GregorianCalendar();
	 	calendar.setTime(date);
	 	calendar.add(Calendar.DATE, day);
	 	return calendar.getTime();
	 }

	/**
	 * 获取当前后一天日期
	 * @auther: niugengyun
	 * @param date
	 * @return
	 */
	public static Date getNextDay(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE,1);
		Date time = cal.getTime();
		return time;
	}

	/**
	 * 根据第几年的第几周  获取那周周一的时期
	 * @auther: niugengyun
	 * @param
	 * @return
	 */

	public static String getMonOfWeek(int year,int week) throws ParseException {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.WEEK_OF_YEAR, week);
		cal.set(Calendar.DAY_OF_WEEK, 2); // 1表示周日，2表示周一，7表示周六
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
	}

    public static Date getXMonth(Date endDate, int i) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(endDate);
		cal.add(Calendar.MONTH,i);
		Date time = cal.getTime();
		return time;
    }
}
