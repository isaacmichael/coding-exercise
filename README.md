# My Solution and Thinking Process


### Oh gosh, I've never used Java Spring before... What the heck is a Bean?
- I've made API's in Ruby On Rails and ASP.NET, but never Java Spring
- Studied for a day on the basics of Java Spring through Codecademy / Watched several videos on how to make a Spring application


- I Tried to implements an Agile system. Start with a wheel, then a skateboard, then a bike. 
  1.  made on a file upload method. (Wheel)
  2.  made a basic route to retrieve all data
  3.  made repository to handle special request for a single parameter with SQL (skateboard)
  4.  made multiple methods in the repository to be used in the controller
  5.  made a method in the controller to know when to call the functions in the repository based on the URL(bike)
  
    
# DOCUMENTATION
## Base URL Is http://localhost:8080/courses
  - There is a test object that is put into the database at startup. String values are "test" and Integer values are 1
  - Here's an example of a URL with two parameters looking for the test object. `http://localhost:8080/courses?ccn=1&ccp=test`
  - no parameters are required and it can accept single parameters


###File Upload URL is the base URL + /upload (I suggest using postman to add in the file)
  - You can add a file in postman by going to "Body" -> "form-data" -> key: "file" -> value: (Selected through your file explorer)
  - Simply post the file, and you will get an `Upload Successful!` message
