package com.debanjan.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService{
    private final ChuckNorrisQuotes Qs;

    public JokeServiceImpl(ChuckNorrisQuotes qs) {
        Qs = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return Qs.getRandomQuote();
    }
}
