import { readFile, writeFile } from 'fs/promises';

let template = await readFile(new URL('./template.html', import.meta.url), 'utf-8');
console.log(template);
// process.stdin.write(template);
// console.log(__dirname);

const templateData = {
    title: 'Unacademy',
    body: 'Node course'
}

for(const [k, v] of Object.entries(templateData)) {
    template = template.replace(`{{${k}}}`, v);
}

await writeFile(new URL('./index.html', import.meta.url), template);