package com.example.ericliu.playdagger2.repository;

/**
 * Created by ericliu on 11/04/2016.
 */
public class DBRepository implements Repository {
    @Override
    public String getData() {
        return "from DBRepository";
    }
}
