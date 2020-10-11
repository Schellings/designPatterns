package top.xielin.design.create.factory.impl;

import top.xielin.design.create.factory.Provider;
import top.xielin.design.create.factory.Sender;

public class EmailSendFactory implements Provider {
    @Override
    public Sender produce() {
        return new EmailSender();
    }
}
