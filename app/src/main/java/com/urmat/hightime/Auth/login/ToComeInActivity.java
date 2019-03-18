package com.urmat.hightime.Auth.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.urmat.hightime.Auth.register.CheckInActivity;
import com.urmat.hightime.Auth.register.TokenRegister;
import com.urmat.hightime.R;
import com.urmat.hightime.api.App;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ToComeInActivity extends AppCompatActivity {
    
    EditText editName, editPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_come_in);
        
        editName = findViewById(R.id.editName);
        editPassword = findViewById(R.id.editPassword);
    }

    public void onToComeIn(View view) {
        String name = editName.getText().toString().trim();
        String password = editPassword.getText().toString().trim();


        if (name.length() == 0 || password.length() == 0) {
            Toast.makeText(ToComeInActivity.this, "Заполните поля!", Toast.LENGTH_SHORT).show();
        }else {
            signUp(name, password);
        }
    }

    private void signUp(String name, String password) {
      App.getApi().toComeIn(name, password).enqueue(new Callback<TokenLogin>() {
          @Override
          public void onResponse(Call<TokenLogin> call, Response<TokenLogin> response) {
              Log.e("TAG", "response: " + response.code());
               if (response.body().result!=null){
                  Log.e("TOKEN ", response.body().getResult().getSuccess().getUser_token());
               }else {
                  Toast.makeText(ToComeInActivity.this, response.body().error, Toast.LENGTH_SHORT).show();
               }


//              if (response.isSuccessful()) {
//                  if (response.body().result!=null){
//                      Log.e("TOKEN ", response.body().getResult().getSuccess().getUser_token());
//                  }else {
//                      Toast.makeText(ToComeInActivity.this, response.body().error, Toast.LENGTH_SHORT).show();
//                  }
//              }
          }

          @Override
          public void onFailure(Call<TokenLogin> call, Throwable t) {
              Log.e("TAG", "onFailure: " + t.getMessage());

          }
      });
    }

    public void onCancel(View view) {
        finish();
    }
}
