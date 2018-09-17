import * as React from "react";
import { Container } from "semantic-ui-react";
import { Provider } from "react-redux";
import GetRecipe from "./components/GetRecipe";
import { store } from "./Store";
// import SignIn from "./components/SignIn";
import Register from "./components/Register";

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
            <br />
            {/* <SignIn /> */}
            <br />
            <br />
            <br />
            <br />
            <Register />
          </div>
        </Container>
      </Provider>
    );
  }
}

export default App;
