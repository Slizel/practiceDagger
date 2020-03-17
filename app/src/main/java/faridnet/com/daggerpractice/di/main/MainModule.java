package faridnet.com.daggerpractice.di.main;

import dagger.Module;

import dagger.Provides;
import faridnet.com.daggerpractice.network.main.MainApi;
import retrofit2.Retrofit;

@Module
public class MainModule {

    //Essa dependencia só existe no MainComponent, ela não pode ser acessada pelo authComponent

    @Provides
    static MainApi provideMainApi(Retrofit retrofit) {
        return retrofit.create(MainApi.class);
    }
}