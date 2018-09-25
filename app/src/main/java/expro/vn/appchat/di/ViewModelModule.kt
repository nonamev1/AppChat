package expro.vn.appchat.di

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import expro.vn.appchat.ui.login.LoginViewModel
import expro.vn.appchat.viewmodel.ChatViewModelFactory


@Suppress("unused")
@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    abstract fun bindUserViewModel(userViewModel: LoginViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ChatViewModelFactory): ViewModelProvider.Factory
}
