package top.xielin.design.create.factory.impl;

import top.xielin.design.create.factory.Sender;

public class ExpressSender implements Sender {
    @Override
    public void Send() {
        System.out.println("发送express");
    }
}
