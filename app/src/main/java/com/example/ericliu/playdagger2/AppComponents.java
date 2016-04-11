package com.example.ericliu.playdagger2;

import com.example.ericliu.playdagger2.component.DaggerRepoComponent;
import com.example.ericliu.playdagger2.component.RepoComponent;
import com.example.ericliu.playdagger2.module.StubModule;

/**
 * Created by ericliu on 11/04/2016.
 */
public enum AppComponents {
    INSTANCE;

    private RepoComponent component = DaggerRepoComponent.builder().stubModule(new StubModule()).build();

    public RepoComponent getComponent() {
        return component;
    }

}
