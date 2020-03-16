package faridnet.com.daggerpractice.di.main;

import androidx.lifecycle.ViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import faridnet.com.daggerpractice.di.ViewModelKey;
import faridnet.com.daggerpractice.ui.main.profile.ProfileViewModel;

@Module
public abstract class MainViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel.class)
    public abstract ViewModel bindProfileViewModel(ProfileViewModel viewModel);

}
