package com.playlist.play.domain;

import com.playlist.play.service.PlaylistService;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.Range;


@Entity
@Table(name = "musicas")
@Getter
@Setter
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank
    @Size(min = 2, max = 50)
    @Column(nullable = false, length = 50)
    private String titulo;

    @NotBlank
    @Size(min = 2, max = 50)
    @Column(nullable = false, length = 50)
    private String banda;

    @Range(from = 0, to = 10)
    @Column(nullable = false)
    private int nota;

    @ManyToOne
    @JoinColumn(name = "id_playlist_fk")
    private Playlist playlist;


}
