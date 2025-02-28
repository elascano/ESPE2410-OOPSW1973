export function suma(a, b) {
    return a + b;
  }
  
  export function resta(a, b) {
    return a - b;
  }
  
  export function multiplica(a, b) {
    return a * b;
  }
  
  export function divide(a, b) {
    if (b === 0) throw new Error('Cannot divide by 0');
    return a / b;
  }
  