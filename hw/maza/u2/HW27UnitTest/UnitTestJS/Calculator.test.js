
const Calculator = require('./Calculator');


test('adds 0.1 + 0.2 to equal 0.3', () => {
  expect(Calculator.add(0.1, 0.2)).toBe(0.3); 
});


test('subtracts 0.3 - 0.2 to equal 0.1', () => {
  expect(Calculator.subtract(0.3, 0.2)).toBe(0.1); // Esto también fallará
});
