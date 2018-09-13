import * as React from "react";
import { Container } from "semantic-ui-react";
import GetRecipe from "./components/GetRecipe";

class App extends React.Component {
  public render() {
    return (
      <Container>
        <div className="App">
          <header className="App-header">
            <h1 className="App-title">Welcome to React</h1>
          </header>
          <GetRecipe />
        </div>
      </Container>
    );
  }
}

export default App;
