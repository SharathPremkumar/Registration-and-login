# Regestration-and-login

# Project-Documentation

<p align="center">
  <a href="" rel="noopener">
 <img width=800px height=800px src="https://user-images.githubusercontent.com/124582366/235171894-30dc6dd2-53b4-4729-a505-0174345b62a6.png" alt="Project logo"></a>
</p>

<h3 align="center">Regestration-and-login</h3>

<div align="center">
  
 [![Status](https://img.shields.io/badge/status-active-success.svg)]() 

  [![GitHub Pull Requests](https://img.shields.io/github/issues-pr/kylelobo/The-Documentation-Compendium.svg)]()

</div>

---

<p align="center">This is a JAVA Fullstack Project by using HTML, Spring boot, MySQL DataBase, Hibernate JPA, Spring security & Thymeleaf template engine because I don't know Javascript and CSS to develop frontend part. Where it is developed for the Internship students Registration and login application. Here a student can Register in the website and after registration he/she can login with their credentials to redirect to their individual web pages.
    <br> 
</p>

## 📝 Table of Contents
- [About](#about)
- [Getting Started](#getting_started)
- [Deployment](#deployment)
- [Usage](#usage)
- [Built Using](#built_using)
- [Authors](#authors)
- [Acknowledgments](#acknowledgement)

## 🧐 About <a name = "about"></a>
The purpose of this project is to save the Internship Students details in the web application, this project provides the features where student can Register in the website and after registration he/she can login with their credentials to redirect to their individual web pages.
In order to achieve this functionality we have developed the code in such a way that, user can perform each individual operation using different API's.

This serve a full stack web application project, with the help of HTML and Thymeleaf we have designed web pages with good asthetics, but I have not used CSS because I have no idea about it to create a best user interface. Eventhough it is not bad User will enjoy withe existing user interface.

## 🏁 Getting Started <a name = "getting_started"></a>
- first create a database with the name used in the datasource url in the application properties.
- When you run the code on the eclipse IDE, spring boot application will be get started with the server port number.
- With the help of Hibernate JPA database will also be get connected.
- Use that port number with http url and test web application.
- See [deployment](#deployment) for notes on how to deploy the project on a web page.

### Prerequisites
- First You need to download all the softwares provided links in the [Built Using](#built_using) section.
- Installation is very simple, steps are available in the youtube as well as in google also.
- But remember the port number of the MySQL server, because you need to provide that to database connectivity.
- Also remeber the port numbers of Tomcat server for http connection.

### Installing

- Fist Click ond jdk URL and Install it and Then install eclipse Enterprise application
- After Completing the download start the SetUP 
- After SetUp has been Started you need to select on Custom and click on Next
- You can see the Available Products
- In the Click on MySQL Server and go inside of it and Drag it to the Product to be installed Box
- Do the Same for MySQL Application and MySQL Shell and Click on Next 
- After that You can see the Installation Set Up and click on Execute and Product will install one by one 
- After completing the SetUp click on next and on Product Configuration Click on Next 
- Now Type and networking will be visible and there you Check for port no 3306 and keep the default and Click on next 
- Next set Root password keep Clicking on Next and Execute Your MySQL installation will be completed .
- Install the Tomcat Server and check the installation using the http url in google once.


## 🔧 Running the tests <a name = "tests"></a>
- Step 1:

Since the code is readily available, download the zip file and unzip it. next open the project file from eclipse IDE.
Now, you can run this Spring Boot Project (using eclipse IDE), and access the web application at this URL http://localhost:8080, you should see the homepage appears as shown below:
<p align="center">
  <a href="" rel="noopener">
 <img width=600px height=600px src="https://user-images.githubusercontent.com/124582366/235171894-30dc6dd2-53b4-4729-a505-0174345b62a6.png" alt="Project logo"></a>
</p>

You see, the home page shows 3 links List all interns, Register and Login.

- Step 2:

Click Register link in the homepage, you should see the registration page appears like this:

<p align="center">
  <a href="" rel="noopener">
 <img width=600px height=600px src="https://user-images.githubusercontent.com/124582366/235206708-d1599108-c51d-4607-b360-bbe199746aad.png" alt="Project logo"></a>
</p>

It looks very nice, because of Bootstrap and HTML 5. You can also notice with HTML 5, the browser provides validation for input fields so you don’t have to use JavaScript for that.

- Step 3:

- As you can see, here we use BCryptPasswordEncoder to encode the user’s password so the password itself it not stored in
database (for better security) – only the hash value of the password is stored.
- After a User object is persisted into the database, it returns a logical view name register_success, so we need to create the corresponding HTML page.
- This page simply displays the successful message after a user has registered, as shown below:

<p align="center">
  <a href="" rel="noopener">
 <img width=600px height=600px src="https://user-images.githubusercontent.com/124582366/235206007-6b24e088-df76-4dda-a3aa-904676683d57.png" alt="Project logo"></a>
</p>

## 🎈 Usage <a name="usage"></a>
The main Use of this isto save the Internship Students details in the web application, this project provides the features where student can Register in the website and after registration he/she can login with their credentials to redirect to their individual web pages.

- Note: You can follow the three steps used in the "Running the tests" section

next you can login from after the successful registration in the redirect page. If we click the login link it will map to the individual user page as shown below.

<p align="center">
  <a href="" rel="noopener">
 <img width=600px height=600px src="https://user-images.githubusercontent.com/124582366/235209312-5400a05f-4f6b-4363-8d90-ab07e2ce9a26.png" alt="Project logo"></a>
</p>

Now you can test the login function. Go to the homepage and click Login link, you should see the default login page appears as follows:

Enter the username (email) and password of the user you have registered previously and click Sign in. You should see an error page because the list users page has not been implemented.


<p align="center">
  <a href="" rel="noopener">
 <img width=600px height=600px src="https://user-images.githubusercontent.com/124582366/235208879-47c92a48-e8fe-45e8-8483-e9563bfe363f.png" alt="Project logo"></a>
</p>

- Now Click the Sign Out button, the application will log the user out and show the homepage.

- Once after clicking on Sign-out button you will redirect to the page as shown below:

<p align="center">
  <a href="" rel="noopener">
 <img width=600px height=600px src="https://user-images.githubusercontent.com/124582366/235209147-4e430030-a5a0-4884-bcf6-c0252a83e4ce.png" alt="Project logo"></a>
</p>

After going back to home page you can check for one more link available. that is "list all interns". once after clicking on that link it will redirect in to new page as shown below.

<p align="center">
  <a href="" rel="noopener">
 <img width=600px height=600px src="
https://user-images.githubusercontent.com/124582366/235209405-dce39b0f-65a4-46a6-a9eb-3a1021411d10.png" alt="Project logo"></a>
</p>

You can also use back to home button to go back to home page.

These are the simple steps to follow to use this web application.

## 🚀 Deployment <a name = "deployment"></a>
First Extract the file from GitHub and import it into eclipse IDE and you can run the program, So that it will automatically generate the database table and then you can run the code in eclipse IDE or Spring tool suite, after that test the application in the google chrome using the tomcat server http url using the port number through which the spring app is started.

## ⛏️ Built Using <a name = "built_using"></a>
- [MySQL Community](https://dev.mysql.com/downloads/installer/) - Commandline client
- [SQLyog](https://webyog.com/product/sqlyog/) - SQL IDE
- [JDK 17](https://www.oracle.com/in/java/technologies/downloads/#java17) - Java Development Kit
- [Eclipse](https://eclipseide.org/) - Eclipse IDE
- [Apache Tomcat](https://tomcat.apache.org/) - Tomcat Server
- [Spring.io](https://start.spring.io/) - Spring Initializer


## ✍️ Authors <a name = "authors"></a>
- [Sharath P](https://github.com/SharathPremkumar) - FSD

## 🎉 Acknowledgements <a name = "acknowledgement"></a>
- Skill-Lync Internship Inspiration
- Google sources for developing all the HTML pages and design
- Youtube 

