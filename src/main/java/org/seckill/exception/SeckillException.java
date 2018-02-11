package org.seckill.exception;

/**
 * 秒杀关闭异常
 * Created by chenjun on 2017/12/19.
 */
public class SeckillException extends RuntimeException{

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
