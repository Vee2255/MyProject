function greeting(someone) {
  if (someone) {
    return 'hello, ' + someone;
  } else {
    return 'hello, guest';
  }
  
  }


module.exports = greeting;
