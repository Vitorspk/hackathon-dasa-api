package com.hackathon.dasa.api.model;

import javax.persistence.*;

@Entity
@Table(name = "imagem")
public class Imagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Exame exame;
    private String url;




    public Long getId() {
        return id;
    }


    public String getUrl() {
        return url;
    }
}
