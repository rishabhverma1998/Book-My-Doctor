import ApiService from "./ApiService";

const USER_API_BASE_URL_LOGIN = "http://localhost:5050/user/signUp";
const USER_API_BASE_URL_SIGNUP = "http://localhost:5050/user/login";
const data = null;
class UserService {

    signUpUser(){
        return axios.post(USER_API_BASE_URL_SIGNUP,data);
    }
    login(){
        return axios.get(USER_API_BASE_URL_LOGIN);
    }
}

export default new UserService();

    // get(url) { return ApiService.get(url)}

    // post(data) { return ApiService.post(USER_URL,data)}

    //put(url, data) { return axios.put(API_BASE_URL + url, data); }

    //delete(url) { return axios.delete(API_BASE_URL + url); }