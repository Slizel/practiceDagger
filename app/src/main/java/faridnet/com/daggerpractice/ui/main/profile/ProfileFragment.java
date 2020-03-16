package faridnet.com.daggerpractice.ui.main.profile;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;
import faridnet.com.daggerpractice.R;
import faridnet.com.daggerpractice.viewmodels.ViewModelProviderFactory;

public class ProfileFragment extends DaggerFragment {

    private static final String TAG = "ProfileFragment";

    private ProfileViewModel viewModel;

    @Inject
    ViewModelProviderFactory providerFactory;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false );
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, "onViewCreated: ProfileFragment was created...");

        viewModel = ViewModelProviders.of(this, providerFactory ).get(ProfileViewModel.class);


    }
}
