function init() {
  const addBtn = document.getElementById('addButton')
  addBtn.addEventListener('click', addTask)
}
function addTask() {
  const li = document.createElement('li')
  const todoInput = document.getElementById('todoInput')
  li.textContent = todoInput.value

  const todoList = document.getElementById('todoList')
  todoList.appendChild(li)
  

  todoInput.value = ''
}
init()
