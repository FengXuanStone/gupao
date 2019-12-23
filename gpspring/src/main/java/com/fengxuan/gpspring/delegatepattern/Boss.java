package com.fengxuan.gpspring.delegatepattern;

public class Boss {

    public void command(String command, Leader leader) {
        leader.doing(command);
    }
}
