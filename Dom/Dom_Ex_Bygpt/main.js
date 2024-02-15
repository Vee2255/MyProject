function init() {
  const addBtn = document.createElement('button')
  addBtn.setAttribute('id', 'addBtn')
  addBtn.textContent = 'Add Item'
  const div1 = document.getElementById('div1')
  div1.appendChild(addBtn)

  const removeAllBtn = document.createElement('button')
  const div3 = document.getElementById('div3')
  div3.appendChild(removeAllBtn)
  removeAllBtn.textContent = 'Remove All'
  removeAllBtn.addEventListener('click',removeAll)

  addBtn.addEventListener('click', addItem)


}

function addItem() {
  const ul = document.querySelector('#div2 > ul')
  const input = document.querySelector('#div1 > input')
  if (input.value.trim() === '') {
    alert('Please enter an item name.')
    return
  }
  const li = document.createElement('li')
  li.setAttribute('id', input.value)

  li.textContent = input.value
  ul.appendChild(li)

  const removeBtn = document.createElement('button')
  removeBtn.textContent = 'Remove'
  li.appendChild(removeBtn)
  removeBtn.addEventListener('click', function () {
    ul.removeChild(li)
  })
  input.value = ''
}

function removeAll (){
    const itemToRmAll = document.querySelectorAll('#div2 > ul >li')
    itemToRmAll.forEach((item)=>{
        item.remove()
    })
}

init()
