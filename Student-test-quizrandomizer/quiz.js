//Write your student id, firstname, and lastname in a single line comment before starting your program
//students who do not put this comment will get 50% taken off their score.
//ID:65130500125   Name:Achmavee Sanuwong 

import { quizQuestions, getRandomQuiz } from "./quizQuestions.js";

let randomQuiz;

function init() {
const newQuizBtn = document.createElement('button')
newQuizBtn.addEventListener('click',generateQuiz)
newQuizBtn.textContent = 'New Qiiz'

const clearQuizBtn = document.createElement('button')
clearQuizBtn.addEventListener('click',clearQuiz)
clearQuizBtn.textContent = 'Clear quiz'

const menu = document.getElementById('menu')
menu.appendChild(newQuizBtn)
menu.appendChild(clearQuizBtn)

}

function generateQuiz() {
    
clearQuiz()
const randomQuiz = getRandomQuiz()


const op1 = document.createElement('button')
const op2 = document.createElement('button')
const op3 = document.createElement('button')
const op4 = document.createElement('button')

op1.textContent= randomQuiz.options[0]
op2.textContent= randomQuiz.options[1]
op3.textContent= randomQuiz.options[2]
op4.textContent= randomQuiz.options[3]



const quizContainer = document.querySelector('#quizContainer')
quizContainer.appendChild(op1)
quizContainer.appendChild(op2)
quizContainer.appendChild(op3)
quizContainer.appendChild(op4)

op1.addEventListener('click',checkAnswer)
op2.addEventListener('click',checkAnswer)
op3.addEventListener('click',checkAnswer)
op4.addEventListener('click',checkAnswer)



}

function clearQuiz() {
const quizContainer = document.querySelector('div#quizContainer')
const answer = document.querySelector('div.answer')

quizContainer.innerHTML = ''
answer.innerHTML = ''
}

function checkAnswer(e) {
const randomQuiz = getRandomQuiz()
const answer = document.querySelector('.answer')
if (e === randomQuiz.answer )return answer.textContent = 'Correct'
    else return answer.textContent = 'Incorrect'
}

init();


