package AppUpdate;

import java.util.Date;

public class ApplicationUpdate {
	String version;
	Date released; 
	String url; 
	
	ApplicationUpdate(String version, Date released, String url){
		this.version = version; 
		this.released = released; 
		this.url = url; 
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Date getReleased() {
		return released;
	}

	public void setReleased(Date released) {
		this.released = released;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
