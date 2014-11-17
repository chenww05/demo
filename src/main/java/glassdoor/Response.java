package glassdoor;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*
 * "response": {
    "countReturned": 55,
    "states": {
      "South Carolina": {
        "numJobs": 5909,
        "name": "South Carolina",
        "id": 3411,
        "score": 0.8195474282138835,
        "latitude": 33.985115,
        "longitude": -80.96936
      },
    }
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
	private int countReturned;
	public int getCountReturned() {
		return countReturned;
	}
	private States states;
	public States getStates() {
		return states;
	}
}
