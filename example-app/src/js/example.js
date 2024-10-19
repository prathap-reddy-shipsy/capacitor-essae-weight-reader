import { detectWeight } from 'capacitor-essae-weight-reader';

window.testEcho = () => {
    const inputValue = document.getElementById("echoInput").value;
    detectWeight.echo({ value: inputValue })
}
