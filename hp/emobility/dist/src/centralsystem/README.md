# Introduction 

The central system of the eMobility honeynet is based on a slightly edited version of the SteVe project.

SteVe (https://github.com/RWTH-i5-IDSG/steve) was developed at the RWTH Aachen University and means Steckdosenverwaltung, namely socket administration in German. The aim of SteVe is to support the deployment and popularity of electric mobility, so it is easy to install and to use. SteVe provides basic functions for the administration of charge points, user data, and RFID cards for user authentication and was tested successfully in operation.

SteVe is considered as an open platform to implement, test and evaluate novel ideas for electric mobility, like authentication protocols, reservation mechanisms for charge points, and business models for electric mobility. SteVe is distributed under [GPL](LICENSE.txt) and is free to use.

# Requirements & Configuration

1. You need JDK 8, Maven and MySQL.

2. The charge points must be configured to communicate with following addresses. Depending on the OCPP version of the charge point, SteVe will automatically route messages to the version-specific implementation.
  - SOAP: `http://<your-server-ip>:<port>/steve/services/CentralSystemService`
  - WebSocket/JSON: `ws://<your-server-ip>:<port>/steve/websocket/CentralSystemService/<chargeBoxId>`
   
3. Configuration is defined in [main.properties](src/main/resources/config/prod/main.properties):
  - You _must_ change [database configuration](src/main/resources/config/prod/main.properties#L3-L7)
  - You _must_ change [the host](src/main/resources/config/prod/main.properties#L16) to the correct IP address of your server
  - You _must_ change [web interface credentials](src/main/resources/config/prod/main.properties#L11-L12)
  - You _can_ access the application via HTTPS, by [enabling it and setting the keystore properties](src/main/resources/config/prod/main.properties#L25-L28)
  
4. The following MySQL statements can be used as database initialization (adjust according to your setup):

    ```
    CREATE DATABASE stevedb;
    GRANT ALL PRIVILEGES ON stevedb.* TO 'steve'@'localhost' IDENTIFIED BY 'changeme';
    GRANT SELECT ON mysql.proc TO 'steve'@'localhost' IDENTIFIED BY 'changeme';
    ```

# How to use?

Compile and build an archive ready to run: `mvn package`

Start the application: `java -jar steve-***.jar`

Access the Web interface: `http://<your-server-ip>:<port>/steve/manager`

