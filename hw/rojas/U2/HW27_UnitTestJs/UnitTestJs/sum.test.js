const sum = require('./sum');

test('suma 1 + 2 es igual a 3', () => {
  expect(sum(1, 2)).toBe(3);
});

test('suma -1 + 5 es igual a 4', () => {
  expect(sum(-1, 5)).toBe(4);
});
