import React, { useState, useEffect, Component } from "react";
import logo from './logo.svg';
import './App.css';
import axios from "axios";
import ListaOdontologos from "./components/ListaOdontologos";

const url = "http://localhost:8080/odontologos"
const url2 = "https://restcountries.eu/rest/v2/all"

class App extends Component {
  

  constructor(props) {
    super(props)
  
    this.state = {
       data:[]
    }
  }
  peticionGet = () => {
    axios.get(url+"/todos").then(response => {
      this.setState({ data: response.data });
      console.log(response.data);
    })
  }

  componentDidMount() {
    this.peticionGet();
  }
  
  render(){
    return (
      <div className="App">
            <table className="table">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Matricula</th>
                    </tr>
                </thead>
                <tbody>
                    {this.state.data.map(odontologo =>{
                        return(
                            <tr>
                                <td>{odontologo.id}</td>
                                <td>{odontologo.nombre}</td>
                                <td>{odontologo.apellido}</td>
                                <td>{odontologo.matricula}</td>
                            </tr>
                        )
                    })}
                </tbody>
            </table>
        )
      </div>
    );
  }
}

export default App;
