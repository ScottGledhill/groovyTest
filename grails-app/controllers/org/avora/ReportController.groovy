package org.avora


import grails.rest.*
import grails.converters.*

class ReportController extends RestfulController {

    static responseFormats = ['json', 'xml']

    def reportService

    ReportController() {
        super(Report)
    }

    def getJohnSmithReport() {
        // respond Report.findAll()
        respond User.findAllByName('john smith')
    }

    //TODO: find all users by city.
    def findByCity(){
    }

    def getAllSales(){
//        respond Sales.findAll()

        reportService.buildQuery(1)
        respond [:]
    }


    def getReport(int id){

        println "got here"+id

        def report = Report.findById(id)

        if(report){
            respond reportService.buildQuery(report.getMetrics().iterator().next())
        } else{
            respond (["error":"no data found"])
        }
    }

    def getAllVisitors(){

    }

    def test(){
        respond (["success":"this is a test method"])
    }
}
