
package com.tamaskozmer.flexiblerecyclerview

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class ApplicationModule {

    @Provides
    fun provideCarDataProvider(): CarDataProvider {
        return CarDataProvider()
    }
}