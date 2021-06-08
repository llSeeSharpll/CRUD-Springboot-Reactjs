import './App.css';
import Home from './components/Home'
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import ClientList from './components/ClientList';
import ClientEdit from "./components/ClientEdit";

function App() {
  return (
    <div className="App">
      <Router>
          <Switch>
            <Route path='/' exact={true} component={Home}/>
            <Route path='/clients' exact={true} component={ClientList}/>
            <Route path='/clients/:id' component={ClientEdit}/>
          </Switch>
        </Router>
    </div>
  );
}

export default App;
