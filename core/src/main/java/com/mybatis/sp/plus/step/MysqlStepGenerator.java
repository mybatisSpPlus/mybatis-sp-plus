package com.mybatis.sp.plus.step;

import com.mybatis.sp.plus.Action;

import java.util.List;

/**
 * @author zhouyu4034@sefonsoft.com
 * @date 2021/4/15 9:10
 */
public class MysqlStepGenerator extends StepGenerator {

    public MysqlStepGenerator(List<Action> actions) {
        super(actions,"`");
    }

}
