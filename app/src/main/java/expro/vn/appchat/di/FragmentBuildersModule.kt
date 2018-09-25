package expro.vn.appchat.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import expro.vn.appchat.ui.login.LoginFragment

@Suppress("unused")
@Module
abstract class FragmentBuildersModule{
    @ContributesAndroidInjector
    abstract fun contributeRepoFragment(): LoginFragment
    
}

