package com.cangle.hapimity.utils;

import java.io.Serializable;

/**
 * @Description 用于生成简码, 简码由8个字节分5部分组成
 * 0 0000000000000000000000000000000000000000000 000 00000 000000000000
 * 1.首位标识符号固定为0 1bit
 * 2.时间戳          43 bit
 * 3.集群中心序号     3 bit
 * 4.集群中机器编号   5 bit
 * 5.序列号          12 bit
 *
 * @author raorui
 * @date 2022/6/16 14:00
 */
public final class ShortCodeGenerator implements Serializable {

    private final long centerId;
    private final long machineId;
    private long sequence = 0L;
    /**
     * 系统当前最新的时间
     */
    private long lastTimestamp = -1L;

    /**
     * 位移数量
     */
    private final int centerIdBits = 3;
    private final int machineIdBits = 5;
    private final int timestampBits = 43;
    private final int sequenceBits = 12;

    private final long maxSequence = ~(-1L << this.sequenceBits);


    /**
     * @param centerId  数据中心编码 取值范围 0~7
     * @param machineId 机器序号 取值范围 0~31
     * @return
     * @desciption ShortCodeGenerator 主键生成器
     */
    public ShortCodeGenerator(long centerId, long machineId) {
        long maxCenterId = ~(-1L << this.centerIdBits);
        if (centerId > maxCenterId || centerId < 0) {
            throw new IllegalArgumentException("the center id is illegal,the value rang 0 to " + maxCenterId);
        }
        long maxMachineId = ~(-1L << this.machineIdBits);
        if (machineId > maxMachineId || machineId < 0) {
            throw new IllegalArgumentException("the machine id is illegal,the value rang 0 to " + maxMachineId);
        }

        this.centerId = centerId;
        this.machineId = machineId;
    }


    private synchronized long nextId() {
        long timestamp = getCurrentTimeStamp();
        if (timestamp < lastTimestamp) {
            throw new RuntimeException(String.format("Abnormal clock, Refusing to generate id for %d milliseconds", lastTimestamp - timestamp));
        }
        //处理同一个时间周期内的生成规则
        if (timestamp == lastTimestamp) {
            this.sequence = ++sequence & maxSequence;
            if (this.sequence == 0) {
                //当前序列使用完,直接进入下一个时钟周期
                timestamp = nextTimeMillis(lastTimestamp);
            }
        } else {
            this.sequence = 0;
        }
        lastTimestamp = timestamp;

        long epoch = 1608604210L;
        int centerShiftBits = sequenceBits + machineIdBits;
        /**
         * 时间戳和集群中心位移值
         * */
        int timestampShiftBits = sequenceBits + centerIdBits + machineIdBits;
        return ((timestamp - epoch) << timestampShiftBits) | (centerId << centerShiftBits) | (machineId << sequenceBits) | sequence;

    }

    private long nextTimeMillis(long timemillis) {
        long current = getCurrentTimeStamp();
        while (current <= timemillis) {
            current = getCurrentTimeStamp();
        }
        return current;

    }

    private long getCurrentTimeStamp() {
        return System.currentTimeMillis();
    }

    /**
     * @param
     * @return java.lang.String
     * @desciption createId 将一个64位数字转成一个16进制的字符串
     */
    public synchronized String createId() {
        long id = this.nextId();
        return Long.toHexString(id);
    }

}

