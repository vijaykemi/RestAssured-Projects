Feature: Adding Students using Object Mapper

@CUCUMBER3
Scenario Outline: Create a new student & verify if the student is added

When I create a new student by providing the information firstName<firstName> lastName<lastName> email<email> course1<course1> course2<course2> using ObjectmapperStudentwithJSON
Then I verify that the student with email<email> is created

Examples:

|	firstName	|	lastName	|	email						|	programme			|	course1	|	course2	|
|	Aadesh		|	JSONfile2	|	Jamshed_Aadesh@gmail.com	|	Computer Science	|	Java	|	C++		|
|	Aadit		|	Aashirya	|	Aashirya_Aadit@gmail.com	|	Computer Science	|	Java	|	C++		|
|	Ananya		|	Aadit		|	Aadit_Ananya@gmail.com		|	Computer Science	|	Java	|	C++		|
