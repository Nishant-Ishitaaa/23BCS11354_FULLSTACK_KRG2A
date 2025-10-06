import React, { useState } from "react";
import "./App.css";

function App() {
  const [task, setTask] = useState("");
  const [todos, setTodos] = useState([]);

  const handleAddTask = () => {
    if (task.trim() === "") return;
    setTodos([...todos, { id: Date.now(), text: task, completed: false }]);
    setTask("");
  };

  const toggleComplete = (id) => {
    setTodos(
      todos.map((todo) =>
        todo.id === id ? { ...todo, completed: !todo.completed } : todo
      )
    );
  };

  const handleDelete = (id) => {
    setTodos(todos.filter((todo) => todo.id !== id));
  };

  const handleKeyPress = (e) => {
    if (e.key === "Enter") {
      handleAddTask();
    }
  };

  return (
    <div className="app">
      <h1>React To-Do App</h1>
      <div className="input-container">
        <input
          type="text"
          placeholder="Add a new task..."
          value={task}
          onChange={(e) => setTask(e.target.value)}
          onKeyPress={handleKeyPress}
        />
        <button onClick={handleAddTask}>Add</button>
      </div>
      <ul className="todo-list">
        {todos.map(({ id, text, completed }) => (
          <li key={id} className={completed ? "completed" : ""}>
            <span onClick={() => toggleComplete(id)}>{text}</span>
            <button onClick={() => handleDelete(id)}>✕</button>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
