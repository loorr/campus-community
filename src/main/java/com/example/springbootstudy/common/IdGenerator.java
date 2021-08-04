package com.example.springbootstudy.common;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.RandomUtil;

/**
 * id 生成工具类
 * @author zjianfa
 */
public class IdGenerator {
    private static final int UID_LENGTH;
    private static Snowflake snowflake;

    static {
        UID_LENGTH = 10;
        snowflake = IdUtil.createSnowflake(1, 1);
    }

    /**
     * @return 生成系统用户或者群组id 10 位
     */
    public static Long getUid(){
        return Long.valueOf(RandomUtil.randomNumbers(UID_LENGTH));
    }

    /**
     * @return 生成雪花id
     */
    public static Long getSnowflake(){
        return snowflake.nextId();
    }
}
