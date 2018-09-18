// import * as React from "react";
// import axios from "axios";

// export default class GetRecipe extends React.Component<any, any> {
//   constructor(props: any) {
//     super(props);
//     this.state = {
//       recipes: [],
//       search: ""
//     };
//   }

//   public handleChange = (e: any) => {
//     const newState = { ...this.state };
//     newState[e.target.name] = e.target.value;
//     this.setState(newState);
//   };

//   public searchRecipe = async (e: any) => {
//     e.preventDefault();
//     const { search } = this.state;
//     const res = await axios.get(
//       `https://api.edamam.com/search?q=${search}&app_id=c71621aa&app_key=2b7de0e604c8a0bf9f16e4b6419b9835`
//     );
//     console.log(res.data.hits);
//     this.setState({
//       recipes: res.data.hits
//     });
//   };

//   public render() {
//     return (
//       <div>
//         <input
//           onChange={this.handleChange}
//           type="text"
//           name="search"
//           value={this.state.search}
//         />
//         <button onClick={this.searchRecipe}>Search</button>
//         <div>
//           {this.state.recipes.map((recipe: any) => {
//             return (
//               <div key={recipe.recipe.url}>
//                 <div>
//                   <img src={recipe.recipe.image} alt="No Image Available" />

//                   <p>
//                     Name:
//                     {recipe.recipe.label}
//                   </p>

//                   <h1>
//                     Calories:
//                     {Math.round(
//                       (recipe.recipe.calories /= recipe.recipe.yield)
//                     )}
//                   </h1>
//                 </div>
//               </div>
//             );
//           })}
//         </div>
//       </div>
//     );
//   }
// }
import * as React from "react";
import { RouteComponentProps } from "react-router";
import { IRecipeState, IState } from "./reducers";
import * as recipeActions from "./actions/recipeActions/recipeActions";
import { connect } from "react-redux";

interface IProps extends RouteComponentProps<{}>, IRecipeState {
  // updateError: (message: string) => any;
  searchRecipe: (search: string) => any;
}

class GetRecipe extends React.Component<IProps, any> {
  constructor(props: any) {
    super(props);
    this.state = {
      search: ""
    };
  }

  public findRecipe = (e: any) => {
    e.preventDefault();
    this.props.searchRecipe(this.state.search);
  };

  public handleChange = (e: any) => {
    this.setState({ [e.target.name]: e.target.value });
  };

  public render() {
    // const { search } = this.props;

    return (
      <div>
        <input
          onChange={this.handleChange}
          type="text"
          name="search"
          value={this.state.search}
        />

        <button className="btn btn-primary" onClick={this.findRecipe}>
          Search Recipe
        </button>
      </div>
    );
  }
}

const mapStateToProps = (state: IState) => state.recipe;
const mapDispatchToProps = {
  // updateError: registerActions.updateError,
  searchRecipe: recipeActions.searchRecipe
};

export default connect(
  mapStateToProps,
  mapDispatchToProps
)(GetRecipe);
