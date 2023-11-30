Welcome to JSF Primefaces tutorial. JavaServer Faces is one of the leading framework that is used these days for implementing Java web application user interface. JSF has componentized web application and especially that part related to the interface, in that all single view in the JSF has been built using a server side tree of components decoded into HTML when it comes to be rendered into browser.
<h1>JSF Primefaces Tutorial</h1>

The process of rendering the view in JSF does pass through what known as JSF lifecycle. This tutorial isn’t intended for providing you a detailed discussion of how lifecycle works or how could we deal with. It’s just a notification about what you should know about the JSF framework and how get JSF view ready for rendering.
<image src="JSF-LifecycleI.png" alt="JSF Lifecycle" /><br/>
JSF has two major implementations till the time in which the article written, oracle implementation Mojarra and Apache MyFaces implementation. Several JSF libraries has been coming into existence, Richfaces, IceFaces, Primefaces, MyFaces, etc and one of the most lead library that used intensively and has an excellent reputation is Primefaces. Primefaces cellabrate before months ago by releasing the Primefaces 5 which will consider the subject of this tutorial and next coming tutorials. For being able of using the primefaces 5, you must install and configure it into your project. Either you are going to use a simple text editor or an enterprise development environment, by ending of this tutorial you will be ready for discovering the all Primefaces vomponrnts.

<h2>What’s New In JSF 2</h2>
As we knew, a JavaServer Faces is a framework for developing rich user interface web pages. JSF has been introduced in several Java Community Request JSR where the final release of JSF 2 was released in Jul, 2009 which contains a set of enhancement and new functionalities. Set of consequences have followed JSF 2 and the final one was JSF 2.2 that released in May 2013. Unlike JSF 1.x, JSF 2.x has been coming with a lot of features like using the annotations for declaring the JSF managed beans, Converters, Validators, Scopes etc. That’s not all the story, JSF 2 had provided a newly scopes like View Scope, Custom Scope, Flow Scope and Conversation Scope and much more. Also, we cannot forget the most amazing feature that added for JSF 2 and it’s an Ajax concept. In JSF 2, Ajax has built into JSF framework inherently. So, any of JSF component can be ajaxified by simply adding the Ajax stuff. Navigation rules also has changed and be much easier as well. Next coming tutorials would cover more about those features that added for JSF 2, while in this tutorial, you’re going to create simple JSF application and a bsic sample of how we could use the Primefaces Tags for implementing certain business scenario.

<h2>Used Tools For Completing Tutorial</h2>
For getting started discovering this tutorial, you have to use the following development tools.

- Tomcat 7
- Eclipse IDE
- Maven 3
- JSF 2 / Primefaces 5

It’s obvious that we’ve used the Tomcat 7 for deploying the application and Eclipse IDE for developing the required components where the Maven used as building tool and for managing dependencies. So, be sure that you are aware of how could be all of these softwares installed and configured into your development machine. Our final project will look like below image.
[Default](#){.btn .btn-default}
[Primary](#){.btn .btn-primary}
[Info](#){.btn .btn-info}
[Success](#){.btn .btn-success}
[Warning](#){.btn .btn-warning}
[Danger](#){.btn .btn-danger}
[Link](#){.btn .btn-link}

<image src="PrimeFaces-Example-Project.png" alt="JSF Primefaces 5" /><br/>

<h2>Creating Eclipse Project</h2>
Eclipse IDE support the development of web project under Dynamic Project umbrella. For creating a dynamic project just follow the below steps:

Open Eclipse IDE
Right-Click on the project explorer space and select New - Dynamic Web Project
<image src="New-Dynamic-Web-Project.png" alt="JSF Primefaces 5" /><br/>
JSF Primefaces, Primefaces Tutorial, Primefaces Example, JSF Primefaces Eclipse
Complete the project creation process by setting up the project name, target runtime, source folder, context root, content directory and web.xml

<h2>JSF Installation & Configuration</h2>
As we’ve mentioned earlier, our goal is to use JSF/Primefaces for developing web application that uses the primefaces user interface component, but for now, all what we had is just a simple dynamic application that needs more steps for being jsf configured. To add a jsf into your project you need to add the jsf facet and making notice that the adding of jsf implementation does help you build a jsf application that uses Mojarra. For adding that facet you need to follow the below steps:

1. Open the properties window for the created project
2. From the Project Facets pane, just make the JavaServer Faces checked and follow Further configuration required for completing the configuration
3. Once you’ve clicked on Further configuration required, JSF Capabilities window must be shown
4. Adding the jsf implementation library by clicking on Download Library< and select from the opening window JSF 2.2 (Mojarra 2.2.0)

After installing the JSF library, the JSF capabilities window looks like

<image src="JSF-Library-Installed.png" alt="JSF Primefaces 5" /><br/>

By end of this phase, you have a web application with jsf capabilities.

<h2>Primefaces 5 Installation</h2>
For now, your application is ready for using a JavaServer Faces User Interface, but not using of Primefaces. For being able of using the primefaces, you have to follow the below steps:

Download the required primefaces library from the primefaces official site or from Maven central.
Include the downloaded Primefaces JAR into your lib folder that beneath of WEB-INF folder

<h2>Developing Primefaces Application</h2>
Now, you project is ready for developing a JSF/Primefaces application as you would see. We are going to create a simple application in which a Primefaces DataTable has consumed a list of Employees from the backing bean. Employees list would be populated by a @PostConstruct special method. Follow the below steps for developing a full JSF/Primefaces application.

Create a managed bean named ViewEmployeesManagedBean
Create a Pojo named Employee that contains EmployeeName and EmployeeId
Create a Primefaces view in order to consume the employees list in the defined managed bean

<image src="jsf_tutorial1.png" alt="JSF Primefaces 5" /><br/>
<image src="jsf-java-tutorial.png" alt="JSF Primefaces 5" /><br/>
Notice the use of JSF annotations and and use of PostConstruct annotation to populate the list of employees.
<image src="jsf html tutorial.png" alt="JSF Primefaces 5" /><br/>
Notice the use of dataTable element to create the table from the managed bean properties. PrimeFaces and JSF takes care of passing these to the view page for rendering. If you are from Servlet background, you can easily see that number of steps are cut down - in servlet environment, we first handle the request in servlet, create the model data, set it as attribute in request/session and then forward it to the JSP page to render the response.
<image src="jsf xml tutorial.png" alt="JSF Primefaces 5" /><br/>
Notice that javax.faces.webapp.FacesServlet is the controller class, this is where we plugin JSF into our web application.
<image src="config jsf tutorial.png"   alt="JSF Primefaces 5" /><br/>
This is where we provide JSF components configurations such as managed beans, i18n global messages, custom view handlers and custom factory classes. Since we are using annotations and it’s a simple project, there is no configuration done here, but we will see it’s usage in future posts. Now when you will run this, you will get output as shown in below image.
<image src="JSF-Primefaces-Simple-Demo.png" alt="JSF Primefaces 5" /><br/>

<h2>Convert Into Maven</h2>
Maven is the most preferred way to manage the java projects build and dependencies, so here we will see how we can convert it to Maven. Eclipse IDE provide the option to convert your Dynamic Web Project into Maven. Maven will help you controlling and managing the required dependencies. Just right click on the created project and from configure menu select Convert into Maven Project. Once you have changed your project into Maven, you have to add the required dependencies for making the project compilable by the Maven itself. The supposed Maven XML that you gain once you’ve converted the application into Maven project and after adding the required libraries for JSF 2, Primefaces and other is:
<image src="tuto1.png" alt="JSF Primefaces 5" /><br/>
<image src="tuto 2.png" alt="JSF Primefaces 5" /><br/>

And by executing the mvn clean package against the project, you will get a WAR file ready for being deployed against any of the Java EE container. Just deploy and examine.

<h3 style="color: #2e6c80;">
This tutorial has introduced how you could use a JSF 2 / Primefaces for implementing a web application user interface. In that, we’ve used Eclipse IDE for achieving that, by creating a dynamic project followed by adding all of required libraries either those mandatory for JSF 2 implementation or those required for using Primefaces components. From next tutorial onwards, we will use Maven to create the project for our examples.

Download PrimeFaces Hello World Project

Download sample project from above link and play around with it to learn more. Reference: Primefaces Official Website
</h3>