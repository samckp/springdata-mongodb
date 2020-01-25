# springdata-mongodb-Rest API PoC

GET
http://localhost:8080/jira/apps
<BR>
GET : By ID
http://localhost:8080/jira/app/5e2c7394b26e735089f7fc71

POST: 
http://localhost:8080/jira/add
<BR>
Content-type:application/json
<BR>
{
    "name": "aaa",
    "desc":"springboot, Openshift Project !!",
    "owner":"Jeff"
}

PUT: http://localhost:8080/jira/app/5e2c7394b26e735089f7fc71
<BR>
{
    "name": "DDD",
    "desc":"SpringBoot, Openshift Project !!",
    "owner":"tony"
}

DELETE: 
http://localhost:8080/jira/app/5e2c7394b26e735089f7fc71