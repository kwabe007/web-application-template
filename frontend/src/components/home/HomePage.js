import React, { Component } from "react";

class HomePage extends Component {
    render() {
        return (
            <div className="card">
                <div className="card-body">
                    <h4 className="card-title">Welcome to Nogrammer to Programmer!</h4>
                    <p>We are a group of students in Stockholm fighting off the winter cold by learning programming. We built this site
                     with React, Spring, CSS, JavaScript, Java, Hibernate, and some other goodies. Here are some links:</p>
                    <ul>
                        <li><a href="https://spring.io/projects/spring-boot">Spring</a></li>
                        <li><a href="https://www.postgresql.org">PostgreSQL</a></li>
                        <li><a href="https://reactjs.org">React</a></li>
                        <li><a href="https://reacttraining.com/react-router/web/guides/quick-start">React Router</a></li>
                        <li><a href="https://github.com/axios/axios">Axios</a></li>
                    </ul>
                </div>
            </div>
        );
    }
}

export default HomePage;