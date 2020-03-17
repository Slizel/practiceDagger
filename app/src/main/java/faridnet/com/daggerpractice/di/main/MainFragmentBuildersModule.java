package faridnet.com.daggerpractice.di.main;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import faridnet.com.daggerpractice.di.auth.AuthModule;
import faridnet.com.daggerpractice.di.auth.AuthViewModelsModule;
import faridnet.com.daggerpractice.ui.main.MainActivity;
import faridnet.com.daggerpractice.ui.main.posts.PostsFragment;
import faridnet.com.daggerpractice.ui.main.profile.ProfileFragment;

@Module
public abstract class MainFragmentBuildersModule {

    @ContributesAndroidInjector
    abstract ProfileFragment contributeProfileFragment();

    @ContributesAndroidInjector
    abstract PostsFragment contributePostsFragment();

}

