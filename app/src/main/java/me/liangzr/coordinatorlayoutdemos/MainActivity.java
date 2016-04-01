package me.liangzr.coordinatorlayoutdemos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.activity_main);

    /* Find View By Id and Set Listener */
    findViewById(R.id.tv_demo_coordinator).setOnClickListener(this);
    findViewById(R.id.tv_demo_appbar).setOnClickListener(this);
    findViewById(R.id.tv_demo_behavior).setOnClickListener(this);
  }

  @Override public void onClick(View v) {
    switch (v.getId()) {
      case R.id.tv_demo_coordinator:
        startActivity(new Intent(this, ScrollingActivity.class));
        break;
      case R.id.tv_demo_appbar:
        break;
      case R.id.tv_demo_behavior:
        break;
      default:
    }
  }
}
