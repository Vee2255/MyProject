function init() {
  const inputElement = document.createElement('input')
  inputElement.setAttribute('type', 'text')
  inputElement.setAttribute('placeholder', 'Enter a new task')
  const button = document.createElement('button')
  button.textContent = 'Add'
  const ulElement = document.createElement('ul')
  ulElement.setAttribute('id', 'todoList')

  const divs = document.querySelectorAll('body > div')
  divs[0].appendChild(inputElement)
  divs[0].appendChild(button)
  divs[1].appendChild(ulElement)

  const addBtn = document.getElementsByTagName('button')
  addBtn[0].addEventListener('click', addTask)
}
function addTask() {
  const li = document.createElement('li')

  const inputElement = document.getElementsByTagName('input')
  li.textContent = inputElement[0].value

  const ul = document.getElementById('todoList')
  ul.appendChild(li)

  inputElement[0].value = ''
}
init()
