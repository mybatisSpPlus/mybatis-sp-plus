package com.mybatis.sp.plus.conditions;

import com.mybatis.sp.plus.Condition;
import com.mybatis.sp.plus.exception.SelfCheckException;
import com.mybatis.sp.plus.meta.Field;

/**
 * @author zhouyu74748585@hotmail.com
 * @date 2021/4/8 10:34
 */
public class Lte extends Condition {

    Field field;

    Object value;

    public Lte() {
    }

    public Lte(Field field, Object value) {
        this.field = field;
        this.value = value;
    }

    public Field getField() {
        return field;
    }

    public Lte setField(Field field) {
        this.field = field;
        return this;
    }

    public Object getValue() {
        return value;
    }

    public Lte setValue(Object value) {
        this.value = value;
        return this;
    }

    @Override
    public void selfCheck() throws SelfCheckException {
        if (field==null||value==null){
            throw new SelfCheckException("field、value can not be null in condition Lte");
        }
        field.selfCheck();
        if (value instanceof Field){
            ((Field) value).selfCheck();
        }
    }
}
