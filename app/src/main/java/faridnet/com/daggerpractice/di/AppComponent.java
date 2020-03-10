package faridnet.com.daggerpractice.di;

import android.app.Application;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import faridnet.com.daggerpractice.BaseApplication;
import faridnet.com.daggerpractice.SessionManager;

@Component (

        modules = {
                AndroidSupportInjectionModule.class
        })

public interface AppComponent extends AndroidInjector<BaseApplication> {

    SessionManager sessionManager();

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
