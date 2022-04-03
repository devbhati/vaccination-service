POST CALL - CREATE_USER - JSON - localhost:8081/api/create
POST CALL - UPDATE USER - JSON - localhost:8081/api/update => BODY SHOULD BE IN THIS FORMAT
{
    "userID": "44444",
    "illness": [
        {
            "illnessID": "420",
            "location": {
                "addressLine1": "line1",
                "addressLine2": "line1",
                "city": "line1",
                "state": "line1",
                "zip": "line1",
                "geoLocation": "line1"
            }
        }
    ],
    "role": [
        {"role": "HP_Admin", "permissions": {"hid": "12345"} }
    ],
    "aadhar": "420420420420",
    "registeredVaccinationDrives": [
        "420"
    ],
    "completedVaccinationDrives": [
        "420"
    ]
}



POST CALL - CREATE/REPORT ILLNESS - JSON - localhost:8089/api/create => BODY SHOULD BE IN THIS FORMAT
{
	"uniqueID": "786",
	"label": "TB",
	"location": {
		"addressLine1": "line1",
        "addressLine2": "line1",
        "city": "line1",
        "state": "line1",
        "zip": "line1",
        "geoLocation": "line1"
	},
	"symptoms": ["Cough", "Weakness"]
}

GET CALLGET ALL ILLNESS - FOR DROPDOWNS - localhost:8089/api/getAllIllness => NOTHING REQUIRED IN BODY OR URL



POST CALL - CREATE HOSPITAL - JSON - localhost:7777/api/createHospital -
{
	"uniqueID": "12345",
	"secretCode": "coupon",
	"numberOfPeople": "1",
	"name": "AIG",
	"location": {
		"addressLine1": "line1",
        "addressLine2": "line1",
        "city": "line1",
        "state": "line1",
        "zip": "line1",
        "geoLocation": "line1"
	},
	"count": "3"
}

GET CALL - GET HOSPITAL - localhost:7777/api/getHospital?secretCode=<<SECRETCODE>>

GET CALL - UPDATE ADMIN COUNT - localhost:7777/api/updateAdminCount?uniqueID=12345


POST CALL - BOOK APPOINTMENT - localhost:5555/api/vaccination/bookAppointment

{
	"userId": "443",
	"driveId": "211",
	"timeline": {
		"date": "{{$timestamp}}",
		"slot": {
			"fromTime": "09:00",
			"toTime": "12:00"
		}
	}
}

localhost:5555/api/vaccination/getAvailableVaccinationDrives - Inprogress
