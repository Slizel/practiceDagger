package faridnet.com.daggerpractice.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import faridnet.com.daggerpractice.di.auth.AuthModule;
import faridnet.com.daggerpractice.di.auth.AuthViewModelsModule;
import faridnet.com.daggerpractice.ui.auth.AuthActivity;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class})
    abstract AuthActivity contributeAuthActivity();

}
