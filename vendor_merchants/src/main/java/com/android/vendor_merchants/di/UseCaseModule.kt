package com.android.vendor_merchants.di

import com.android.vendor_merchants.domain.repo.DetailsRepository
import com.android.vendor_merchants.domain.useCase.GetMerchantsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    @Singleton
    fun provideGetMerchantsUseCase(repository: DetailsRepository): GetMerchantsUseCase {
        return GetMerchantsUseCase(repository)
    }
}