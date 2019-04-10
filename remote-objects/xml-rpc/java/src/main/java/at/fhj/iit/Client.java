package at.fhj.iit;

import java.net.URL;
import java.util.*;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

/**
 * simple Client for testing Remote Procedure Calls with XML-RPC
 */
public class Client {
    public static void main(String[] args) {

        try {
            // init needed XML-RPC Configuration
            XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
            // define Server URL
            config.setServerURL(new URL("http://127.0.0.1:8080/"));

            // init XML-RPC Client
            XmlRpcClient client = new XmlRpcClient();
            // set config to client
            client.setConfig(config);

            // init params for Method-Call
            Vector params = new Vector();
            // add needed params in correct order
            params.addElement(new Integer(31));
            params.addElement(new Integer(11));

            // execute remote method with reference name "sample" and method name "sum"
            Object result = client.execute("sample.sum", params);

            // parse current value
            int sum = ((Integer) result).intValue();
            System.out.println("The sum is: " + sum);

        } catch (Exception exception) {
            System.err.println("Client: " + exception);
        }
    }
}