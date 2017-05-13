package humg.buiket.facebook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
Button btnLogin;
EditText txtName;
EditText txtPassWord;
TextView txtError;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin =(Button) findViewById(R.id.login_btnLogin);
        txtName = (EditText) findViewById(R.id.login_txtName);
        txtPassWord= (EditText) findViewById(R.id.login_txtPassWord);
        txtError= (TextView) findViewById(R.id.login_txtError);
        //event handle
        btnLogin.setOnClickListener(onClickListener);

    }

    View.OnClickListener onClickListener = new OnClickListener(){
        @Override
        public  void onClick(View view){
            if("ket".equals(txtName.getText().toString())&&"ketkute".equals(txtPassWord.getText().toString())){
                Intent intent= new Intent(LoginActivity.this, MainActivity.class);
                LoginActivity.this.startActivity(intent);

            }else{
                txtError.setVisibility(View.VISIBLE);
            }
        }
    };
}
