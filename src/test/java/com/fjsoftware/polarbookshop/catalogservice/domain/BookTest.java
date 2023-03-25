package com.fjsoftware.polarbookshop.catalogservice.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {


    @Test
    void isbn() {
        Book book = new Book("2314", "", "", 2.33);
        System.out.println(book);
    }

    @Test
    void title() {
    }
}