import { Mammal } from './Mammal.js';
import { Reptile } from './Reptile.js';

const rex = new Mammal('Rex', 3);
const ramirez = new Reptile('Ramirez', 5);

console.log('Detalles del mamífero:');
console.log(rex.getDetails());
rex.speak();

console.log('\nDetalles del reptil:');
console.log(ramirez.getDetails());
ramirez.speak();
