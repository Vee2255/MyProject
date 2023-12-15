//65130500125 อัชมาวีย์ สนูวงศ์



function addNewProduct(item) {
 if (item === "") return
 const newItem = document.createElement("div")
 newItem.setAttribute("id",item)
 newItem.setAttribute("class","product-item")
 const inputItem = document.createElement("p")
 const itemName = document.createTextNode(item)
 newItem.appendChild(inputItem)
 inputItem.appendChild(itemName)

 const rmBtn = document.createElement("button")
 const rmText = document.createTextNode("Remove")
 rmBtn.appendChild(rmText)
 newItem.appendChild(rmBtn)
 rmBtn.addEventListener("click",removeProduct)
 
}

function removeProduct(productId) {
 const itemWantRm = document.getElementById(productId)
 remove(itemWantRm)

}

function removeAllProduct() {
 const allItemToRm = document.querySelectorAll(".product-item")
 remove(allItemToRm)
}

function registerEvent() {
const addBtn = document.getElementById("add-button")
const removeAllBtn =document.getElementById("removeAll-button")
addBtn.addEventListener('click',addNewProduct)
removeAllBtn.addEventListener('click',removeAllProduct)
}

registerEvent()


