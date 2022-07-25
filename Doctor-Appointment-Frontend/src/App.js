import React from 'react';
import './App.css';
import ListAppointment from './component/ListAppointment';
import ListPatient from './component/ListPatient';
import {Route, Switch } from 'react-router-dom';
import PRegistration from './component/forms/PRegistration';
import LoginForm from './component/forms/LoginForm';
import AppointmentForm from './component/forms/AppointmentForm';
import ErrorPage from './component/ErrorPage';
import Menu from './component/Menu';
import UserRegistration from './component/forms/UserRegisteration';


function App(){
  return(
    <>
      <Menu />
      <Switch>
        <Route path="/" exact component={ListAppointment} />
        <Route path="/login" exact component={LoginForm} />
        <Route path="/appointmentform" exact component={AppointmentForm} />
        <Route path="/registerpatient" exact component={PRegistration} />
        <Route path="/viewpatient" exact component={ListPatient} />   
        <Route path="/userregistration" exact component={UserRegistration} />
        <Route component={ErrorPage} />
      </Switch>
    </>
  )
}
export default App;
