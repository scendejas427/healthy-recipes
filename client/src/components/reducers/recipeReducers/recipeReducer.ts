import { recipeTypes } from "../../actions/recipeActions/recipeTypes";
import { IRecipeState } from "..";

const initialState: IRecipeState = {
  search: ""
};

export const recipeReducer = (state = initialState, action: any) => {
  switch (action.type) {
    case recipeTypes.SEARCH_RECIPE:
      return {
        ...state,
        search: action.payload.search
      };
  }
  return state;
};
