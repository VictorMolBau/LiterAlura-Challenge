package com.LiterAlura.Challenge.service;

public interface ConvierteDatosA {
    <T> T obtenerDatos(String json, Class<T> clase);
}
