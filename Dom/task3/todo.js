function init() {
  const addBtn = document.getElementsByTagName('button')
  addBtn[0].addEventListener('click', addTask)
}
function addTask() {
  const li = document.createElement('li')

  const input = document.getElementsByTagName('input')
  li.textContent = input[0].value

  const ul = document.getElementById('todoList')
  ul.appendChild(li)

  input[0].value = ''
}
init()
