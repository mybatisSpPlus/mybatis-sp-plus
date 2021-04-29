package com.github.mybatis.sp.plus.functions;

import com.github.mybatis.sp.plus.Function;
import com.github.mybatis.sp.plus.exception.SelfCheckException;

/**
 * 加法
 *
 * @author zhouyu74748585@hotmail.com
 * @date 2021/4/13 9:29
 */
public class Add extends Function {

    Object valueA;

    Object valueB;

    public Add() {
    }

    public Add(Object valueA, Object valueB) {
        this.valueA = valueA;
        this.valueB = valueB;
    }

    public Object getValueA() {
        return valueA;
    }

    public Add setValueA(Object valueA) {
        this.valueA = valueA;
        return this;
    }

    public Object getValueB() {
        return valueB;
    }

    public Add setValueB(Object valueB) {
        this.valueB = valueB;
        return this;
    }

    @Override
    public void selfCheck() throws SelfCheckException {
        if (valueA == null || valueB == null) {
            throw new SelfCheckException("valueA、valueA can not be null in function Add");
        }
    }
}
