# sso-demo
A demo application to implement SSO with spring security OAuth2 nd Spring Boot

# how to run this demo
1. Run all three spring boot application in the project
2. Visit http://localhost:8080/
3. You will be redirected to login application
4. Enter user as "user:user"
5. Approve the OAuth2 authorization request
6. You are redirect back to localhost:8080 (You are logged in)
7. You can try URLs like
    1. http://localhost:8080/resource1/user
    2. http://localhost:8080/resource1/greet