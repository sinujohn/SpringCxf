Do

    mvn jetty:run
    
Following REST APIs are available:

    GET http://localhost:8080/springcxf/api/greet
    GET http://localhost:8080/springcxf/api/greetJson

Swagger API documents in JSON and YAML are available at

    http://localhost:8080/springcxf/api/swagger.json
    http://localhost:8080/springcxf/api/swagger.yaml

To view Swagger UI, use Browser to go to:

    http://localhost:8080/springcxf/apidocs/?url=/springcxf/api/swagger.yaml
or

    http://localhost:8080/springcxf/apidocs/?url=/springcxf/api/swagger.json

Writing Swagger Annotations: https://github.com/swagger-api/swagger-core/wiki/Annotations-1.5.X


More help in using Swagger2Feature in CXF:
http://cxf.apache.org/docs/swagger2feature.html
https://github.com/apache/cxf/tree/master/distribution/src/main/release/samples/jax_rs/description_swagger2_web