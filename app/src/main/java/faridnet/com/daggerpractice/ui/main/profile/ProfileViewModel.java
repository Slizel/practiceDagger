package faridnet.com.daggerpractice.ui.main.profile;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

import faridnet.com.daggerpractice.SessionManager;
import faridnet.com.daggerpractice.models.User;
import faridnet.com.daggerpractice.ui.auth.AuthResource;

public class ProfileViewModel extends ViewModel {

    private static final String TAG = "ProfileViewModel";

    private final SessionManager sessionManager;

    @Inject
    public ProfileViewModel(SessionManager sessionManager){
        this.sessionManager = sessionManager;
        Log.d(TAG, "ProfileViewModel: ProfileViewModel: viewmodel is ready....");
    }


    public LiveData<AuthResource<User>> getAuthenticatedUser(){
        return sessionManager.getAuthUser();
    }




}
