import React, {useState, useEffect} from 'react';
import {BrowserRouter as Router, Link, Switch, Route } from "react-router-dom";
import './App.css';
import axios from 'axios';

function App() {
  const [books , setBooks] = useState(null);
  async function grabAllUsers() {
    try {
      const res = await axios.get('http://localhost:8080/book/list');
      console.log(res.data);
    } catch(e) {
      console.error(e, e.message);
    }
    
  }

  useEffect(() => {
    grabAllUsers();
  })
  return (
    <div className="App">
      
    </div>
  );
}

export default App;
