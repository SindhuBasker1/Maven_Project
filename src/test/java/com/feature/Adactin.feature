Feature:Checking the hotel booking functionality of an application

Scenario Outline:Login Functionality

Given user Must Launch "http://adactinhotelapp.com/"
When user Enter The "<username>"In The Username Field
And user Enter The "<password>" In The Password Field
Then user Click The Login Button And It Navigates To The Search Hotel Page

Examples:
|username|password|
|sha|123|
|mammu|321|
|mathi|342|
|SINDHUBASKER|Sindhu|

Scenario:Search Hotel Functionality

When user Select Location As In Location Dropdown
And user Select Hotel As In Hotel Dropdown
And user Select Room Type As In Room Type Dropdown
And user Select Number Of Rooms As In Dropdown
And user Enter Checkin Date Later Than The Checkout Date Field As In Textbox
And user Select Number Of Adults As In Dropdown
And user Select Number Of Children As In Dropdown
Then user Click On Search Button And It Navigate To The Select Hotel Page

Scenario:Select Hotel Functionality

When user Select The Hotel For Using Radiobutton
Then user Click On Continue Button And It Navigate To The Book A HotelPage

Scenario:Book Hotel Functionality

When user Enter Your First Name In The  First Name Textbox
And user Enter Your Last Name In The Last Name Textbox
And user Enter Your AddresssIn The Billing Address TextBox
And user Enter Your Credit Card Number In The Credit Card Textbox
And user Select Your Credit Card Type In The Credit Card Type Dropdown
And user Select Credit Card Expiry Month And Expiry Year In Expiry Date Dropdown
And user Enter Your CVV Number As In CVV Number Textbox 
Then user Click On Book Now Button And It Navigate To The Booking Confirmation Page

Scenario:Booking Confirmation Functionality
When Screenshot Will Be Taken
Then User Click On Logout Button And It Navigate To The Logout Page


