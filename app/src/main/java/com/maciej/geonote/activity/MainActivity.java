package com.maciej.geonote.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.maciej.geonote.R;
import com.maciej.geonote.fragment.MainFragment;
import com.maciej.geonote.viewmodel.activityviewmodel.MainActivityViewModel;
import com.maciej.geonote.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new MainActivityViewModel();
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(viewModel);
        Fragment fragment = new MainFragment();
        displayFragment(fragment, binding.getRoot().getId(), "tag");
    }
}
