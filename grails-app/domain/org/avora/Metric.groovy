package org.avora

class Metric {

    static mapWith = "mongo"

    String name
    String query
    int value

    static constraints = {
    }

    static transients =['value']
}