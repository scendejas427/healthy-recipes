import * as React from "react";
import { RouteComponentProps } from "react-router";
import { ISignInState, IState } from "./reducers";
import * as signInActions from "./actions/authActions/signInActions";
import { connect } from "react-redux";

interface IProps extends RouteComponentProps<{}>, ISignInState {
  updateError: (message: string) => any;
  updatePassword: (password: string) => any;
  updateUsername: (username: string) => any;
  submit: (credentials: any) => any;
}

class SignInComponent extends React.Component<IProps, {}> {
  constructor(props: any) {
    super(props);
  }

  public submit = (e: React.FormEvent<HTMLFormElement>) => {
    e.preventDefault();
    fetch("http://localhost:8080/users/login", {
      body: JSON.stringify(this.props),
      headers: {
        "Content-Type": "application/json"
      },
      method: "POST"
    })
      .then(resp => {
        console.log(resp.status);
        if (resp.status === 401) {
          this.props.updateError("Invalid Credentials");
        } else if (resp.status === 200) {
          return resp.json();
        } else {
          this.props.updateError("Failed to Login at this time");
        }
        throw new Error("Failed to login");
      })
      .then(resp => {
        this.props.history.push("/home");
      })
      .catch(err => {
        console.log(err);
      });
  };
  public passwordChange = (e: any) => {
    this.props.updatePassword(e.target.value);
  };

  public usernameChange = (e: any) => {
    this.props.updateUsername(e.target.value);
  };

  public render() {
    const { errorMessage, username, password } = this.props;

    return (
      <form className="form-signin" onSubmit={this.submit}>
        <h1 className="h3 mb-3 font-weight-normal">Please sign in</h1>

        <label htmlFor="inputUsername">Username</label>
        <input
          onChange={this.usernameChange}
          value={username}
          type="text"
          id="inputUsername"
          className="form-control"
          placeholder="Username"
          required
        />

        <label htmlFor="inputPassword">Password</label>
        <input
          onChange={this.passwordChange}
          value={password}
          type="password"
          id="inputPassword"
          className="form-control"
          placeholder="Password"
          required
        />

        <button type="submit">Sign in</button>
        {errorMessage && <p id="error-message">{errorMessage}</p>}
      </form>
    );
  }
}

const mapStateToProps = (state: IState) => state.signIn;
const mapDispatchToProps = {
  updateError: signInActions.updateError,
  updatePassword: signInActions.updatePassword,
  updateUsername: signInActions.updateUsername
};

export default connect(
  mapStateToProps,
  mapDispatchToProps
)(SignInComponent);
