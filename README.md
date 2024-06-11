# softoo-assignment
This repository holds the softoo's codding assignment i.e. REST API Implementation With OAuth.

I have created three controllers. Separate controller for each API. and respected Javadocs are already added against all important controllers. 

Making API Calls by postman :- 

If you have an OAuth 2.0 token, you can make authenticated API calls to this Spring Boot application.

**1. Get All User**

   -> Create a New Request  -> Click on + New and select Request.

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



**2. Get All Posts**

   -> Create a New Request  -> Click on + New and select Request.
Set Up the Request:

Method: GET
URL: http://localhost:8080/posts
Authorization:

Go to the Authorization tab.
Set the Type to Bearer Token.
In the Token field, enter the token you obtained earlier.
Send the Request:

Click Send.
You should receive a list of posts in the response.


**3. Get All Comments**

   -> Create a New Request  -> Click on + New and select Request.
   
Set Up the Request:

Method: GET
URL: http://localhost:8080/comments
Authorization:

Go to the Authorization tab.
Set the Type to Bearer Token.
In the Token field, enter the token you obtained earlier.
Send the Request:

Click Send.
You should receive a list of comments in the response.


**4. Get Posts by User (BONUS points for this)**
  -> Create a New Request  -> Click on + New and select Request.
  
Set Up the Request:

Method: GET
URL: http://localhost:8080/posts/user/{userId}
Replace {userId} with the actual user ID.
Authorization:

Go to the Authorization tab.
Set the Type to Bearer Token.
In the Token field, enter the token you obtained earlier.
Send the Request:

Click Send.
You should receive a list of posts by the specified user in the response.

**5. Get Comments by Post (BONUS points for this)**
  -> Create a New Request  -> Click on + New and select Request.
Set Up the Request:

Method: GET
URL: http://localhost:8080/comments/post/{postId}
Replace {postId} with the actual post ID.
Authorization:

Go to the Authorization tab.
Set the Type to Bearer Token.
In the Token field, enter the token you obtained earlier.
Send the Request:

Click Send.
You should receive a list of comments for the specified post in the response.
