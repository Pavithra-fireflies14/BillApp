package com.supermarket.BillingApplication;



	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;


	@Entity
	@Table(name="products")
	public class Product {
		@Column(name="product_gst")
		private float product_gst;
		@Column(name="product_name")
		private String product_name;
		@Column(name="product_price")
		private float product_price;
		@Column(name="product_code")
		private String product_code;
		@Column(name="id")
		private Long id;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		protected Product() {
			
		}
		
		public String getProduct_code() {
			return product_code;
		}
		public void setProduct_code(String product_code) {
			this.product_code = product_code;
		}
		public float getProduct_gst() {
			return product_gst;
		}
		public void setProduct_gst(float product_gst) {
			this.product_gst = product_gst;
		}
		public String getProduct_name() {
			return product_name;
		}
		public void setProduct_name(String product_name) {
			this.product_name = product_name;
		}
		public float getProduct_price() {
			return product_price;
		}
		public void setProduct_price(float product_price) {
			this.product_price = product_price;
		}
		
		
		
		
		
		
		
		

	}



