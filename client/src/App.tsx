import * as React from "react";

import GetRecipe from "./components/GetRecipe";

class App extends React.Component {
  public render() {
    return (
      <div className="App">
        <header className="App-header">
          <h1 className="App-title">Welcome to React</h1>
        </header>
        <GetRecipe />
      </div>
    );
  }
}

export default App;
