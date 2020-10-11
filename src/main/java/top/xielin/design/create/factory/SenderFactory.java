package top.xielin.design.create.factory;

import top.xielin.design.create.factory.impl.EmailSender;
import top.xielin.design.create.factory.impl.ExpressSender;
import top.xielin.design.create.factory.impl.SmsSender;

public class SenderFactory {

    public Sender produce(String type) {
        if (type == null) {
            return null;
        } else if ("email".equalsIgnoreCase(type)) {
            return new EmailSender();
        } else if ("sms".equalsIgnoreCase(type)) {
            return new SmsSender();
        } else if ("express".equalsIgnoreCase(type)) {
            return new ExpressSender();
        } else {
            return null;
        }
    }

    public Sender produceSms(){
        return new SmsSender();
    }

    public Sender produceEmail(){
        return new EmailSender();
    }

    public Sender produceExpress() {
        return new ExpressSender();
    }

    public static Sender staticProduceSms(){
        return new SmsSender();
    }

    public static Sender staticProduceEmail(){
        return new EmailSender();
    }

    public static Sender staticProduceExpress() {
        return new ExpressSender();
    }
}
