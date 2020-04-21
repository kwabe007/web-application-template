import React, { Component } from "react";
import LoginForm from "./LoginForm";
import RegisterForm from "./RegisterForm";
import Auth from "../../services/Auth";

class LoginPage extends Component {
    async login(loginData) {
        const loginSuccess = await Auth.login(loginData);
        if (!loginSuccess) {
            alert("Invalid credentials");
        }
    }

    async register(registrationData) {
        const registerSuccess = await Auth.register(registrationData);
        if (!registerSuccess) {
            alert("Couldn't register.  Please check credentials and try again");
        }
    }

    render() {
        return (
            
            <div className="wrapper">
                <div className="container">
                    <div className="row mt-4">
                        <div className="col-md-6 " style={{color: "white"}}>
                            <img class="authLogo" alt="No2ProLogo" src="logo192.png" />
                            <h1>From Nogrammer to Programmer</h1>
                            <h2>A Forum for Those Learning to Code</h2>
                            <p>
                                Welcome to No-2-Pro, a safe space where you can vent
                                the pains and gains of your personal journey into the
                                world of programming.
                             </p>
                        </div>
                        <div className="col-md-6">
                            <div className="row">
                                <div className="col-12  strong-shadow">
                                    <LoginForm onSubmit={this.login} />
                                </div>

                                <div className="col-12 mt-4">
                                    <RegisterForm onSubmit={this.register}/>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default LoginPage;