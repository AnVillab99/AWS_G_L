# AWS_G_L
This laboratory intends for the students to create a web server that answers a simple math petition usng aws gateway and lambda services.

## Getting Started

You can download a copy of the project from github.
>https://github.com/AnVillab99/AWS_G_L


### Prerequisites

You will need maven, java and heroku cli installed on the computer to run this program.


### Installing

First you need to install java and jdk.
Go to java page and download both, install them and add the paths of those folders to the enviroment variables of your pc.
For maven you download the zip archive from the maven page and unpack it on a specific folder, the you add the path to that folder on the enviroment variables
This version doesn't work on heroku, for heroku don't allow to download the driver to connecto to the db


To configure the EC2 and S3 services, follow the steps on this guide:
> https://github.com/AnVillab99/Patrones-Arquitecturales-AWS


## Running the program

Connect to the EC2 instance and execute on the work folder:
> mvn exec:java -Dexec.mainClass="realtive.path.mainclass"
 and go to the s3 page


Server on EC2  :
![Server](https://github.com/AnVillab99/AWS_G_L/blob/master/resources/img/server.PNG)

EC2 group :
![EC2](https://github.com/AnVillab99/AWS_G_L/blob/master/resources/img/ec2.PNG)

S3 bucket :
![S3](https://github.com/AnVillab99/AWS_G_L/blob/master/resources/img/s3.PNG)

Page on S3 :
![Page](https://github.com/AnVillab99/AWS_G_L/blob/master/resources/img/page.PNG)

AutoScalingroup :
![AutoScalingroup](https://github.com/AnVillab99/AWS_G_L/blob/master/resources/img/asg1.PNG)

Use of gateway and lambda :
![Use](https://github.com/AnVillab99/AWS_G_L/blob/master/resources/img/request.PNG)


Use of gateway :
![gateway](https://github.com/AnVillab99/AWS_G_L/blob/master/resources/img/gateway.PNG)


Use of lambda :
![lambda](https://github.com/AnVillab99/AWS_G_L/blob/master/resources/img/lambda.PNG)


## Design

On the emebeded pdf document is a simple description of the design of this project 


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [JAVA](https://www.java.com/es/download) - Framework
* [JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Framework
* [AWS] (https://aws.amazon.com) - Services

## Versioning

For the versions available, see the [tags on this repository](https://github.com/AnVillab99/AWS_G_L/tags). 

## Authors

* **Andres Villamil**  [AnVillab99](https://github.com/AnVillab99)


## License

This project is under GNU General Public License - see [LICENSE](https://github.com/AnVillab99/AWS_G_L/blob/master/LICENSE) to more info.

## Acknowledgments

* StackOverflow



