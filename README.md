#Transaction management application

##Description
This app is a microservice based on REST API that enables its users to:
- create an account
- retrieve their transactions by time frame (last X hours or last Y days)
- delete their account

Supported requests:

POST: /account/create
DELETE: /account/delete/{id}
POST: /transaction/add
GET: /transaction/all
GET: /transaction/account/{accountNumber}
GET: /transaction/all/last/hours/{hours}
GET: /transaction/all/last/days/{days}

##Usage
- Run the app: java -jar target/transaction-management-application-0.0.1-SNAPSHOT.war
- Use Postman to launch the supported requests (see the Features section)
