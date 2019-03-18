package com.urmat.hightime.Auth.register;

import com.urmat.hightime.Auth.login.TokenLogin;

public class TokenRegister {

    Result result;

    String error;

    public String getError() {
        return error;
    }

    public Result getResult() {
        return result;
    }

    public class Result{
        Success success;

        public Success getSuccess() {
            return success;
        }
    }

    public class Success{
        String token;
        String name;

        public String getName() {
            return name;
        }

        public String getToken() {
            return token;
        }
    }
}
