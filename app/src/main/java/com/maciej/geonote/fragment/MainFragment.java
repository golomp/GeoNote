package com.maciej.geonote.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.maciej.geonote.databinding.FragmentMainBinding;
import com.maciej.geonote.viewmodel.fragmentviewmodel.MainFragmentViewModel;

import rx.Subscription;

/**
 * Created by Maciej on 20.05.2016.
 */
public class MainFragment extends BaseFragment {

    private MainFragmentViewModel viewModel;
    private Subscription fabSubscription;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new MainFragmentViewModel();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentMainBinding binding = FragmentMainBinding.inflate(getLayoutInflater(savedInstanceState), container, false);
        binding.setViewModel(viewModel);
        return binding.getRoot();
    }

    private void setButtons() {
        fabSubscription = viewModel.fab.rxTap().subscribe(o -> Toast.makeText(getContext(), "NO SIEMA", Toast.LENGTH_SHORT).show());
    }

    @Override
    public void onStart() {
        super.onStart();
        setButtons();
    }

    @Override
    public void onStop() {
        super.onStop();
        resetButtons();
    }

    private void resetButtons() {
        if (fabSubscription != null && !fabSubscription.isUnsubscribed()) {
            fabSubscription.unsubscribe();
        }
    }
}
