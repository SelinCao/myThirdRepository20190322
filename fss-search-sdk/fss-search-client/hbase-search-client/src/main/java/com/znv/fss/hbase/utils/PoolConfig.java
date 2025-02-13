/*
 * Copyright 2015-2016 Dark Phoenixs (Open-Source Organization).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.znv.fss.hbase.utils;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

import java.io.Serializable;

/**
 * <p>
 * Title: PoolConfig
 * </p>
 * <p>
 * Description: 默认池配置
 * </p>
 *
 * @author Victor
 * @version 1.0
 * @see GenericObjectPoolConfig
 * @see Serializable
 * @since 2015年9月19日
 */
public class PoolConfig extends GenericObjectPoolConfig implements Serializable {

    /**
     * DEFAULT_TEST_WHILE_IDLE
     */
    public static final boolean DEFAULT_TEST_WHILE_IDLE = true;
    /**
     * DEFAULT_MIN_EVICTABLE_IDLE_TIME_MILLIS
     */
    public static final long DEFAULT_MIN_EVICTABLE_IDLE_TIME_MILLIS = 60000;
    /**
     * DEFAULT_TIME_BETWEEN_EVICTION_RUNS_MILLIS
     */
    public static final long DEFAULT_TIME_BETWEEN_EVICTION_RUNS_MILLIS = 30000;
    /**
     * DEFAULT_NUM_TESTS_PER_EVICTION_RUN
     */
    public static final int DEFAULT_NUM_TESTS_PER_EVICTION_RUN = -1;

    public static final int DEFAULT_MAX_TOTAL_NUM = 100;

    public static final int DEFAULT_MAX_IDEL_NUM = 100;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -2414567557372345057L;

    /**
     * <p>
     * Title: PoolConfig
     * </p>
     * <p>
     * Description: 默认构造方法
     * </p>
     */
    public PoolConfig() {

        // defaults to make your life with connection pool easier :)
        setTestWhileIdle(DEFAULT_TEST_WHILE_IDLE);
        setMinEvictableIdleTimeMillis(DEFAULT_MIN_EVICTABLE_IDLE_TIME_MILLIS);
        setTimeBetweenEvictionRunsMillis(DEFAULT_TIME_BETWEEN_EVICTION_RUNS_MILLIS);
        setNumTestsPerEvictionRun(DEFAULT_NUM_TESTS_PER_EVICTION_RUN);
        setMaxTotal(DEFAULT_MAX_TOTAL_NUM);
        setMaxIdle(DEFAULT_MAX_IDEL_NUM);
    }
}
