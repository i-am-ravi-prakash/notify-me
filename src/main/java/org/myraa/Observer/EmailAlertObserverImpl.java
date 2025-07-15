package org.myraa.Observer;

import org.myraa.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    public String emailId;
    public StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId, "Product is back in stock. Hurry up!");
    }

    private void sendMail(String emailId, String msg) {
        // TO-DO - add logic to send email
        System.out.println("Mail sent to: " + emailId);
    }
}
