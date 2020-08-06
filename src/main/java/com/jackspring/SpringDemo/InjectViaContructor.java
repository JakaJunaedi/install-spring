package com.jackspring.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class InjectViaContructor {

    // menggunakan method constructor //
   private HalloSpring halloSpring;

   @Autowired
    public InjectViaContructor(HalloSpring halloSpring) {
        this.halloSpring = halloSpring;
    }

    public void getMessage() {
       halloSpring.sayHallo();
       halloSpring.sayGoodbye();
    }
}
