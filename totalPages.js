const { template } = require('@babel/core')

function totalPages(arrayItems, rowsPerPage) {
  if (arrayItems === null || arrayItems === undefined) {
    return undefined
  }
  if (
    rowsPerPage === null ||
    rowsPerPage === undefined ||
    rowsPerPage === 0
  ) {
    return 1
  }
  const countpage = Math.ceil(arrayItems.length / rowsPerPage)
  return countpage
}

module.exports = totalPages
// ให้เขียน Function ชื่อ totalPages (arrayItems, rowsPerPage) โดยที่ arrayItems คือ array ของรายการ Items ทั้งหมด และ rowsPerPage คือ จำนวนรายการ Item ที่จะแสดงต่อ 1 Page โดยฟังก์ชันจะ return จำนวน page ที่คำนวณได้
// กรณี arrayItems เป็น null หรือ undefined ให้ return undefined

// กรณี rowsPerPage เป็น null หรือ undefined หรือเป็น 0 จะ return 1

// ตัวอย่างเช่น

// arrayItems = [item1, item2, item3,…, item35] , rowsPerPage = 15 return 3
// arrayItems = [item1, item2, item3,…, item10] , rowsPerPage = 20 return 1
// arrayItems = [item1, item2, item3,…, item40] , rowsPerPage = 10 return 4
// arrayItems = [item1, item2, item3,…, item25] , rowsPerPage = 0 return 1
// arrayItems = [item1, item2, item3,…, item25] , rowsPerPage = null return 1
// arrayItems = [item1, item2, item3,…, item25] , rowsPerPage = undefined return 1
// arrayItems = null, rowsPerPage = 20 return undefined
// arrayItems = undefined, rowsPerPage = 20 return undefined
