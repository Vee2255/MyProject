function init() {
  const title = document.createComment('title')
  title.textContent = 'Registration From'
  const head = document.querySelector('head')
  head.appendChild(title)

  const body = document.querySelector('body')
  const h2 = document.createElement('h2')
  h2.textContent = 'Register'
  body.appendChild(h2)

  const div = document.createElement('div')
  body.appendChild(div)

  const label = document.createElement('label')
  label.setAttribute('for', 'name')
  label.textContent = 'Full Name'
  div.appendChild(label)

  const input = document.createElement('input')
  input.setAttribute('type', 'text')
  input.setAttribute('id', 'name')
  input.setAttribute('name', 'name')
  input.setAttribute('required', '')
  div.appendChild(input)

  const div2 = document.createElement('div')
  body.appendChild(div2)

  const label2 = document.createElement('label')
  label2.textContent = 'Email Address'
  div2.appendChild(label2)

  const input2 = document.createElement('input')
  input2.setAttribute('for', 'email')
  input2.setAttribute('id', 'email')
  input2.setAttribute('name', 'email')
  input2.setAttribute('required', '')
  div2.appendChild(input2)

  const div3 = document.createElement('div')
  body.appendChild(div3)

  const button = document.createElement('button')
  button.setAttribute('type', 'submit')
  button.textContent = 'Register'
  div3.appendChild(button)

  const div4 = document.createElement('div')
  body.appendChild(div4)

  const registerBtn = document.querySelector('button')
  registerBtn.addEventListener('click', showUserRegister)
  //แถมมม
  input.addEventListener('keydown', function(event){
    if (event.key === 'Enter' && input2.value.trim() != '' && input.value.trim() != '') {
      showUserRegister()
    } 
  })
  input2.addEventListener('keydown', function(event){
    if (event.key === 'Enter' && input.value.trim() != '' && input2.value.trim() != '') {
      showUserRegister()
    }
  })
  


  

  function showUserRegister() {
    const pElement = document.createElement('p')
    const allDiv = document.querySelectorAll('div')
    const lastDiv = allDiv[allDiv.length - 1]
    lastDiv.appendChild(pElement)

    const nameInput = document.getElementById('name')
    const emailInput = document.getElementById('email')
    pElement.textContent = nameInput.value + ', ' + emailInput.value
  }
}
init()
