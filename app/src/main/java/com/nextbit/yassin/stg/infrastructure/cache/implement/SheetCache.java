package com.nextbit.yassin.stg.infrastructure.cache.implement;

import com.nextbit.yassin.stg.domain.entity.Sheet;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by yassin on 9/11/17.
 */

public class SheetCache implements EntityCache<Sheet> {
    @Override
    public Observable<Sheet> get(int Id) {
        System.out.println("sheet get");
        return null;
    }

    @Override
    public Observable<List<Sheet>> getAll() {
        return null;
    }

    @Override
    public void put(Sheet Entity) {

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
