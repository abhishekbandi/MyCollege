package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Splashscreen extends AppCompatActivity {
    private int SLEEP_TIMER = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splashscreen);
        getSupportActionBar().hide();
        Logo logo= new Logo();
        logo.start();

    }
    private class Logo extends Thread{
        public void run() {
            try{
                sleep(1000 * SLEEP_TIMER);
            } catch(InterruptedException e){
                e.printStackTrace();
            }


            Intent intent =new Intent(Splashscreen.this,Login.class);
            startActivity(intent);
            Splashscreen.this.finish();
        }
    }
}
