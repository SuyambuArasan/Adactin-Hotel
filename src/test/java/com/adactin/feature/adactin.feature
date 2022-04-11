Feature: Hotel Booking application 
@Check
Scenario Outline:: Login page

Given  user Launch The Adactin Url
When  user enter the "<username>" in username field
And   user enter the "<password>" in password field
Then  user click the login Button  and it navigates to search hotel page  

Examples:
|username|password|
|name|word|
|user|pass|
|Dineshkasiraman34215|P07C68|
|use|pas|
|Dineshkasiraman34215|P07C68|