import { html, LitElement } from "lit-element";
import '@collaborne/polymer-password-strength';


class VaadinPasswordStrength extends LitElement {

    constructor() {
        super();
    }

    static get properties() {
        return { score: Number };
    }

    firstUpdated(_changedProperties) {
        super.firstUpdated(_changedProperties);
    }

    createRenderRoot() {
        return this;
    }

    render() {
        return html`
            <password-strength score="${this.score}" style="width: 100%"></password-strength>
        `;
    }

}

customElements.get('vaadin-password-strength') || customElements.define('vaadin-password-strength', VaadinPasswordStrength);
