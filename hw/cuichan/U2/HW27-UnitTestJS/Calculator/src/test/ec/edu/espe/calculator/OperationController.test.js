import { suma, resta, multiplica, divide } from '../../../../../main/ec/edu/espe/calculator/view/Calculator.js';

function assert(condicion, mensaje) {
  if (!condicion) {
    throw new Error(mensaje || 'Fail Test');
  }
}

console.log('Starting tests for the calculator...');

try {
  assert(suma(3, 2) === 5, 'Sum of 3 + 2 should be 5');

  assert(resta(5, 3) === 2, 'Subtraction of 5 - 3 should be 2');

  assert(multiplica(4, 3) === 12, 'Multiplication of 4 * 3 should be 12');

  assert(divide(10, 2) === 5, 'Division of 10/2 should be 5');

  try {
    divide(10, 0);
    assert(false, 'Division by 0 should throw an error');
  } catch (error) {
    assert(error.message === 'Cannot divide by 0', 'Incorrect error message for division by 0');
  }

  console.log('✅ all tests passed successfully.');
} catch (error) {
  console.error('❌ Error in testing:', error.message);
}
