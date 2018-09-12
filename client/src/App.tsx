import * as React from "react";
import GetRecipe from "./components/recipes/GetRecipe";
import "./App.css";

class App extends React.Component {
  public render() {
    return (
      <div className="App">
        <GetRecipe />
      </div>
    );
  }
}

export default App;
