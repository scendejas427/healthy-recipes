import * as React from "react";
import axios from "axios";
// export interface IAppProps {
// }

export default class GetRecipe extends React.Component<any, any> {
  constructor(props: any) {
    super(props);
    this.state = {
      recipes: [],
      search: ""
    };
  }

  public handleChange = (e: any) => {
    const newState = { ...this.state };
    newState[e.target.name] = e.target.value;
    this.setState(newState);
  };

  public searchRecipe = async (e: any) => {
    e.preventDefault();
    const { search } = this.state;
    const res = await axios.get(
      `https://api.edamam.com/search?q=${search}&app_id=c71621aa&app_key=2b7de0e604c8a0bf9f16e4b6419b9835`
    );
    console.log(res.data.hits);
    this.setState({
      recipes: res.data.hits
    });
  };

  public render() {
    return (
      <div>
        <input
          onChange={this.handleChange}
          type="text"
          name="search"
          value={this.state.search}
        />
        <button onClick={this.searchRecipe}>Search</button>
        {this.state.recipes.map((recipe: any) => {
          return (
            <div key={recipe.recipe.url}>
              <h1>
                Name:
                {recipe.recipe.label}
              </h1>
              <h1>Calories: {Math.round(recipe.recipe.calories)}</h1>
              <img src={recipe.recipe.image} alt="No Image Available" />
            </div>
          );
        })}
      </div>
    );
  }
}
