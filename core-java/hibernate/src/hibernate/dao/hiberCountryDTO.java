package hibernate.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class hiberCountryDTO {
	@Entity
	@Table (name="flight_details")
	public class hierCountryDTO implements Serializable{
		@Id
		@Column (name="c_id")
		private int c_id;
		@Column (name="c_name")
		private String c_name;
		@Column (name="c_capital")
		private String c_capital;
		@Column (name="c_pincode")
		private String c_pincode;
		public hierCountryDTO() {
			// TODO Auto-generated constructor stub
		}
		public int getC_id() {
			return c_id;
		}
		public void setC_id(int c_id) {
			this.c_id = c_id;
		}
		public String getC_name() {
			return c_name;
		}
		public void setC_name(String c_name) {
			this.c_name = c_name;
		}
		public String getC_capital() {
			return c_capital;
		}
		public void setC_capital(String c_capital) {
			this.c_capital = c_capital;
		}
		public String getC_pincode() {
			return c_pincode;
		}
		public void setC_pincode(String c_pincode) {
			this.c_pincode = c_pincode;
		}
		@Override
		public String toString() {
			return "hierCountryDTO [c_id=" + c_id + ", c_name=" + c_name + ", c_capital=" + c_capital + ", c_pincode="
					+ c_pincode + "]";
		}
	}
}
