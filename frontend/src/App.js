//import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';

import {
  BrowserRouter as Router,
  Switch,
  Route,
} from "react-router-dom";
import Main from "./routes/Main";
import Detail from './routes/Detail';
import Modify from './routes/Modify';

function App() {
  return (
    <Router>
      <Switch>
        <Route path="/main" component={Main}/>
        <Route path="/detail/:id" component={Detail}/>
        <Route path="/modify/:id" component={Modify}/>
      </Switch>
    </Router>
  );
}

export default App;
