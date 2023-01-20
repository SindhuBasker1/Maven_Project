$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Checking the hotel booking functionality of an application",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-application;login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user Must Launch \"http://adactinhotelapp.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cusername\u003e\"In The Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"\u003cpassword\u003e\" In The Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-application;login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "checking-the-hotel-booking-functionality-of-an-application;login-functionality;;1"
    },
    {
      "cells": [
        "sha",
        "123"
      ],
      "line": 12,
      "id": "checking-the-hotel-booking-functionality-of-an-application;login-functionality;;2"
    },
    {
      "cells": [
        "mammu",
        "321"
      ],
      "line": 13,
      "id": "checking-the-hotel-booking-functionality-of-an-application;login-functionality;;3"
    },
    {
      "cells": [
        "mathi",
        "342"
      ],
      "line": 14,
      "id": "checking-the-hotel-booking-functionality-of-an-application;login-functionality;;4"
    },
    {
      "cells": [
        "SINDHUBASKER",
        "Sindhu"
      ],
      "line": 15,
      "id": "checking-the-hotel-booking-functionality-of-an-application;login-functionality;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-application;login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user Must Launch \"http://adactinhotelapp.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"sha\"In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"123\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://adactinhotelapp.com/",
      "offset": 18
    }
  ],
  "location": "StepDefinition.user_Must_Launch(String)"
});
formatter.result({
  "duration": 4641371600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sha",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 152766300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 84822000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 549313700,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-application;login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user Must Launch \"http://adactinhotelapp.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"mammu\"In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"321\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://adactinhotelapp.com/",
      "offset": 18
    }
  ],
  "location": "StepDefinition.user_Must_Launch(String)"
});
formatter.result({
  "duration": 480162000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mammu",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 103730800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "321",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 91390400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 507601800,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-application;login-functionality;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user Must Launch \"http://adactinhotelapp.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"mathi\"In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"342\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://adactinhotelapp.com/",
      "offset": 18
    }
  ],
  "location": "StepDefinition.user_Must_Launch(String)"
});
formatter.result({
  "duration": 387668700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mathi",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 89117100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "342",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 112624400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 536197400,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-application;login-functionality;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user Must Launch \"http://adactinhotelapp.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"SINDHUBASKER\"In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"Sindhu\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://adactinhotelapp.com/",
      "offset": 18
    }
  ],
  "location": "StepDefinition.user_Must_Launch(String)"
});
formatter.result({
  "duration": 523536900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SINDHUBASKER",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 89823000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sindhu",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 86059900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 4555696200,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Search Hotel Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-application;search-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "user Select Location As In Location Dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user Select Hotel As In Hotel Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Select Room Type As In Room Type Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Select Number Of Rooms As In Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Enter Checkin Date Later Than The Checkout Date Field As In Textbox",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Select Number Of Adults As In Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Select Number Of Children As In Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Click On Search Button And It Navigate To The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_Location_As_In_Location_Dropdown()"
});
formatter.result({
  "duration": 98761300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_Hotel_As_In_Hotel_Dropdown()"
});
formatter.result({
  "duration": 109447000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_Room_Type_As_In_Room_Type_Dropdown()"
});
formatter.result({
  "duration": 100993100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_Number_Of_Rooms_As_In_Dropdown()"
});
formatter.result({
  "duration": 77500900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_Checkin_Date_Later_Than_The_Checkout_Date_Field_As_In_Textbox()"
});
formatter.result({
  "duration": 187856100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_Number_Of_Adults_As_In_Dropdown()"
});
formatter.result({
  "duration": 91723200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_Number_Of_Children_As_In_Dropdown()"
});
formatter.result({
  "duration": 100038600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_Search_Button_And_It_Navigate_To_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 1025169600,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Select Hotel Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-application;select-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "user Select The Hotel For Using Radiobutton",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user Click On Continue Button And It Navigate To The Book A HotelPage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Hotel_For_Using_Radiobutton()"
});
formatter.result({
  "duration": 79506800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_Continue_Button_And_It_Navigate_To_The_Book_A_HotelPage()"
});
formatter.result({
  "duration": 963712600,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Book Hotel Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-application;book-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 35,
  "name": "user Enter Your First Name In The  First Name Textbox",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user Enter Your Last Name In The Last Name Textbox",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Enter Your AddresssIn The Billing Address TextBox",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Enter Your Credit Card Number In The Credit Card Textbox",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Select Your Credit Card Type In The Credit Card Type Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Select Credit Card Expiry Month And Expiry Year In Expiry Date Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Enter Your CVV Number As In CVV Number Textbox",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Click On Book Now Button And It Navigate To The Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Enter_Your_First_Name_In_The_First_Name_Textbox()"
});
formatter.result({
  "duration": 97969600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_Your_Last_Name_In_The_Last_Name_Textbox()"
});
formatter.result({
  "duration": 78472100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_Your_AddresssIn_The_Billing_Address_TextBox()"
});
formatter.result({
  "duration": 123904900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_Your_Credit_Card_Number_In_The_Credit_Card_Textbox()"
});
formatter.result({
  "duration": 84558600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_Your_Credit_Card_Type_In_The_Credit_Card_Type_Dropdown()"
});
formatter.result({
  "duration": 184708700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_Credit_Card_Expiry_Month_And_Expiry_Year_In_Expiry_Date_Dropdown()"
});
formatter.result({
  "duration": 282160300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_Your_CVV_Number_As_In_CVV_Number_Textbox()"
});
formatter.result({
  "duration": 83616800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_Book_Now_Button_And_It_Navigate_To_The_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 89770500,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "Booking Confirmation Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-application;booking-confirmation-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 45,
  "name": "Screenshot Will Be Taken",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "User Click On Logout Button And It Navigate To The Logout Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.screenshot_Will_Be_Taken()"
});
formatter.result({
  "duration": 282207600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_Logout_Button_And_It_Navigate_To_The_Logout_Page()"
});
formatter.result({
  "duration": 503399600,
  "status": "passed"
});
});