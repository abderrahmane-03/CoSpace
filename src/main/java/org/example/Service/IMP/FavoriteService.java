package org.example.Service.IMP;
import org.example.Repository.INF.FavoriteRepository;
import org.example.entities.Favorite;

import java.util.List;

public class FavoriteService {
    private FavoriteRepository favoriteRepository;

    public FavoriteService(FavoriteRepository favoriteRepository) {
        this.favoriteRepository = favoriteRepository;
    }

    public Favorite getFavoriteById(String id) {
        return favoriteRepository.findById(id);
    }

    public List<Favorite> getAllFavorites() {
        return favoriteRepository.findAll();
    }

    public void createFavorite(Favorite favorite) {
        favoriteRepository.save(favorite);
    }

    public void updateFavorite(Favorite favorite) {
        favoriteRepository.update(favorite);
    }

    public void deleteFavorite(String id) {
        favoriteRepository.deleteById(id);
    }
}
