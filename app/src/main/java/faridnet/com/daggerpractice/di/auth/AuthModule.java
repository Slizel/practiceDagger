package faridnet.com.daggerpractice.di.auth;

import dagger.Module;
import dagger.Provides;
import faridnet.com.daggerpractice.network.auth.AuthApi;
import retrofit2.Retrofit;

@Module
public class AuthModule {

    @Provides
    static AuthApi provideAuthApi(Retrofit retrofit){
        return retrofit.create(AuthApi.class);
    }





}
