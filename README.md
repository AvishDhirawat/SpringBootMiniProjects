# SpringBootMiniProjects
Several SpringBoot Mini Projects and Practices

Note :- To run/use the different Microservices you must run the SpringCloudConfigServer and then run that particular Service

To create a docker container for mysql use the below commands. ( You may use the container name, password, db name and ports according to you but may require to change the same in application.properties as well)

```
$ docker run -d --name mysql_container -e MYSQL_ROOT_PASSWORD=root -p 3307:3306 mysql
$ docker exec -it mysql_container bash

*inside mysql container bash*
mysql -u root -p
*enter mysql root password*
<create the required databases>
```

Currency Exchange Service
http://localhost:8000/currency-exchange/from/USD/to/INR

Currency Conversion Service
http://localhost:8100/currency-conversion/from/USD/to/INR/quantity/10

Here, *USD* and *INR* can be changed according to data.
