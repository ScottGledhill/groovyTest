package org.avora

class Report {

    static mapWith = "mongo"
    String name
    User user

    static hasMany = [metrics: Metric]

    static constraints = {
    }
}