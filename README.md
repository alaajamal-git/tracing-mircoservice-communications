# tracing-mircoservice-communications

In this project we use sleuth and zipkin server to monitor the communication between our microservices. To do that we added 'spring-cloud-sleuth-zipkin' dependency to our project and install zipkin server on our machine the. After that we added three properties to user-ws micro service:
-spring.zipkin.base-url.
-spring.zipkin.sender.type.
-spring.sleuth.sampler.probability.
Each request has a uninique traceID and each hop of the request has a unique spanID.

Run Steps:
 1. make a purposed exception by change the fiegn client url to wrong one: @GetMapping(value = "/users/{id}/postss") or run all services except posts-ws keep it offline.
 2. post : http://localhost:8011/users-ws/users
   body : 
{
"firstname":"Alaa",
"lastname":"Jamal",
"email":"alaajalmal470@gmail.com",
"password":"154454588"
}
   
3. post : http://localhost:8011/users-ws/users/login
   body :
    {
    "email":"alaajamal470@gmail.com",
    "password":"154454588"
    }
    Assume that the result is:
    userid: d81d0085-34a3-4ca2-a440-466a0b03fbf3
    JWT: eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZWVhZWM2Zi00MDkyLTQ2ZDEtYmEyMy1iODRjZTEwMDZkOTciLCJleHAiOjE1OTUyNjk5ODN9.cIZOTV8gfZtQTa0_odhkrN2TFPvbYCTD8WbwyIPQKmg
4. get : http://localhost:8011/users-ws/users/d81d0085-34a3-4ca2-a440-466a0b03fbf3
   Header :
   Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZWVhZWM2Zi00MDkyLTQ2ZDEtYmEyMy1iODRjZTEwMDZkOTciLCJleHAiOjE1OTUyNjk5ODN9.cIZOTV8gfZtQTa0_odhkrN2TFPvbYCTD8WbwyIPQKmg
 
  
