package com.android.vendor.di

import com.android.vendor.domain.repo.VendorsRepository
import com.android.vendor.domain.useCase.GetVendorCategoryUseCase
import com.android.vendor.domain.useCase.GetVendorsUseCase
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
    fun provideGetVendorCategoryUseCase(repository: VendorsRepository): GetVendorCategoryUseCase {
        return GetVendorCategoryUseCase(repository)
    }
    @Provides
    @Singleton
    fun provideGetVendorsUseCase(repository: VendorsRepository): GetVendorsUseCase {
        return GetVendorsUseCase(repository)
    }
}