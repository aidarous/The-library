import React from 'react';
import {BrowserRouter as Router, Link, Switch, Route } from "react-router-dom";



import './App.css';
import Fiction from './components/Fiction';

function App() {
  

  
  
  return (
    <Router>
    <div className="App">
      <nav className="nav-bar">
        <ul>
          <li><Link to="/Home">Home </Link></li>
          <li><Link to="/Fiction">Fiction </Link></li>
          <li><Link to="/Language">Language </Link></li>
          <li><Link to="/Programming">Programming </Link></li>
        </ul>
      </nav>
     <Switch>
       
       <Route path='/Fiction'>
         <Fiction />
       </Route>
     </Switch>
    </div>
    </Router>    
  );
}

export default App;
