# softoo-assignment
This repository holds the softoo's codding assignment i.e. REST API Implementation With OAuth.

I have created three controllers. Separate controller for each API. and respected Javadocs are already added against all important controllers. 

Making API Calls by postman :- 

If you have an OAuth 2.0 token, you can make authenticated API calls to this Spring Boot application.

**1. Get All User**

    **-> Create a New Request  -> Click on + New and select Request.**

Set Up the Request as below:

Method: GET
URL: http://localhost:8080/users

Authorization:
Go to the Authorization tab.
Set the Type to Bearer Token.
In the Token field, enter the token you obtained earlier.
Send the Request:

Click Send.
You should receive a list of users in the response.

