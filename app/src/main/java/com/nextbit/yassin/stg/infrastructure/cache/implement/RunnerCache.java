package com.nextbit.yassin.stg.infrastructure.cache.implement;

import com.nextbit.yassin.stg.domain.entity.Runner;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by yassin on 9/13/17.
 */

public class RunnerCache implements EntityCache<Runner> {
    @Override
    public Observable<Runner> get(int Id) {
        System.out.println("runner get");

        return null;
    }

    @Override
    public Observable<List<Runner>> getAll() {
        return null;
    }

    @Override
    public void put(Runner Entity) {

    }

    @Override
    public boolean isCached(int Id) {
        return false;
    }

    @Override
    public boolean isExpired() {
        return false;
    }

    @Override
    public void evictAll() {

    }
}
