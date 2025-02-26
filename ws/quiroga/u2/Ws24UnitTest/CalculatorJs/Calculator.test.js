// Archivo: Calculator.test.js
const { expect } = require('chai');
const Calculator = require('./Calculator');

describe('Calculator', () => {
  let calculator;

  beforeEach(() => {
    calculator = new Calculator();
  });

  it('should return 5 when summing 2 and 3', () => {
    expect(calculator.sum(2, 3)).to.equal(5);
  });

  it('should return 0 when summing -1 and 1', () => {
    expect(calculator.sum(-1, 1)).to.equal(0);
  });

  it('should return 0 when summing 0 and 0', () => {
    expect(calculator.sum(0, 0)).to.equal(0);
  });
});
