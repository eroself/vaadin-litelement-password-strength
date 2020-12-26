import {css, html, LitElement} from "lit-element";
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

    static get styles() {
        return css `
			:host {
				display: block;
				width: 180px;
			}

			#back {
				background: #eee;
			}

			#front {
				height: 5px;
				transition: all .5s;
			}

			:host([score="0"]) #front { width: 0; }
			:host([score="1"]) #front { background: red; width: 20%; }
            :host([score="2"]) #front { background: orange; width: 40%; }
            :host([score="3"]) #front { background: yellow; width: 60%; }
            :host([score="4"]) #front { background: greenyellow; width: 80%; }
            :host([score="5"]) #front { background: green; width: 100%; }
		`;
    }

    render() {
        return html`<password-strength score="${this.score}" style="width: 100%"></password-strength>`;
    }

}

customElements.get('vaadin-password-strength') || customElements.define('vaadin-password-strength', VaadinPasswordStrength);
