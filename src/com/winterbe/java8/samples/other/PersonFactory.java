package com.winterbe.java8.samples.other;

interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}