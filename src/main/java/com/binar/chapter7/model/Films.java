package com.binar.chapter7.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "films")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Films {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "film_code", nullable = false, unique = true)
    private Integer filmCode;

    @Column(name = "film_name", nullable = false, unique = true)
    private String filmName;

    @Column(name = "is_playing")
    private boolean isPlaying;

    @OneToMany(targetEntity=Schedules.class,cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "list_film")
    private List<Schedules> listFilm;

}
