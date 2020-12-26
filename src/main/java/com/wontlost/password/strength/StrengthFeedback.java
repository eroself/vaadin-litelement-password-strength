package com.wontlost.password.strength;

import com.nulabinc.zxcvbn.Strength;

import java.util.List;

public class StrengthFeedback {

    Strength strength;

    List<String> localizedSuggestions;

    String localizedWarning;

    public StrengthFeedback() { }

    public StrengthFeedback(Strength strength, String localizedWarning, List<String> localizedSuggestions) {
        this.strength = strength;
        this.localizedWarning = localizedWarning;
        this.localizedSuggestions = localizedSuggestions;
    }

    public Strength getStrength() {
        return strength;
    }

    public void setStrength(Strength strength) {
        this.strength = strength;
    }

    public List<String> getLocalizedSuggestions() {
        return localizedSuggestions;
    }

    public void setLocalizedSuggestions(List<String> localizedSuggestions) {
        this.localizedSuggestions = localizedSuggestions;
    }

    public String getLocalizedWarning() {
        return localizedWarning;
    }

    public void setLocalizedWarning(String localizedWarning) {
        this.localizedWarning = localizedWarning;
    }

}
