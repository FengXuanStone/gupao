package com.fengxuan.gpspring.delegatepattern;

import java.util.HashMap;
import java.util.Map;

public class Leader implements IEmployee {

    private Map<String, IEmployee> targets = new HashMap<>();

    public Leader() {
        targets.put("加密", new EmployeeA());
        targets.put("登录", new EmployeeB());
    }

    //项目经理自己不干活
    @Override
    public void doing(String command) {
        targets.get(command).doing(command);
    }
}
