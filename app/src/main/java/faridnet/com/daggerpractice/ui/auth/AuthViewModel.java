package faridnet.com.daggerpractice.ui.auth;

import android.util.Log;

import javax.inject.Inject;

import androidx.annotation.LongDef;
import androidx.lifecycle.ViewModel;

import faridnet.com.daggerpractice.models.User;
import faridnet.com.daggerpractice.network.auth.AuthApi;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class AuthViewModel extends ViewModel {

    private static final String TAG = "AuthViewModel";


    private final AuthApi authApi;

    @Inject
    public AuthViewModel(AuthApi authApi ) {
        this.authApi = authApi;
        Log.d(TAG, "AuthViewModel: viewmodel is working...");


       authApi.getUser(1)
       .toObservable()
       .subscribeOn(Schedulers.io())
       .subscribe(new Observer<User>() {
           @Override
           public void onSubscribe(Disposable d) {

           }

           @Override
           public void onNext(User user) {
               Log.d(TAG, "onNext: " + user.getEmail());


           }

           @Override
           public void onError(Throwable e) {
               Log.d(TAG, "onError: ", e);

           }

           @Override
           public void onComplete() {

           }
       });






        //para testar
//        if(this.authApi == null){
//            Log.d(TAG, "AuthViewModel: auth api is NULL");
//        }
//        else{
//            Log.d(TAG, "AuthViewModel: auth api is not NULL");
//        }
    }
}
