package com.playlist.play.service;

import com.playlist.play.dao.MusicaDao;
import com.playlist.play.domain.Musica;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class MusicaServiceImpl implements MusicaService {
    @Autowired
    private MusicaDao musicaDao;
    @Autowired
    private PlaylistService playlistService;

    @Override
    public void salvar(Musica musica, long playlistId) {
       musica.setPlaylist(playlistService.recuperarPorId(playlistId));
       musicaDao.salvar(musica);
    }

    @Override
    @Transactional
    public List<Musica> recuperarPorPlaylist(long playlistId) {
        return musicaDao.recuperarPorPlaylist(playlistId);
    }

    @Override
    @Transactional
    public Musica recuperarPorPlaylistIdEMusicaId(long playlistId, long musicaId) {
        return musicaDao.recuperarPorPlaylistIdEMusicaId(playlistId, musicaId);
    }

    @Override
    public void atualizar(Musica musica, long PlaylistId) {
        musica.setPlaylist(playlistService.recuperarPorId(PlaylistId));
        musicaDao.atualizar(musica);
    }

    @Override
    public void excluir(long playlistId, long musicaId) {
      musicaDao.excluir(recuperarPorPlaylistIdEMusicaId(playlistId, musicaId).getId());
    }
}
