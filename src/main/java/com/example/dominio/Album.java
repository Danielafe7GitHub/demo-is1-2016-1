package com.example.dominio;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Album {
  @Id
  @SequenceGenerator(name = "ALBUM_ID_GENERATOR", sequenceName = "ALBUM_ID_SEQ")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ALBUM_ID_GENERATOR")
  private Integer id;

  @OneToMany(mappedBy = "album")
  private List<Cancion> canciones;
}
