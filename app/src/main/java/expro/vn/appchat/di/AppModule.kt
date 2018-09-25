package expro.vn.appchat.di

import dagger.Module
import dagger.Provides
import expro.vn.appchat.api.ChatService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module(includes = [ViewModelModule::class])
class AppModule{
    @Singleton
    @Provides
    fun provideGithubService(): ChatService {
        return Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ChatService::class.java)
    }

}