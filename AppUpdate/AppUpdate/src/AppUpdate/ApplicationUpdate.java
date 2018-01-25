package AppUpdate;

import java.util.Date;

public class ApplicationUpdate {
	String version;
	Date update; 
	String url; 
	
	ApplicationUpdate(String version, Date update, String url){
		this.version = version; 
		this.update = update; 
		this.url = url; 
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Date getUpdate() {
		return update;
	}

	public void setUpdate(Date update) {
		this.update = update;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
