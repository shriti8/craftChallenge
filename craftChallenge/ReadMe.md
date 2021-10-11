#API under test: https://api.nasa.gov/planetary/apod


##Test Api with Parameter as Date:

#####Test Case 1:To validate right date format (Automated method name: testCheckDate())
1. Enter the api link with correct date format https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&date=2021-10-09"
2. Check for the response code "200".
3. Verify the message.

#####Expected Result:200 response code with response atrributes should be displayed.

#####Test Case 2:To validate Invalid date format (Automated method name: testCheckInvalidDateFormat())
1. Enter the api link with correct date format https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&date=202-1-00"
2. Check for the api response code "400".
3. Verify the message.

#####Expected Result:400 response code with error message "time data '202-1-00' does not match format '%Y-%m-%d'" should be displayed.

#####Test Case 3:To validate out of range date with correct response code and error message (Automated method name:testCheckOutOfRange())
1. Enter the api link with correct date format https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&date=1800-10-09"
2. Check for the api response code "400".
3. Verify the message.

#####Expected Result:400 response code with error message should be displayed.

#####Test Case 4:To validate Invalid date with correct response code and error message (Automated method name:testCheckInvalidDate())
1. Enter the api link with correct date format https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&date=2021-10-99"
2. Check for the api response code "400".
3. Verify the message.

#####Expected Result:400 response code with error message :"unconverted data remains: 9"should be displayed.


##Test Api with Parameter as api_key:

#####Test Case 1:To validate when correct api key is entered (Automated method name:testCheckKey())
1. Enter the api link with a valid api_key https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY
2. Check for 200 response code.
3. Verify the message.

#####Expected Result:200 response code with response atrributes should be displayed.

#####Test Case 2:To validate when invalid api key is entered (Automated method name:testCheckInvalidKey())
1. Enter the api link with a valid api_key https://api.nasa.gov/planetary/apod?api_key=12
2. Check for 403 response code.
3. Verify the message.

#####Expected Result:403 response code should come.

#####Test Case 3:To validate when api key is missing
1. Enter the api link with a valid api_key https://api.nasa.gov/planetary/apod
2. Verify the messageof missing API_Key.

#####Expected Result:"API_KEY_MISSING" message should be displayed.


##Test Api with Parameter as concept tag

Note:As mentioned in "https://api.nasa.gov/"---->concept_tags are now disabled in this service(GET https://api.nasa.gov/planetary/apod)

##Test Api with Parameter as hd tag

#####Test Case 1:Check hd url is present for hd images:
1. Enter the api with link https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&date=2021-10-09 
2. Check the hdurl is present for hd image.

#####Expected Result:hdurl should be present

#####Test Case 2:Check hd url is not present for non hd images
1. Enter the api with link https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&date=2021-10-11 
2. Check the hdurl is not present.

#####Expected Result: hdurl should not be present.


