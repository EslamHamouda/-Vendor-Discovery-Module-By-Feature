package com.android.vendor.di

import com.android.vendor.data.service.VendorsService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {
    @Provides
    @Singleton
    fun vendorsService(retrofit: Retrofit): VendorsService =
        retrofit.create(VendorsService::class.java)
}