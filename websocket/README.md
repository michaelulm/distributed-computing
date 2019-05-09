# Distributed Computing #

**EDUCATION Repository**

## WebSocket

WebSocket will introduce a new way of communication between client and server. The bi-directional connection enables the possibility of constantinous send and receive message without set up connections all the time. The Server has now an easy way to send messages to the client to notify for updates, new messages and any kind of information.

WebSocket also enables an instant communication between all connected users. By doing your own implementation based on WebSocket a real-time communication and collaboration is possible.

### Getting Started
- Install [Node.js](https://nodejs.org/en/ "Node.js")
- run simple [webserver demo](node-webserver/app.js "Webserver Demo with Node.js")

> node app.js

will run a simple Hello World Example with Node.js

after testing Node.js is running at your local enviroment, start exploring Web Socket extension for Node.js, you are welcome to start with the prepares websocket template:

- (use npm package manager to) install [websocket](https://www.npmjs.com/package/websocket) extension
- install jquery with npm package manager or replace jquery reference at this examples
- use [websocket template](node-websocket) for your next steps
 


### Chat Example

#### Overview

The **first Task** should introduce you

- how to use an existing Web Socket, 
- to understand different Web Socket Event Handlers,
- and also to understand json messaging format.

#### Client

The exercise should include

- implement / extend a Chat UI
- implement **receive** and **send** method to use existing Web Socket Server for communication 

at the End you should be able to use a Web Socket for a **two-way-communication**.
This simple starter example helps to start implementing only the client. You will 

- handle messages,  
- display those messages on the screen and 
- send messages to other users

#### Steps ToDo

- Check if you are in the same network like the server
- Open [WebSocket Demo](chat/exercise-websocket.html) in your Browser, e.g. Firefox or Chrome
- Open [frontend.js](chat/exercise-frontend.js) in your IDE, e.g. IntelliJ
- Go through the different **TODO**s in the frontend.js
- Implement or change different settings to create a **working chat client**

#### Useful Links
- [jQuery](http://jquery.com/)
- [jQuery Tutorial](https://www.w3schools.com/jquery/)
- [How to append Text in HTML & JQuery](http://api.jquery.com/append/)
- [How to handle a Click on a HTML Element with JQuery](https://api.jquery.com/click/)
- [How to handle Keyevents with JQuery](https://api.jquery.com/keypress/)
- [Writing Web Socket Clients](https://developer.mozilla.org/en-US/docs/Web/API/WebSockets_API/Writing_WebSocket_client_applications)

#### Additional Tasks
- Write another Web Socket Client in e.g. Python


### Full Chat - Client and Server
#### Main Tasks

The Full Chat Example will be the next step of understanding Web Socket. The Client Behaviour is for understanding major event-driven communication of Web Sockets. The Server should now introduce you

- to understand handling data on server side
- how to forward incoming messages to all clients
- implementing your first Web Socket Server


#### Additional Tasks
- **Add username**: input ausername before starting your communication, and other people will see your username as a Prefix of your message
- **Message Counter**: count all messages and add those counter as a prefix
- **Message History**: add a message history, because new users will not get old messages per defaullt (because it's a **real-time-communication**, and history doesn't work out of the box.)
- **Private Message**: Type in a username before start writing your message, only this user will get the private message
- **Log messages**: log all messages e.g. on the file system or in a database

