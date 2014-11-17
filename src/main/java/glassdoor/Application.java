package glassdoor;


import org.springframework.web.client.RestTemplate;

public class Application {
	public static void main(String[] args){
		RestTemplate restTemplate = new RestTemplate();
		String base = "http://api.glassdoor.com/api/api.htm?";
		base += "t.p=27156&t.k=dLD6SXe55c3";
		base += "&userip=0.0.0.0&useragent=&format=json&v=1&action=jobs-stats&returnStates=true&admLevelRequested=1";
		Page page = restTemplate.getForObject(base, Page.class);
		
		System.out.println("Status: " + page.getResponse().getStates().size());
	}
}
