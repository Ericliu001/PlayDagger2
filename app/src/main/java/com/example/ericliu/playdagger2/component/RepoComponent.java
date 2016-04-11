package com.example.ericliu.playdagger2.component;

import com.example.ericliu.playdagger2.MainActivity;
import com.example.ericliu.playdagger2.module.RepoModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ericliu on 11/04/2016.
 */

@Singleton
@Component(modules = RepoModule.class )
public interface RepoComponent {
    void inject(MainActivity mainActivity);
}
