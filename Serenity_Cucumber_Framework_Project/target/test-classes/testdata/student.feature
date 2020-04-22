Feature: Testing different requests on the Student application

@CUCUMBER1
Scenario: Check if the Student appliation can be accessed by users
When User sends a GET request to the endpoint, they must get a valid status code 200

@CUCUMBER2
Scenario Outline: Create a new student & verify if the student is added

When I create a new student by providing the information firstName<firstName> lastName<lastName> email<email> programme<programme> courses<courses>
Then I verify that the student with email<email> is created

Examples:

|	firstName	|	lastName	|	email						|	programme			|	courses	|
|	Aadesh		|	Saanvi		|	Saanvi_Aadesh@gmail.com		|	Computer Science	|	Java	|
|	Aadit		|	Aashirya	|	Aashirya_Aadit@gmail.com	|	Computer Science	|	Java	|
|	Ananya		|	Aadit		|	Aadit_Ananya@gmail.com		|	Computer Science	|	Java	|
