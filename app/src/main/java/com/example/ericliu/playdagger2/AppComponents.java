package com.example.ericliu.playdagger2;

import com.example.ericliu.playdagger2.component.DaggerRepoComponent;
import com.example.ericliu.playdagger2.component.DaggerStubComponent;
import com.example.ericliu.playdagger2.component.RepoComponent;
import com.example.ericliu.playdagger2.component.StubComponent;
import com.example.ericliu.playdagger2.module.RepoModule;
import com.example.ericliu.playdagger2.module.StubModule;

/**
 * Created by ericliu on 11/04/2016.
 */
public enum AppComponents {
    INSTANCE;

    private RepoComponent repoComponent = DaggerRepoComponent.builder().repoModule(new RepoModule()).build();

    private StubComponent stubComponent = DaggerStubComponent.builder().stubModule(new StubModule()).build();

    public RepoComponent getComponent() {
        return repoComponent;
    }

}
