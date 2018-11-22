package avoratest

class UrlMappings {

    static mappings = {

        "/getJohnSmithReports"(controller: "report", action: "getJohnSmithReports")
        "/test"(controller: "report", action: "test")
        "/sales"(controller: "report", action: "getAllSales")
        "/findByCity"(controller: "report", action: "findByCity")
        "/report"(controller: "report", action: "getReport")

        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
