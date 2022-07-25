import axios from "axios";

const APPOINTMENT_API_BASE_URL_VIEW = "http://localhost:5050/secure/";
const APPOINTMENT_API_BASE_URL_ADD = "http://localhost:5050/secure/create";
const data = null;

class EmployeeService{

    viewAppointments(){
        return axios.get(APPOINTMENT_API_BASE_URL_VIEW);
    }
    addAppointment(){
        return axios.post(APPOINTMENT_API_BASE_URL_ADD,data);
    }
}
export default new EmployeeService()