# tracing-mircoservice-communications

In this project we use sleuth and zipkin server to monitor the communication between our microservices. To do that we added 'spring-cloud-sleuth-zipkin' dependency to our project and install zipkin server on our machine the. After that we added three properties to user-ws micro service:
-spring.zipkin.base-url
-spring.zipkin.sender.type
-spring.sleuth.sampler.probability
Each request has a uninique traceID and each hop of the request has a unique spanID.
