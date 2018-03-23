package com.example.user.buttom;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity /*implements View.OnTouchListener*/ {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }

    //Toast toast = Toast.makeText(this, "bloquear", Toast.LENGTH_SHORT);

    //@Override
    //public boolean onTouch(View view, MotionEvent event) {
    //    Toast.makeText(this, "reiniciado", Toast.LENGTH_SHORT).show();

        /*lastClick = System.currentTimeMillis();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                notificar();
            }
        }, 5000);
        */

    //    return true;
    //}

    private Long lastClick = null;

    private void notificar(){
        if( System.currentTimeMillis() - lastClick > 10000) {
            Toast.makeText(this, "bloquear", Toast.LENGTH_SHORT).show();
        }
    }
}
