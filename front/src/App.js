//import './App.css';
import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';

import {
  BrowserRouter as Router,
  Switch,
  Route,
} from "react-router-dom";
import Main from "./routes/Main";
import Detail from './routes/Detail';
import Modify from './routes/Modify';
import Join from './routes/Join';
import Login from './routes/Login';

function App() {
  return (
    <Router>
      <Switch>
        <Route path="/main" component={Main}/>
        <Route path="/detail/:id" component={Detail}/>
        <Route path="/modify/:id" component={Modify}/>
        <Route path="/join" component={Join}/>
        <Route path="/login" component={Login}/>
      </Switch>
    </Router>
  );
}

export default App;
