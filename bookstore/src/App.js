import React, {useState, useEffect} from 'react';

import './App.css';
import axios from 'axios';

function App() {
  const [input , useInput] = useState(null);
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
