package expro.vn.appchat.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import expro.vn.appchat.ChatApp
import javax.inject.Singleton
import dagger.android.support.AndroidSupportInjectionModule


@Singleton
@Component(
        modules = [
            AndroidSupportInjectionModule::class,
            AppModule::class,
            MainActivityModule::class
        ]
)
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }

   fun inject(chatApp: ChatApp)

}
