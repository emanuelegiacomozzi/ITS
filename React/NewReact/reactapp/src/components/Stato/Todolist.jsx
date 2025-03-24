//import React, 
import {useState} from 'react';

function TodoList(){
    const[todos, setTodos] = useState([]);

    const addTodo = (todo) => {
        setTodos(prevTodos => [...prevTodos, todo]); //Aggiungo un nuovo todo
    };

    return (
        <div>
            <h1>Lista Todo</h1>
            <button onClick={() => addTodo('Nuovo Todo')}>Aggiungi Todo</button>
            <ul>
                {todos.map((todo,index) => (
                    <li key={index}>{todo}</li>
                ))}
            </ul>
        </div>
    );
};

export default TodoList;