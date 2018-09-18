import { recipeTypes } from "./recipeTypes";
import axios from "axios";

// export const recipeSearch = (search: string) => {
//   return {
//     payload: {
//       search
//     },
//     type: recipeTypes.SEARCH_RECIPE
//   };
// };

export const searchRecipe = (search: string) => async (dispatch: any) => {
  const appId = process.env.REACT_APP_EDMAM_APP_ID;
  const apiKey = process.env.REACT_APP_EDAMAM_API_KEY;
  try {
    const res = await axios.get(
      `https://api.edamam.com/search?q=${search}&app_id=${appId}&app_key=${apiKey}`
    );
    dispatch({
      payload: {
        recipe: res.data
      },
      type: recipeTypes.SEARCH_RECIPE
    });
  } catch (error) {
    console.log(error);
  }
};
