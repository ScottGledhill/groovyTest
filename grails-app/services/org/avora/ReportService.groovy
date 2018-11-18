package org.avora

import grails.gorm.transactions.Transactional

@Transactional
class ReportService {

    def buildQuery(Metric metric){

        if(metric.getQuery().equals("sales")){

            def criteria = Sales.createCriteria()
            def result = criteria.list {
                projections {
                    sum('amount')
                }
            }
            return result

        } else if(metric.query.equals("visitors")){
            def criteria = Visits.createCriteria()
            def result = criteria.list {
                projections {
                    sum('amount')
                }
            }
            return result
        }
    }
}
