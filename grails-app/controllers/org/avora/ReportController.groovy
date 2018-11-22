package org.avora


import grails.rest.*
import grails.converters.*

class ReportController extends RestfulController {

    static responseFormats = ['json', 'xml']

    def reportService

    ReportController() {
        super(Report)
    }

    def getJohnSmithReports() {
        // respond Report.findAll()
        respond Sales.findAllByEmail("john@avora.com")
    }

    //TODO: find all users by city.
    def findByCity(){
    }

    def getAllSales(){
        def sales = Sales.findAll()
        if(params){
            respond reportService.buildQuery(report.getMetrics().iterator().next(), params.dateTo, params.dateFrom)
        } else {
            respond (sales)
        }
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
