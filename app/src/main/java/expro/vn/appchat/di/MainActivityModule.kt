package expro.vn.appchat.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import expro.vn.appchat.ui.MainActivity

@Suppress("unused")
@Module
abstract class MainActivityModule{
    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun contributeMainActivity(): MainActivity
}

