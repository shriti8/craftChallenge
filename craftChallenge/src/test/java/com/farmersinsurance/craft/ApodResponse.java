package com.farmersinsurance.craft;

public class ApodResponse {
	 public String copyright;
	    public String date;
	    public String explanation;
	    public String hdurl;
	    public String media_type;
	    public String service_version;
	    public String title;
	    public String url;
	    
	    public int code;
	    public int httpCode;
	    public String msg;
	 
	    
		public String getCopyright() {
			return copyright;
		}
		public void setCopyright(String copyright) {
			this.copyright = copyright;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getExplanation() {
			return explanation;
		}
		public void setExplanation(String explanation) {
			this.explanation = explanation;
		}
		public String getHdurl() {
			return hdurl;
		}
		public void setHdurl(String hdurl) {
			this.hdurl = hdurl;
		}
		public String getMedia_type() {
			return media_type;
		}
		public void setMedia_type(String media_type) {
			this.media_type = media_type;
		}
		public String getService_version() {
			return service_version;
		}
		public void setService_version(String service_version) {
			this.service_version = service_version;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		
		
		
		public int getCode() {
			return code;
		}
		public void setCode(int code) {
			this.code = code;
		}
		public String getMsg() {
			return msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
		
		
		public int getHttpCode() {
			return httpCode;
		}
		public void setHttpCode(int httpCode) {
			this.httpCode = httpCode;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + code;
			result = prime * result + ((copyright == null) ? 0 : copyright.hashCode());
			result = prime * result + ((date == null) ? 0 : date.hashCode());
			result = prime * result + ((explanation == null) ? 0 : explanation.hashCode());
			result = prime * result + ((hdurl == null) ? 0 : hdurl.hashCode());
			result = prime * result + httpCode;
			result = prime * result + ((media_type == null) ? 0 : media_type.hashCode());
			result = prime * result + ((msg == null) ? 0 : msg.hashCode());
			result = prime * result + ((service_version == null) ? 0 : service_version.hashCode());
			result = prime * result + ((title == null) ? 0 : title.hashCode());
			result = prime * result + ((url == null) ? 0 : url.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ApodResponse other = (ApodResponse) obj;
			if (code != other.code)
				return false;
			if (copyright == null) {
				if (other.copyright != null)
					return false;
			} else if (!copyright.equals(other.copyright))
				return false;
			if (date == null) {
				if (other.date != null)
					return false;
			} else if (!date.equals(other.date))
				return false;
			if (explanation == null) {
				if (other.explanation != null)
					return false;
			} else if (!explanation.equals(other.explanation))
				return false;
			if (hdurl == null) {
				if (other.hdurl != null)
					return false;
			} else if (!hdurl.equals(other.hdurl))
				return false;
			if (httpCode != other.httpCode)
				return false;
			if (media_type == null) {
				if (other.media_type != null)
					return false;
			} else if (!media_type.equals(other.media_type))
				return false;
			if (msg == null) {
				if (other.msg != null)
					return false;
			} else if (!msg.equals(other.msg))
				return false;
			if (service_version == null) {
				if (other.service_version != null)
					return false;
			} else if (!service_version.equals(other.service_version))
				return false;
			if (title == null) {
				if (other.title != null)
					return false;
			} else if (!title.equals(other.title))
				return false;
			if (url == null) {
				if (other.url != null)
					return false;
			} else if (!url.equals(other.url))
				return false;
			return true;
		}
	
	
	    

}
