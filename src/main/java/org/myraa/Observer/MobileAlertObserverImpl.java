package org.myraa.Observer;

import org.myraa.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    public String userName;
    public StocksObservable observable;

    public MobileAlertObserverImpl(String userName, StocksObservable observable){
        this.userName = userName;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendMessageOnMobile(userName, "Product is back in stock. Hurry up!");
    }

    private void sendMessageOnMobile(String userName, String msg) {
        //TO-DO - add logic to send SMS
        System.out.println("Message sent to: " + userName);
    }
}
