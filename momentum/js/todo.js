const todoForm = document.querySelector("#todo-form");
const todoInput = todoForm.querySelector("input");
const todoList = document.getElementById("todo-list");

let todos = [];

const TODOS_KEY = "todos";

function onTodoSubmit(event) {
    event.preventDefault();
    const newTodo = todoInput.value;
    const newTodoObj = {
        text: newTodo,
        id: Date.now(),
    };
    todoInput.value = "";
    todos.push(newTodoObj);
    saveTodos();
    paintTodo(newTodoObj);
}

function saveTodos() {
    localStorage.setItem(TODOS_KEY, JSON.stringify(todos));
}

function paintTodo(newTodoObj) {
        const li = document.createElement("li")
        li.id = newTodoObj.id;
        const span = document.createElement("span")
        span.innerText = newTodoObj.text ;

        const button = document.createElement("Button")
        button.innerText = "❌"
        button.addEventListener("click", deleteTodo);
        li.appendChild(span); 
        li.appendChild(button);

        todoList.appendChild(li);
}

function deleteTodo(event) {
    const li = event.target.parentElement;
    li.remove();
    todos = todos.filter(todo => todo.id !== parseInt(li.id));
    saveTodos();
}

todoForm.addEventListener("submit", onTodoSubmit);

const savedTodos = localStorage.getItem(TODOS_KEY);

if (savedTodos !== null) {
    const parsedTodos = JSON.parse(savedTodos);
    todos = parsedTodos;
    parsedTodos.forEach(paintTodo);
}

/*
found problem

when there's duplicate elements in array and you want to delete first of them,

the order of the elements in todos[] matters.

ex) [a, b, c, a, d]
trying to delete first a but typical way to delete element in array works with the last element if there's same string.

expected solution)
make id in each list OR the array's element should have properties to differentiate.

*/