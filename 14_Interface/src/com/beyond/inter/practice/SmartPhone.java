package com.beyond.inter.practice;

public class SmartPhone extends Product implements Basic {


    private String mobileAgency; // 통신사


    public SmartPhone() {
      super();
    }

    public SmartPhone(String code, String name, String brand, int price, String mobileAgency) {

       super(code, name, brand, price);

        this.mobileAgency = mobileAgency;
    }


    public String getMobileAgency() {
        return mobileAgency;
    }

    public void setMobileAgency(String mobileAgency) {
        this.mobileAgency = mobileAgency;
    }


    @Override
    public void turnOn(){
        System.out.println("스마트폰을 켭니다.");
    }

    @Override
    public void turnOff(){
        System.out.println("스마트폰을 끕니다.");
    }


    @Override
    public String information(){
        return String.format("%s, mobileAgency : %s \n",
                super.information(), mobileAgency);
    }
}

