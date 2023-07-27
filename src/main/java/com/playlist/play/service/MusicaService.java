package com.playlist.play.service;

import com.playlist.play.domain.Musica;

import java.util.List;

public interface MusicaService {
    void salvar(Musica musica, long playlistId);
    List<Musica> recuperarPorPlaylist(long playlistId);
    Musica recuperarPorPlaylistIdEMusicaId(long playlistId, long musicaId);
    void atualizar (Musica musica, long PlaylistId);
    void excluir(long playlistId, long musicaId);
}
