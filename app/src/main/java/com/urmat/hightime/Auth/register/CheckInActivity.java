package com.urmat.hightime.Auth.register;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.urmat.hightime.Auth.login.ToComeInActivity;
import com.urmat.hightime.R;
import com.urmat.hightime.api.App;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CheckInActivity extends AppCompatActivity {

    EditText editName, editEmail, editPassword;

    SharedPreferences sPref;

    final String SAVED_TEXT = "saved_text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in);

        editName = findViewById(R.id.editName);
        editEmail = findViewById(R.id.editEmail);
        editPassword = findViewById(R.id.editPassword);
    }

    public void onToSend(View view) {
        String name = editName.getText().toString().trim();
        String email = editEmail.getText().toString().trim();
        String password = editPassword.getText().toString().trim();
        if (name.length() == 0 || email.length() == 0) {
            Toast.makeText(CheckInActivity.this, "Заполните поля!", Toast.LENGTH_SHORT).show();
        }else {
            if (password.length() < 8) {
                Toast.makeText(CheckInActivity.this, "Пароль не должен быть меньше 8 символов!", Toast.LENGTH_SHORT).show();
            }else {
                signUp(name, email, password);
//                startActivity(new Intent(CheckInActivity.this, MainActivity.class));
            }
        }
    }

    public void onCancel(View view) {
    }

    private void signUp(String name, String email, String password) {
        App.getApi().signUp(name, email, password).enqueue(new Callback<TokenRegister>() {
            @Override
            public void onResponse(Call<TokenRegister> call, Response<TokenRegister> response) {
                Log.e("TAG", "response: " + response.code());
                if (response.isSuccessful()){
//                    sPref = getPreferences(MODE_PRIVATE);
//                    SharedPreferences.Editor ed = sPref.edit();
//                    ed.putString(SAVED_TEXT, response.body().getResult().getSuccess().getToken() );
//                    ed.commit();

//                    Toast.makeText(CheckInActivity.this, "Text saved", Toast.LENGTH_SHORT).show();
//                    Log.e("TOKEN: ", response.body().getResult().getSuccess().getToken());
//                    String str = Objects.requireNonNull(response.body()).getResult().getSuccess().getToken();
                    if (response.body().result!=null){
                        Log.e("TOKEN ", response.body().getResult().getSuccess().getToken());
                    }else {
                        Toast.makeText(CheckInActivity.this, response.body().error, Toast.LENGTH_SHORT).show();
                    }
                    Toast.makeText(CheckInActivity.this, "Регистрация прошла успешно!", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<TokenRegister> call, Throwable t) {
                Log.e("TAG", "onFailure: " + t.getMessage());
            }
        });
    }
}
