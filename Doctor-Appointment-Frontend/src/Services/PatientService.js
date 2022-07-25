import axios from "axios";

const PATIENT_API_BASE_URL_VIEW = "http://localhost:5050/secure/patient";
const PATIENT_API_BASE_URL_ADD = "http://localhost:5050/secure/patient/create";
const data = null;
class PatientService{

    viewPatients(){
        return axios.get(PATIENT_API_BASE_URL_VIEW);
    }
    addPatient(){
        return axios.post(PATIENT_API_BASE_URL_ADD,data);
    }

}
export default new PatientService()