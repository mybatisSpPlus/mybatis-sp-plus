package com.github.mybatis.sp.plus.actions;

import com.github.mybatis.sp.plus.Action;
import com.github.mybatis.sp.plus.annotation.*;
import com.github.mybatis.sp.plus.exception.SelfCheckException;
import com.github.mybatis.sp.plus.meta.Field;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.github.mybatis.sp.plus.QueryBuilderHelper.arrays;

/**
 * @author zhouyu74748585@hotmail.com
 * @date 2021/4/12 16:59
 */
@_Having
@_Limit
@_Union
@_UnionAll
@_OrderBy
public class GroupBy extends Action {

    List<Field> fields=new ArrayList<>();

    public GroupBy() {
    }

    public GroupBy(List<Field> fields) {
        this.fields = fields;
    }

    public GroupBy(Field... fields) {
        this.fields = arrays(fields);
    }

    public List<Field> getFields() {
        return fields;
    }

    public GroupBy setFields(List<Field> fields) {
        this.fields = fields;
        return this;
    }

    public GroupBy setFields(Field... fields) {
        if (this.fields==null) {
            this.fields = arrays(fields);
        }else {
            this.fields.addAll(Arrays.asList(fields));
        }
        return this;
    }

    @Override
    public void selfCheck() throws SelfCheckException {
        if (fields.size()==0){
            throw new SelfCheckException("fields can not be empty in action Group");
        }
    }

}
