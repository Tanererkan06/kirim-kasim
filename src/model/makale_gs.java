package model;

 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class makale_gs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	
	/*makale*/
	private String 	makale_adi;
	private String 	makale_tarihi;
	private String 	makale_icerik;
	private String 	makale_resim_yolu;
	
	/*haber
	private String 	haber_adi;
	private Date 	haber_tarihi;
	private String 	haber_icerik;
	private String 	haber_resim_yolu;
	ani
	private String 	ani_adi;
	private Date 	ani_tarihi;
	private String 	ani_icerik;
	private String 	ani_resim_yolu;
	 Bunlarý Biliyor muydunuz ? 
	private String 	bb_adi;
	private Date 	bb_tarihi;
	private String 	bb_icerik;
	private String 	bb_resim_yolu;
	
	 Baðlantýlar ? 
	private String 	bag_adi;
	private Date 	bag_tarihi;
	private String 	bag_icerik;
	private String 	bag_resim_yolu;*/
	
	public String getMakale_adi() {
		return makale_adi;
	}
	public void setMakale_adi(String makale_adi) {
		this.makale_adi = makale_adi;
	}
	public String getMakale_tarihi() {
		return makale_tarihi;
	}
	public void setMakale_tarihi(String makale_tarihi) {
		this.makale_tarihi = makale_tarihi;
	}
	public String getMakale_icerik() {
		return makale_icerik;
	}
	public void setMakale_icerik(String makale_icerik) {
		this.makale_icerik = makale_icerik;
	}
	public String getMakale_resim_yolu() {
		return makale_resim_yolu;
	}
	public void setMakale_resim_yolu(String makale_resim_yolu) {
		this.makale_resim_yolu = makale_resim_yolu;
	}
	/*public String getHaber_adi() {
		return haber_adi;
	}
	public void setHaber_adi(String haber_adi) {
		this.haber_adi = haber_adi;
	}
	public Date getHaber_tarihi() {
		return haber_tarihi;
	}
	public void setHaber_tarihi(Date haber_tarihi) {
		this.haber_tarihi = haber_tarihi;
	}
	public String getHaber_icerik() {
		return haber_icerik;
	}
	public void setHaber_icerik(String haber_icerik) {
		this.haber_icerik = haber_icerik;
	}
	public String getHaber_resim_yolu() {
		return haber_resim_yolu;
	}
	public void setHaber_resim_yolu(String haber_resim_yolu) {
		this.haber_resim_yolu = haber_resim_yolu;
	}
	public String getAni_adi() {
		return ani_adi;
	}
	public void setAni_adi(String ani_adi) {
		this.ani_adi = ani_adi;
	}
	public Date getAni_tarihi() {
		return ani_tarihi;
	}
	public void setAni_tarihi(Date ani_tarihi) {
		this.ani_tarihi = ani_tarihi;
	}
	public String getAni_icerik() {
		return ani_icerik;
	}
	public void setAni_icerik(String ani_icerik) {
		this.ani_icerik = ani_icerik;
	}
	public String getAni_resim_yolu() {
		return ani_resim_yolu;
	}
	public void setAni_resim_yolu(String ani_resim_yolu) {
		this.ani_resim_yolu = ani_resim_yolu;
	}
	public String getBb_adi() {
		return bb_adi;
	}
	public void setBb_adi(String bb_adi) {
		this.bb_adi = bb_adi;
	}
	public Date getBb_tarihi() {
		return bb_tarihi;
	}
	public void setBb_tarihi(Date bb_tarihi) {
		this.bb_tarihi = bb_tarihi;
	}
	public String getBb_icerik() {
		return bb_icerik;
	}
	public void setBb_icerik(String bb_icerik) {
		this.bb_icerik = bb_icerik;
	}
	public String getBb_resim_yolu() {
		return bb_resim_yolu;
	}
	public void setBb_resim_yolu(String bb_resim_yolu) {
		this.bb_resim_yolu = bb_resim_yolu;
	}
	public String getBag_adi() {
		return bag_adi;
	}
	public void setBag_adi(String bag_adi) {
		this.bag_adi = bag_adi;
	}
	public Date getBag_tarihi() {
		return bag_tarihi;
	}
	public void setBag_tarihi(Date bag_tarihi) {
		this.bag_tarihi = bag_tarihi;
	}
	public String getBag_icerik() {
		return bag_icerik;
	}
	public void setBag_icerik(String bag_icerik) {
		this.bag_icerik = bag_icerik;
	}
	public String getBag_resim_yolu() {
		return bag_resim_yolu;
	}
	public void setBag_resim_yolu(String bag_resim_yolu) {
		this.bag_resim_yolu = bag_resim_yolu;
	}*/
	
	public makale_gs(String makale_adi, String makale_tarihi,
			String makale_icerik, String makale_resim_yolu) {
		super();
		this.makale_adi = makale_adi;
		this.makale_tarihi = makale_tarihi;
		this.makale_icerik = makale_icerik;
		this.makale_resim_yolu = makale_resim_yolu;
	/*
		this.haber_adi = haber_adi;
		this.haber_tarihi = haber_tarihi;
		this.haber_icerik = haber_icerik;
		this.haber_resim_yolu = haber_resim_yolu;
	
		this.ani_adi = ani_adi;
		this.ani_tarihi = ani_tarihi;
		this.ani_icerik = ani_icerik;
		this.ani_resim_yolu = ani_resim_yolu;
		
		this.bb_adi = bb_adi;
		this.bb_tarihi = bb_tarihi;
		this.bb_icerik = bb_icerik;
		this.bb_resim_yolu = bb_resim_yolu;
		this.bag_adi = bag_adi;
		this.bag_tarihi = bag_tarihi;
		this.bag_icerik = bag_icerik;
		this.bag_resim_yolu = bag_resim_yolu;
		*/
	}
	public makale_gs() {
		super();
	}
	
	
	
	
	
}
