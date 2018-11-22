package org.avora

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ReportSpec extends Specification implements DomainUnitTest<Report> {

    void "Test can take in date ranges"() {
        when:"The message action is invoked"
        ReportController.getAllSales()

        then:"report with sales data is returned"
        response.text == 'Hello'
    }
}
