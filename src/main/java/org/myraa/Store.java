package org.myraa;

import org.myraa.Observable.IphoneObservableImpl;
import org.myraa.Observable.StocksObservable;
import org.myraa.Observer.EmailAlertObserverImpl;
import org.myraa.Observer.MobileAlertObserverImpl;
import org.myraa.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iPhoneObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz1@gmail.com", iPhoneObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl("xyz_username", iPhoneObservable);
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl("abc@gmail.com", iPhoneObservable);


        iPhoneObservable.add(observer1);
        iPhoneObservable.add(observer2);
        iPhoneObservable.add(observer3);

        iPhoneObservable.setStockCount(10);
    }
}