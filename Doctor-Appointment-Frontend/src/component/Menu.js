import React from 'react';
// import { NavLink } from 'react-router-dom';

const Menu = () =>{

    return(     
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="container-fluid">
                    <span class="navbar-brand" >Clinic</span>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a href='/login' exact class="nav-link active"aria-current="page">
                                Log In
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href='/' class="nav-link" exact>
                                View Appointments
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href='/appointmentform' class="nav-link" exact>
                                Book Appointments
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href='/registerpatient' class="nav-link" exact >
                                Register Patient
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href='/viewpatient' class="nav-link" exact >
                                View Patient
                            </a>
                        </li>
                    </ul>
                    </div>
                </div>
            </nav>
    )

}
export default Menu;