import * as React from "react";
import { Container } from "semantic-ui-react";
import { Provider } from "react-redux";
import GetRecipe from "./components/GetRecipe";
import { store } from "./Store";

class App extends React.Component {
  public render() {
    return (
      <Provider store={store}>
        <Container>
          <div className="App">
            <header className="App-header">
              <h1 className="App-title">Welcome to React</h1>
            </header>
            <GetRecipe />
          </div>
        </Container>
      </Provider>
    );
  }
}

export default App;
