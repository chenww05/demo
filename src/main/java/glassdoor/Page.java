package glassdoor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Page {
	private boolean success;
	private String status;
	private Response response;
	public boolean getSuccses() {
		return success;
	}
	public String getStatus(){
		return status;
	}
	public Response getResponse(){
		return response;
	}
}
