import * as React from "react";
import axios from "axios";
import { Card, Grid, Image } from "semantic-ui-react";

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
        <Grid doubling columns={5}>
          {this.state.recipes.map((recipe: any) => {
            return (
              <Grid.Column
                key={recipe.recipe.url}
                mobile={16}
                tablet={8}
                computer={4}
              >
                <Card.Group>
                  <Card raised>
                    <Card.Content>
                      <Image
                        src={recipe.recipe.image}
                        alt="No Image Available"
                      />
                      <Card.Header>
                        <p>
                          Name:
                          {recipe.recipe.label}
                        </p>
                      </Card.Header>
                      <Card.Description>
                        Calories:
                        {Math.round(
                          (recipe.recipe.calories /= recipe.recipe.yield)
                        )}
                      </Card.Description>
                    </Card.Content>
                  </Card>
                </Card.Group>
              </Grid.Column>
            );
          })}
        </Grid>
      </div>
    );
  }
}
