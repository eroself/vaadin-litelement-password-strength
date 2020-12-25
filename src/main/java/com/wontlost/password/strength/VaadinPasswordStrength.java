package com.wontlost.password.strength;

import com.nulabinc.zxcvbn.Strength;
import com.nulabinc.zxcvbn.Zxcvbn;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

@Tag("vaadin-password-strength")
@JsModule("./vaadin-password-strength.js")
public class VaadinPasswordStrength extends Component {

     /**
     * Constructor of Vaadin Video.
     */
    public VaadinPasswordStrength() { }

    public void setScore(int score) {
        getElement().setProperty("score", score);
    }

    public int calculate(String password) {
        Zxcvbn zxcvbn = new Zxcvbn();
        Strength strength = zxcvbn.measure(password);
        return strength.getScore();
    }

}
