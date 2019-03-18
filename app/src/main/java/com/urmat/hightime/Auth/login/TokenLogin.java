package com.urmat.hightime.Auth.login;

import com.google.gson.annotations.SerializedName;
import com.urmat.hightime.Auth.register.TokenRegister;

public class TokenLogin {

    @SerializedName("result")
    Result result;

    String error;

    public void setResult(Result result) {
        this.result = result;
    }

    public Result getResult() {
        return result;
    }

    public class Result {
        @SerializedName("success")
        Success success;

        public void setSuccess(Success success) {
            this.success = success;
        }

        public Success getSuccess() {
            return success;
        }
    }

    public class Success {
        @SerializedName("user_token")
        String user_token;

        public void setUser_token(String user_token) {
            this.user_token = user_token;
        }

        public String getUser_token() {
            return user_token;
        }
    }

//    Result result;
//
//    String error;
//
//    public String getError() {
//        return error;
//    }
//
//    public Result getResult() {
//        return result;
//    }
//
//    public class Result{
//        Success success;
//
//        public Success getSuccess() {
//            return success;
//        }
//    }
//
//    public class Success{
//        String user_token;
//
//        public String getUser_token() {
//            return user_token;
//        }
//    }

}
