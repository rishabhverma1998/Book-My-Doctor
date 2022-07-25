import React, { Component } from 'react';

class ListPatient extends Component {
    constructor(props) {
        super(props)
        this.state = {
            patients:[]
        }
    }
    render(){
        return (
            <section class="intro">
                <div class="bg-image h-100 lp-div1">
                    <div class="mask d-flex align-items-center h-100">
                    <div class="container">
                        <div class="row justify-content-center">
                        <div class="col-12">
                            <h3 class="lp-h3">Registered Patient</h3>
                            <div class="card">
                            <div class="card-body p-0">
                                <div class="table-responsive table-scroll lp-div2" data-mdb-perfect-scrollbar="true" >
                                <table class="table table-striped table-bordered mb-0 la-table1">
                                    <thead class="lp-thead1">
                                    <tr>
                                        <th scope="col">Patient Id</th>
                                        <th scope="col">Patient Name</th>
                                        <th scope="col">Patient Age</th>
                                        <th scope="col">Patient Gender</th>
                                        <th scope="col">Contact Number</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        {
                                            this.state.patients.map(
                                                patients => 
                                                <tr key ={patients.patientId}>
                                                    <td>{patients.patientName}</td>
                                                    <td>{patients.patientAge}</td>
                                                    <td>{patients.patientGender}</td>
                                                    <td>{patients.patientContactNo}</td>
                                                </tr>
                                            )
                                        }
                                    </tbody>
                                    </table>
                                </div>
                            </div>
                            </div>
                        </div>
                        </div>
                    </div>
                    </div>
                </div>
            </section>      
        );
    }
}

export default ListPatient;