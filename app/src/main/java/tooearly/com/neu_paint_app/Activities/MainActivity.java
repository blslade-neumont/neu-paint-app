package tooearly.com.neu_paint_app.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tooearly.com.neu_paint_app.R;
import tooearly.com.neu_paint_app.Views.PaintView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.paintView = (PaintView)findViewById(R.id.paintView);
    }

    private PaintView paintView;
}
