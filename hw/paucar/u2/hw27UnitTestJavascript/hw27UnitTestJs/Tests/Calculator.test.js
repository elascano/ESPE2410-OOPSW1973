
const { sum, subtract, multiply } = require('./math');

test('sum adds 1 + 2 to equal 3', () => {
  expect(sum(1, 2)).toBe(3);
});

test('sum adds 0 + 0 to equal 0', () => {
  expect(sum(0, 0)).toBe(0);
});

test('sum adds -1 + 1 to equal 0', () => {
  expect(sum(-1, 1)).toBe(0);
});

// Prueba para la función subtract
test('subtract subtracts 2 - 1 to equal 1', () => {
  expect(subtract(2, 1)).toBe(1);
});

test('subtract subtracts 5 - 7 to equal -2', () => {
  expect(subtract(5, 7)).toBe(-2);
});

test('subtract subtracts 0 - 0 to equal 0', () => {
  expect(subtract(0, 0)).toBe(0);
});

// Prueba para la función multiply
test('multiply multiplies 2 * 3 to equal 6', () => {
  expect(multiply(2, 3)).toBe(6);
});

test('multiply multiplies 0 * 5 to equal 0', () => {
  expect(multiply(0, 5)).toBe(0);
});

test('multiply multiplies -3 * 3 to equal -9', () => {
  expect(multiply(-3, 3)).toBe(-9);
});
