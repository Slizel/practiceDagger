package faridnet.com.daggerpractice.ui.main.posts;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

import faridnet.com.daggerpractice.SessionManager;
import faridnet.com.daggerpractice.network.main.MainApi;

public class PostsViewModel extends ViewModel {

    private static final String TAG = "PostsViewModel";

    //inject
    private final SessionManager sessionManager;
    private final MainApi mainApi;



    @Inject
    public PostsViewModel(SessionManager sessionManager, MainApi mainApi ) {
        this.sessionManager = sessionManager;
        this.mainApi = mainApi;
        Log.d(TAG, "PostViewModel: viewmodel is working...");

    }
}
