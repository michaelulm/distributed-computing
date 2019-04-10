# just import library
import xmlrpc.client

# call Server Address
server = xmlrpc.client.ServerProxy("http://localhost:50505")

# call sample method from XML-RPC Java Server
print( server.sample.sum(13, 29) )