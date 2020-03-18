package faridnet.com.daggerpractice.di.main;

import dagger.Module;

import dagger.Provides;
import faridnet.com.daggerpractice.network.main.MainApi;
import faridnet.com.daggerpractice.ui.main.posts.PostsRecyclerAdapter;
import retrofit2.Retrofit;

@Module
public class MainModule {

    @MainScope
    @Provides
    static PostsRecyclerAdapter provideAdapter(){
        return new PostsRecyclerAdapter();
    }

    //Essa dependencia só existe no MainComponent, ela não pode ser acessada pelo authComponent

    @MainScope
    @Provides
    static MainApi provideMainApi(Retrofit retrofit) {
        return retrofit.create(MainApi.class);
    }
}