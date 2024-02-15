function init() {
  const addBtn = document.getElementsByClassName('addButton')
  addBtn[0].addEventListener('click',addTask)
  
}
function addTask() {
  const li = document.createElement('li')
  const todoInput = document.querySelector('.todoInput')
  li.textContent = todoInput.value

  const todoList = document.getElementById('todoList')
  todoList.appendChild(li)
  

  todoInput.value = ''
}
init()
