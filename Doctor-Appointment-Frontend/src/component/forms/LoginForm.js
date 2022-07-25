import React, { useState } from 'react';
import './Form.css';
// import ReactDOM from 'react-dom'
// import ReactDOM from 'react-dom/client';

const LoginForm = () => {
    
    const [inputs, setInputs] = useState({email:"",password:""});

    let name,value;

    const handleInputChange = (e) => {
        //   event.persist();
        console.log(e);
        name=e.target.name;
        value=e.target.value;
        setInputs({...inputs,[name]:value});
    }
    console.log(inputs);
    const handleSubmit = (e) => {
        
        e.preventDefault();
    }

    return(
        <div>
            <section class="vh-100">
            <div class="container-fluid h-custom">
                <div class="row d-flex justify-content-center align-items-center h-100">
                <div class="col-md-9 col-lg-6 col-xl-5">
                    <img src="https://img.freepik.com/free-vector/medical-video-call-consultation-illustration_88138-415.jpg?w=826&t=st=1658462651~exp=1658463251~hmac=edf4618b2884ba0907b7f291600bb36fee1f185aab9da67c62f43fd00c005a6e"
                    class="img-fluid" alt="doctor-appointment"/>
                </div>
                <div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
                    <form>
                        {/* Email input */}
                        <div class="form-outline mb-4">
                            <input type="email" 
                                id="email" 
                                class="form-control form-control-lg" 
                                name="email"
                                onChange={handleInputChange}
                                value={inputs.email}
                                required 
                                placeholder="Enter a valid email address" 
                            />
                            <label class="form-label" for="email">Email address</label>
                        </div>

                        {/* Password input */}
                        <div class="form-outline mb-3">
                            <input type="password" 
                                id="password"
                                name='password' 
                                class="form-control form-control-lg"
                                onChange={handleInputChange}
                                value={inputs.email}
                                placeholder="Enter password" 
                            />
                            <label class="form-label" for="password">Password</label>
                        </div>

                        {/* <div class="d-flex justify-content-between align-items-center">
                            
                            <a href="#!" class="text-body">Forgot password?</a>
                        </div> */}

                        <div class="text-center text-lg-start mt-4 pt-2 btn1">
                            <button 
                            type="button" 
                            class="btn btn-primary btn-lg"
                            onSubmit={handleSubmit}
                            >
                                Login
                            </button>
                            <p class="small fw-bold mt-2 pt-1 mb-0">Don't have an account? <a href="/userregistration"
                                class="link-danger">Register</a></p>
                        </div>

                    </form>
                </div>
            </div>
        </div>
    <div
    class="d-flex flex-column flex-md-row text-center text-md-start justify-content-between py-4 px-4 px-xl-5 bg-primary">
    {/* Copyright */}
    <div class="text-white mb-3 mb-md-0">
      Copyright © 2020. All rights reserved.
    </div>
    
  </div>
</section>
        </div>
    )    
}
export default LoginForm