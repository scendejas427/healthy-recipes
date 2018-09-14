import { combineReducers } from "redux";
import { registerReducer } from "./authReducers/registerReducer";
import { signInReducer } from "./authReducers/signInReducer";
// import { chuckNorrisReducer } from "./chuck-norris.reducer";
// import { PokemonSprite } from "../model/PokemonSprite";
// import { pokemonReducer } from "./pokemon-reducer";

// export interface IChuckNorrisState {
//   buyJokeEnabled: boolean,
//   joke: string,
// }

export interface IRegisterState {
  username: string;
  password: string;
  email: string;
  avatar: string;
  errorMessage: string;
}

// export interface IPokemonState {
//   pokeId: number,
//   pokemon: {
//     name: string,
//     sprites: PokemonSprite[]
//   } | null
// }

export interface ISignInState {
  password: string;
  username: string;
  errorMessage: string;
}

export interface IState {
  register: IRegisterState;
  // clicker: IClickerState,
  // pokemon: IPokemonState,
  signIn: ISignInState;
}

export const state = combineReducers<IState>({
  register: registerReducer,
  // clicker: clickerReducer,
  // pokemon: pokemonReducer,
  signIn: signInReducer
});
