import React, { Component } from 'react';
import AppointmentService from '../Services/AppointmentService';

class ListAppointment extends Component {
    constructor(props) {
        super(props)
        this.state = {
            appointments:[]
        }
    }
    componentDidMount(){
        AppointmentService.viewAppointments().then((res)=>{
            this.setState({appointments:res.data});
        });
    }
    render(){
        return (
            <section class="intro">
                <div class="bg-image h-100 la-div1">
                    <div class="mask d-flex align-items-center h-100">
                    <div class="container">
                        <div class="row justify-content-center">
                        <div class="col-12">
                            <h3 className='la-h3'> View Appointments</h3>
                            <div class="card">
                            <div class="card-body p-0">
                                <div class="table-responsive table-scroll la-div2" data-mdb-perfect-scrollbar="true" >
                                <table class="table table-striped mb-0 la-table1 table-bordered">
                                    <thead class="la-thead1">
                                    <tr>
                                        <th scope="col">Appointment Id</th>
                                        <th scope="col">Patient Id</th>
                                        <th scope="col">Patient Name</th>
                                        <th scope="col">Doctor Name</th>
                                        <th scope="col">Syntoms</th>
                                        <th scope="col">Date</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                        {
                                            this.state.appointments.map(
                                            appointments => 
                                            <tr key ={appointments.appointmentId}>
                                                <td>{appointments.patientId}</td>
                                                <td>{appointments.patientName}</td>
                                                <td>{appointments.doctorName}</td>
                                                <td>{appointments.symptoms}</td>
                                                <td>{appointments.appointmentDate}</td>
                                            </tr>)
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

export default ListAppointment;