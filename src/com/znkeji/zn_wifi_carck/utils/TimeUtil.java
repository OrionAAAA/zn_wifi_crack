package com.znkeji.zn_wifi_carck.utils;

/**
 * 时间计算工具
 * @author OrionAAAA
 * @date 2022/1/27 16:03
 */
public class TimeUtil {

    static final long MILLS_PER_SECOND = 1000L;
    static final int SECOND_PER_MINUTE = 60;
    static final int MINUTE_PER_HOUR = 60;
    static final long MILLS_PER_MINUTE = SECOND_PER_MINUTE * MILLS_PER_SECOND;
    static final long MILLS_PER_HOUR = MINUTE_PER_HOUR * MILLS_PER_MINUTE;

    public static String TimeDiff(String title, long startTime){
        long timeDiff = System.currentTimeMillis() - startTime;
        return Timestamp2String(title, timeDiff);
    }

    public static String Timestamp2String(String title, long timestamp){
        int h = (int)(timestamp / MILLS_PER_HOUR);
        int m = (int)((timestamp % MILLS_PER_HOUR) / MILLS_PER_MINUTE);
        int s = (int)((timestamp % MILLS_PER_MINUTE) / MILLS_PER_SECOND);
        return String.format("%s：%02d:%02d:%02d", title, h, m, s);
    }


}
