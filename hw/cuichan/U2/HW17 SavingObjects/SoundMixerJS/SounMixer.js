const fs = require('fs');
const crypto = require('crypto');

const algorithm = 'aes-256-cbc';
const key = crypto.randomBytes(32);
const iv = crypto.randomBytes(16);

class AudioTrack {
    constructor(titleName = "", author = "", durationTime = 0.0) {
        this.titleName = titleName;
        this.author = author;
        this.durationTime = durationTime;
    }

    toString() {
        return `AudioTrack { titleName: ${this.titleName}, author: ${this.author}, durationTime: ${this.durationTime} min }`;
    }
}

function encryptData(data) {
    const cipher = crypto.createCipheriv(algorithm, key, iv);
    let encrypted = cipher.update(data, 'utf-8', 'hex');
    encrypted += cipher.final('hex');
    return encrypted;
}

function decryptData(data) {
    const decipher = crypto.createDecipheriv(algorithm, key, iv);
    let decrypted = decipher.update(data, 'hex', 'utf-8');
    decrypted += decipher.final('utf-8');
    return decrypted;
}

function main() {
    const audioTrack = new AudioTrack("houdini", "Eminem", 4.50);
    const jsonString = JSON.stringify(audioTrack);
    const encryptedData = encryptData(jsonString);
    const fileName = "Tracks.txt";
    fs.writeFileSync(fileName, encryptedData, 'utf-8');
    console.log("Archivo encriptado guardado exitosamente en Tracks.txt!");

    const readEncryptedData = fs.readFileSync(fileName, 'utf-8');
    const decryptedData = decryptData(readEncryptedData);
    const trackInFile = JSON.parse(decryptedData);
    const reconstructedTrack = new AudioTrack(trackInFile.titleName, trackInFile.author, trackInFile.durationTime);
    console.log("Objeto desencriptado:");
    console.log(reconstructedTrack.toString());
}

main();
