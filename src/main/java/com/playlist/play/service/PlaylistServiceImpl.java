package com.playlist.play.service;

import com.playlist.play.dao.PlaylistDao;
import com.playlist.play.domain.Playlist;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PlaylistServiceImpl implements PlaylistService {
    @Autowired
    private PlaylistDao playlistDao;
    @Override
    public void salvar(Playlist playlist) {
      playlistDao.salvar(playlist);
    }

    @Override
    @Transactional
    public List<Playlist> recuperar() {
        return playlistDao.recuperar();
    }

    @Override
    @Transactional
    public Playlist recuperarPorId(long id) {
        return playlistDao.recuperarPorId(id);
    }

    @Override
    public void atualizar(Playlist playlist) {

    }

    @Override
    public void excluir(long id) {

    }
}
