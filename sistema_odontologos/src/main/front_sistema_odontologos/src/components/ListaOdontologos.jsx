
import React, { Component } from 'react'

class ListaOdontologos extends Component {
    render(props){
        return ( 
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
                    {props.odontologos.map(odontologo =>{
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
    }
    }

export default ListaOdontologos
