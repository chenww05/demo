package glassdoor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class State {
	private int numJobs;
	private String name;
	public int getNumJobs() {
		return numJobs;
	}
	public String getName() {
		return name;
	}
}
