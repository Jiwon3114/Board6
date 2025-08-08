package com.board.users.domain;

public class UserDTO {
		//게터 / 세터
	 	private String userid;
	 	private String passwd;
	 	private String username;
	 	private String email;
	 	private int upoint;
	 	private String memlevel;
	    private String indate;
		public String getUserid() {
			return userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public String getPasswd() {
			return passwd;
		}
		public void setPasswd(String passwd) {
			this.passwd = passwd;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getUpoint() {
			return upoint;
		}
		public void setUpoint(int upoint) {
			this.upoint = upoint;
		}
		public String getMemlevel() {
			return memlevel;
		}
		public void setMemlevel(String memlevel) {
			this.memlevel = memlevel;
		}
		public String getIndate() {
			return indate;
		}
		public void setIndate(String indate) {
			this.indate = indate;
		}
		//생성자
		public UserDTO() {
		
		}
		public UserDTO(String userid, String passwd, String username, String email, int upoint, String memlevel,
				String indate) {
			
			this.userid = userid;
			this.passwd = passwd;
			this.username = username;
			this.email = email;
			this.upoint = upoint;
			this.memlevel = memlevel;
			this.indate = indate;
		}
		//ToString
		@Override
		public String toString() {
			return "UserDTO [userid=" + userid + ", passwd=" + passwd + ", username=" + username + ", email=" + email
					+ ", upoint=" + upoint + ", memlevel=" + memlevel + ", indate=" + indate + "]";
		}

	    
}
