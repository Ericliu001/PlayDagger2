package com.example.ericliu.playdagger2.component;

import com.example.ericliu.playdagger2.module.StubModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ericliu on 11/04/2016.
 */

@Singleton
@Component(modules = StubModule.class )
public interface StubComponent  extends  RepoComponent{
}
