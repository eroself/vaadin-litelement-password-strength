package com.wontlost.password.strength;

import com.nulabinc.zxcvbn.Feedback;
import com.nulabinc.zxcvbn.Strength;
import com.nulabinc.zxcvbn.Zxcvbn;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

@Tag("vaadin-password-strength")
@JsModule("./vaadin-password-strength.js")
public class VaadinPasswordStrength extends Component {

    ResourceBundle resourceBundle;

    public VaadinPasswordStrength() {
        resourceBundle = ResourceBundle.getBundle("passwordStrength", Locale.ENGLISH);
    }

    public VaadinPasswordStrength(String bundle, Locale locale) {
        resourceBundle = ResourceBundle.getBundle(bundle, locale);
    }

    public void setScore(int score) {
        getElement().setProperty("score", score);
    }

    public StrengthFeedback getStrengthFeedback(String password) {
        Strength strength = new Zxcvbn().measure(password);
        // Feedback to pass the ResourceBundle. And to generate a localized Feedback.
        Feedback feedback = strength.getFeedback();
        Feedback localizedFeedback = feedback.withResourceBundle(resourceBundle);
        // getSuggestions() and getWarning() returns localized feedback message.
        List<String> localizedSuggestions = localizedFeedback.getSuggestions();
        String localizedWarning = localizedFeedback.getWarning();
        return new StrengthFeedback(strength, localizedWarning, localizedSuggestions);
    }

}
