package at.fhj.iit;

import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.server.XmlRpcServer;
import org.apache.xmlrpc.webserver.WebServer;

/**
 * simple Server for testing XML-RPC with different programming langauges
 */
public class Server {

   /**
    * main entry point to start XML-RPC Server
    *
    * @param args
    */
   public static void main(String[] args) {

      try {
         System.out.println("Attempting to start XML-RPC Server...");

         // init webserver on specific port
         WebServer server = new WebServer(50505);

         // init XML-RPC Server
         XmlRpcServer xmlRpcServer = server.getXmlRpcServer();

         // create Property Handler
         PropertyHandlerMapping mapping = new PropertyHandlerMapping();
         // add "sample" Reference to Java Class with Implementation
         mapping.addHandler("sample", Calculator.class);

         // set handler to XML-RPC
         xmlRpcServer.setHandlerMapping(mapping);

         // start server
         server.start();

         System.out.println("Started successfully.");
         System.out.println("Accepting requests. (Halt program to stop.)");

      } catch (Exception exception) {
         System.err.println("Server: " + exception);
      }
   }
}