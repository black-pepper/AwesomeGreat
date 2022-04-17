//import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';

import {
  BrowserRouter as Router,
  Switch,
  Route,
} from "react-router-dom";
import Main from "./routes/Main";
import Detail from './routes/Detail';

function App() {
  return (
    <Router>
      <Switch>
        <Route path="/main">
          <Main />
        </Route>
        <Route path="/detail/:id">
          <Detail/>
        </Route>
      </Switch>
    </Router>
  );
}

export default App;
