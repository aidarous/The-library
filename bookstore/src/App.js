import React from 'react';
import logo from './logo.svg';
import './App.css';
import axios from 'axios';

function App() {
  const [input, useInput] = useState("");
  async function grabAllUsers() {
    try {
      const res = await axios.get('http://localhost:8080/book//sellBook');
      console.log(res.data);
    } catch(e) {
      console.error(e, e.message);
    }
    useEffect(() => {
      grabAllUsers();
    })
  }
  return (
    <div className="App">
      
    </div>
  );
}

export default App;
