package com.jackspring.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;

public class InjectViaSetter {

    // memanggil interface HalloSpring //
    private HalloSpring halloSpring;

    // Method setter //
    @Autowired
    public void setHalloSpring(HalloSpring halloSpring) {
        this.halloSpring = halloSpring;
    }


    public void getMessage() {
        halloSpring.sayGoodbye();
    }
}
