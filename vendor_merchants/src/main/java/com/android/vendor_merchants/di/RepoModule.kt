package com.android.vendor_merchants.di

import com.android.vendor_merchants.data.repo.DetailsRepositoryImpl
import com.android.vendor_merchants.data.service.DetailsService
import com.android.vendor_merchants.domain.repo.DetailsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {
    @Provides
    @Singleton
    fun provideDetailsRepository(service: DetailsService): DetailsRepository {
        return DetailsRepositoryImpl(service)
    }
}