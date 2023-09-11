function display(content) {
  if (content === null || content === undefined) {
    return 'no message'
  } else {
    return 'your message is ' + content
  }
}




module.exports = display

// test-demo
// writing the function display(content) to return a concatenated message using the 'your message is ' string and the content parameter."

// Output
// display('hello world!') -> your message is hello world!
// display('123') -> your message is 123
// display(null) -> no message
// display(undefined) ->no message
