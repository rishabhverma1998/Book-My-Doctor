import React, { useState } from 'react';
// import ReactDOM from 'react-dom'

const AppointmentForm = () => {
    
    const [inputs, setInputs] = useState({patientId:"", doctorName:"", syntoms:"", date:""});

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
        <>
            <div className="col-md">
            <h2 className='text-center'>Appointment Booking</h2>
            </div>
            
            <div class="container">

                <form class="form-floating " onSubmit={handleSubmit}>

                    <div className='row'>
                        <div className='col'>
                            <label className='form-label'>Patient Id</label>
                            <input type="number" 
                            name="patientId" 
                            placeholder='Patient ID'
                            onChange={handleInputChange}
                            value={inputs.patientId}
                            className="form-control"
                            required 
                            />
                        </div>

                        <div className='col'>
                            <label className=' col-form-label'>Age</label>
                            <input type="number" 
                            name="age" 
                            placeholder='18'
                            onChange={handleInputChange}
                            value={inputs.age}
                            className="form-control"
                            required 
                            />
                        </div>
                    </div>

                    <div className='row'>
                        <div className='col'>
                            <label className=' col-form-label'>Date</label>
                            <input type="date" 
                            name="date" 
                            placeholder=''
                            onChange={handleInputChange}
                            value={inputs.date}
                            className="form-control"
                            required 
                            />
                        </div>

                        <div className=''>
                            <label className=' col-form-label'>Contact</label>
                            <input type="number" 
                            name="contact" 
                            placeholder='Enter 10 Digits'
                            onChange={handleInputChange}
                            value={inputs.contact}
                            className="form-control"
                            required 
                            />
                        </div>
                    </div>    
                    <div className='row '>
                        <div className='col btn1'>
                            <button className=" btn-primary " type="button" > Book </button>
                        </div>
                    </div>
                </form>
            </div>
        </>
    )    
}
export default AppointmentForm