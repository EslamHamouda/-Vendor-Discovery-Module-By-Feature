package com.android.vendor.di

import com.android.vendor.data.repo.VendorsRepositoryImpl
import com.android.vendor.data.service.VendorsService
import com.android.vendor.domain.repo.VendorsRepository
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
    fun provideVendorRepository(service: VendorsService): VendorsRepository {
        return VendorsRepositoryImpl(service)
    }
}