package org.avora

class User {


    static mapWith = "mongo"

    String email
    String name
    String location

    static constraints = {
        email nullable: false, blank: false, unique: true
    }
}
