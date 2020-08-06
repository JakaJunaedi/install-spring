package com.jackspring.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class HalloSpringImp implements HalloSpring{

    @Override
    public void sayHallo() {
        System.out.println("Hallo Nama Saya Jaka");

    }
        public void sayGoodbye() {
            System.out.println("Saya Baru Belajar Spring");
    }
}
