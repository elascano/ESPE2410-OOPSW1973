import fs from "fs";

export class FileSaver {
    saveAsCSV(data, fileName) {
        const headers = Object.keys(data[0]);
        const rows = data.map(row => headers.map(header => row[header]).join(','));

        const csvContent = `${headers.join(',')}\n${rows.join('\n')}`;
        this.saveToFile(fileName, csvContent);
    }

    saveAsJSON(object, fileName) {
        const jsonContent = JSON.stringify(object, null, 2);
        this.saveToFile(fileName, jsonContent);
    }

    saveToFile(fileName, content) {
        fs.writeFile(fileName, content, (err) => {
            if (err) {
                console.error('Error saving file:', err);
                return;
            }
            console.log(`File saved as ${fileName}`);
        });
    }
}

