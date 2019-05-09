import requests
import json

# Request
# TODO replace your api key
headers = {'User-agent':'Mozilla/5.0'}
response = requests.get('https://suggestqueries.google.com/complete/search?q=fh+joanneum&client=firefox', headers=headers)

# Response
result = json.loads(response.content.decode('utf-8'))

# raw output
#print(result)	

# pretty output
print( json.dumps(result, indent=2) )