package com.example.ericliu.playdagger2.module;

import com.example.ericliu.playdagger2.repository.DBRepository;
import com.example.ericliu.playdagger2.repository.RemoteRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ericliu on 11/04/2016.
 */

@Module
public class RepoModule {

    @Provides
    @Singleton
    DBRepository provideDbRepository(){
        return new DBRepository();
    }

    @Provides
    @Singleton
    RemoteRepository provideRemoteRepository(){
        return new RemoteRepository();
    }

}
