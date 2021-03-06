package com.androidstarterkit.module;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.androidstarterkit.module.widgets.ScrollViewFragment;

public class ScrollViewActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    getSupportActionBar().setElevation(0);
    setContentView(R.layout.activity_sample_main);

    if (savedInstanceState == null) {
      ScrollViewFragment fragment = new ScrollViewFragment();

      getSupportFragmentManager()
          .beginTransaction()
          .add(R.id.container, fragment)
          .commit();
    }
  }
}
