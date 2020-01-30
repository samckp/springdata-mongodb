# springdata-mongodb-Rest API PoC

GET
http://localhost:8080/jira/apps
<BR><HR>
GET : By ID
http://localhost:8080/jira/app/5e2c7394b26e735089f7fc71

POST: 
http://localhost:8080/jira/add
<BR><HR>
Content-type:application/json
<BR><HR>
{
    "name": "aaa",
    "desc":"springboot, Openshift Project !!",
    "owner":"Jeff"
}

PUT: http://localhost:8080/jira/app/5e2c7394b26e735089f7fc71
<BR><HR>
{
    "name": "DDD",
    "desc":"SpringBoot, Openshift Project !!",
    "owner":"tony"
}
<HR>
DELETE: 
http://localhost:8080/jira/app/5e2c7394b26e735089f7fc71
<HR>
<BR>
<BR><HR>
Swagger UI
<BR><HR>
http://localhost:8080/swagger-ui.html#/
<BR>
<HR>
Java Monitoring url
<BR>
http://localhost:8080/monitoring?
<HR>
<BR>
1. Docker based mongodb introduced.
<BR>2. Java Melody monitoring introduced.
 
