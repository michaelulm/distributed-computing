# Distributed Computing #

**EDUCATION Repository**

## Remote Objects / Web Services ##

Remote Objects or Web Services will extend your current local development with remote functionality and remote data. Here you will find some examples of different technologies, thoughts and guides for first steps of using (Web-)APIs.

Those examples will guide you for first integration existing (Web-)APIs to your application. Think about which data you will need in your application and which APIs maybe exists and could be used to extend or implement your needs.


### Remote Method Invocation (RMI) ###

#### Getting Started
Getting started with [RMI Example](rmi) and go through those steps to learn how Remote Method Invocation works.

- Clone [RMI Example](rmi)
- Test Local
- Test on two devices
  - Server
  - Client


Take care to start registry before starting server

- start registry
- start server
- start client
 
### REST API Calls ###

#### Google Geocoding API (DEPRECATED because it's not free anymore) ####

Get GPS Coordinates with Google Geocoding API, easy to use with Request this e.g. the Adress "Werk-VI-Strasse 46, 8605 Kapfenberg". correct, it's the FH JOANNEUM GmbH in Kapfenberg ;)

https://maps.googleapis.com/maps/api/geocode/json?address=Werk+VI+Strasse+68,+8605+Kapfenberg&key=YOUR_API_KEY

to get an API Key, just go to [https://console.developers.google.com/apis/dashboard](https://console.developers.google.com/apis/dashboard) and complete those steps:

- add new project, use a project name for easy identifying your project later
- change to your project
- activate Geocoding API (for addresses to gps)

#### OpenCage Geocoding API ####

Yeah! Really easy to use and a really good and FREE alternative to Google Geocoding API.

[https://opencagedata.com/api](https://opencagedata.com/api "OpenCage Geocoding API")

Demo Call (take care to use / replace your own Key): 
> curl https://api.opencagedata.com/geocode/v1/json?key=<YOUR-KEY>&q=Graz+Austria&pretty=1&no_annotations=1

#### OpenWeatherMap ####

most of REST APIs are well documented, like [https://openweathermap.org/](https://openweathermap.org/). This Weather API includes a lot of free API Calls per Day.

Easiest way to get current weather data is described on [https://openweathermap.org/current](https://openweathermap.org/current)

Demo Call (take care to use / replace your own Key):  
> curl https://api.openweathermap.org/data/2.5/weather?q=Kapfenberg&units=metric&APPID=<your-key>
 
#### GitHub API ####

For first steps it's easy to get data from GitHub API, e.g. User Data.

[https://developer.github.com/v3/#authentication](https://developer.github.com/v3/#authentication "GitHub API Documentation")

with curl you can try out really fast a REST Request

> curl -u "<your-username>" https://api.github.com

you will be asked for your password in command line, will list possible commands, just like 

> curl -u "<your-username>" https://api.github.com/user	

where you will get your current user information, you will also be asked for your password again.

it's also possible to use an access token, just follow this [guideline to get an access token](https://help.github.com/en/articles/creating-a-personal-access-token-for-the-command-line "Guideline to get a GitHub API access token"). after this you can try again

> curl https://api.github.com/user?access_token=<your-token>
