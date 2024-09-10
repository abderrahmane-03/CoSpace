package org.example.Repository.IMP;

import org.example.Repository.INF.FavoriteRepository;
import org.example.entities.Favorite;

import java.util.List;

public class FavoriteRepositoryIMP implements FavoriteRepository {
    @Override
    public Favorite findById(String s) {
        return null;
    }

    @Override
    public List<Favorite> findAll() {
        return List.of();
    }

    @Override
    public void save(Favorite entity) {

    }

    @Override
    public void update(Favorite entity) {

    }

    @Override
    public void deleteById(String s) {

    }
}
