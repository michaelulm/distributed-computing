$(function () {
  "use strict";

  // for better performance - to avoid searching in DOM
  var content = $('#content');
  var input = $('#input');
  var status = $('#status');
  // TODO use JQuery or Plain Javascript, I would prefer JQuery and take a brief look at https://jquery.com/ (and also other documentations)

  // my name sent to the server
  var myName = false;

  // if user is running mozilla then use it's built-in WebSocket
  window.WebSocket = window.WebSocket || window.MozWebSocket;

  // open connection
  var connection = new WebSocket('ws://127.0.0.1:1337');
  // TODO replace IP for collaboration with other people
  // ask Tutor for SERVER IP where you should connect with your web client

  connection.onopen = function () {
	// TODO display status in e.g. html id "status"
  };

  connection.onerror = function (error) {
    // TODO display error e.g. in html content area
  };

  // most important part - handle incoming messages
  connection.onmessage = function (message) {
	  // TODO handle incoming messages
  };

  // TODO implement a possibility to send messages 
  // hint: use connection.send("Hello World"); for sending any kind of message
  
  // TODO check periodically which readyState is currently available
  // hint: e.g. display information to user if the connection is NOT open. why it's necessary to inform the user?
});