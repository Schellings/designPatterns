package top.xielin.design.create.factory;

import top.xielin.design.create.factory.impl.EmailSendFactory;
import top.xielin.design.create.factory.impl.ExpressSendFactory;
import top.xielin.design.create.factory.impl.SmsSendFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("***普通简单工厂***");
        SenderFactory sendFactory = new SenderFactory();
        Sender senderSms = sendFactory.produce("sms");
        senderSms.Send(); // 发送短信

        Sender senderEmail = sendFactory.produce("email");
        senderEmail.Send(); // 发送邮件

        Sender senderExpress = sendFactory.produce("express");
        senderExpress.Send(); // 发送快递


        System.out.println("***多方法简单工厂***");
        SenderFactory sendFactory2 = new SenderFactory();
        Sender senderEmail2 = sendFactory.produceEmail();
        senderEmail2.Send(); // 发送邮件

        Sender senderSms2 = sendFactory.produceSms();
        senderSms2.Send(); // 发送短信

        Sender senderExpress2 = sendFactory.produceExpress();
        senderExpress2.Send(); // 发送快递

        System.out.println("***静态简单工厂***");
        Sender senderEmail3 = sendFactory.staticProduceEmail();
        senderEmail3.Send(); // 发送邮件

        Sender senderSms3 = sendFactory.staticProduceSms();
        senderSms3.Send(); // 发送短信

        Sender senderExpress3 = sendFactory.staticProduceExpress();
        senderExpress3.Send(); // 发送快递


        System.out.println("***工厂方法模式***");
        Provider providerSms = new SmsSendFactory();
        Sender senderSms4 = providerSms.produce();
        senderSms4.Send(); // 发送短信

        Provider providerEmail = new EmailSendFactory();
        Sender senderEmail4 = providerEmail.produce();
        senderEmail4.Send(); // 发送邮件

        Provider providerExpress = new ExpressSendFactory();
        Sender senderExpress4 = providerExpress.produce();
        senderExpress4.Send(); // 发送快递

    }
}
