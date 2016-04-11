package com.example.ericliu.playdagger2.module;

import com.example.ericliu.playdagger2.repository.DBRepository;
import com.example.ericliu.playdagger2.repository.RemoteRepository;
import com.example.ericliu.playdagger2.repository.StubDBRepository;
import com.example.ericliu.playdagger2.repository.StubRemoteRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ericliu on 11/04/2016.
 */

@Module
public class StubModule {

    @Provides
    @Singleton
    DBRepository provideDbRepository(){
        return new StubDBRepository();
    }

    @Provides
    @Singleton
    RemoteRepository provideRemoteRepository(){
        return new StubRemoteRepository();
    }
}
