package com.example.ericliu.playdagger2.repository;

/**
 * Created by ericliu on 11/04/2016.
 */
public class StubDBRepository extends DBRepository {

    @Override
    public String getData() {
        return "from StubDBRepository";
    }
}
