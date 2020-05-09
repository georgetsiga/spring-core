package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    public SpeakerServiceImpl(HibernateSpeakerRepositoryImpl speakerRepository) {
        System.out.println("SpeakerServiceImpl repository constructor");
        this.repository = speakerRepository;
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl setter");
        this.repository = repository;
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
