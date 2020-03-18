package faridnet.com.daggerpractice.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import faridnet.com.daggerpractice.di.auth.AuthModule;
import faridnet.com.daggerpractice.di.auth.AuthScope;
import faridnet.com.daggerpractice.di.auth.AuthViewModelsModule;
import faridnet.com.daggerpractice.di.main.MainFragmentBuildersModule;
import faridnet.com.daggerpractice.di.main.MainModule;
import faridnet.com.daggerpractice.di.main.MainScope;
import faridnet.com.daggerpractice.di.main.MainViewModelsModule;
import faridnet.com.daggerpractice.ui.auth.AuthActivity;
import faridnet.com.daggerpractice.ui.main.MainActivity;

@Module
public abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class})
    abstract AuthActivity contributeAuthActivity();

    @MainScope
    @ContributesAndroidInjector(
            modules ={MainFragmentBuildersModule.class, MainViewModelsModule.class, MainModule.class }
    )
    abstract MainActivity contributeMainActivity();

}
