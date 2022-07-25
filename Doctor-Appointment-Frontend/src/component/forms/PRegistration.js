import React, { useState } from 'react';
import './Form.css';
// import ReactDOM from 'react-dom/client';
// import React from 'react';

const PRegistration = () => {
    
    const [inputs, setInputs] = useState({name:"", age:"", gender:"", contact:""});

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
          <section class="h-100 bg-dark">
                <div class="container py-5 h-100">
                 <div class="row d-flex justify-content-center align-items-center h-100">
                       <div class="col">
                   <div class="card card-registration my-4">
                        <div class="row g-0">
                <div class="col-xl-6 d-none d-xl-block">
              <img src="https://img.freepik.com/free-vector/female-client-visitor-talking-with-receptionist-desk-speech-bubble-laptop-flat-vector-illustration-service-communication_74855-13068.jpg?t=st=1658480404~exp=1658481004~hmac=27dcb60537cd27afa9e289a4576e3cea22c708fe8e109e68cbb60564260b17c0&w=996"
                alt="Reception" class="img-fluid primage1"/>
                </div>
                <div class="col-xl-6">
                <div class="card-body p-md-5 text-black">
                <h3 class="mb-5 text-uppercase">Patient Registeration Form</h3>

<form onSubmit={handleSubmit}>
    {/* Input section of name */}
                <div class="row">
                  <div class="col-md-6 mb-4">
                    <div class="form-outline">
                      <input type="text" id="name" name='name' class="form-control form-control-lg"
                      onChange={handleInputChange}
                      value={inputs.role} 
                      />
                      <label class="form-label" for="name">Full Name</label>
                    </div>
                  </div>
 {/* Input section of Age */}
                  <div class="col-md-6 mb-4">
                    <div class="form-outline">
                      <input type="number" id="age" name="age" class="form-control form-control-lg"
                      onChange={handleInputChange}
                      value={inputs.age} />
                      <label class="form-label" for="form3Example1n">Age</label>
                    </div>
                  </div>
                </div>    
{/* Input box section for Phone number */}
                <div class="form-outline">
                    <input type="tel" id="contact" name="contact" class="form-control form-control-lg" 
                    onChange={handleInputChange}
                    value={inputs.contact}/>
                    <label class="form-label" for="contact">Phone Number</label>
                  </div>

{/* readio button section for gender */}
                <div class="d-md-flex justify-content-start align-items-center mb-4 py-2">
                  <h6 class="mb-0 me-4">Gender: </h6>

                  <div class="form-check form-check-inline mb-0 me-4">
                    <input class="form-check-input" type="radio" name="inlineRadioOptions" id="femaleGender"
                      value="option1" 
                    //   onChange={handleInputChange}
                    //         value={inputs.gender}  
                    />
                    <label class="form-check-label" for="femaleGender">Female</label>
                  </div>

                  <div class="form-check form-check-inline mb-0 me-4">
                    <input class="form-check-input" type="radio" name="inlineRadioOptions" id="maleGender"
                      value="option2" />
                    <label class="form-check-label" for="maleGender">Male</label>
                  </div>

                  <div class="form-check form-check-inline mb-0">
                    <input class="form-check-input" type="radio" name="inlineRadioOptions" id="otherGender"
                      value="option3" />
                    <label class="form-check-label" for="otherGender">Other</label>
                  </div>

                </div>
{/* form buttons */}
                <div class="d-flex justify-content-end pt-3">
                  <button type="button" class="btn btn-light btn-lg">Reset all</button>
                  <button type="button" class="btn btn-warning btn-lg ms-2">Submit form</button>
                </div>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
      </section>
     
    )    
}
export default PRegistration

