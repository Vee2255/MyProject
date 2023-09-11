function fizzBuzz(max) {
  let result = '';

  for (let i = 1; i <= max; i++) {
    if (i % 3 === 0 && i % 5 === 0) {
      result += 'FizzBuzz';
    } else if (i % 3 === 0) {
      result += 'Fizz';
    } else if (i % 5 === 0) {
      result += 'Buzz';
    } else {
      result += i.toString();
    }

  
    if (i !== max) {
      result += '';
    }
  }

  return result;
}

module.exports = fizzBuzz
console.log(fizzBuzz(10)) // Output: "12Fizz4BuzzFizz78FizzBuzz"
console.log(fizzBuzz(16)) // Output: "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz16"
