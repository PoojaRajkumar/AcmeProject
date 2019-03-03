Feature: Print Vendor for Acme

Scenario: Positive Flow
Given Open chrome broswer
And Maximize the browser
And Set the timeout
And Enter the url
And Enter the username as poojar351@gmail.com
And Enter the password as poojar@25
And Click on Login Button
And MouseHover Vendor
And Click on Search For Vendor
When Enter vendor TAxID as DE767565
And Click Search Button
Then Print Vendor name