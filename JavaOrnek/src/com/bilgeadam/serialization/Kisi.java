package com.bilgeadam.serialization;

import java.io.Serializable;

public class Kisi implements Serializable {
      private String ad;
      private String soyad;
      //
      public Kisi(){ }
      public Kisi(String ad, String soyad){
            this.ad = ad;
            this.soyad = soyad;
      }
      public String getAd() {
            return ad;
      }
      public void setAd(String ad) {
            this.ad = ad;
      }
      public String getSoyad() {
            return soyad;
      }
      public void setSoyad(String soyad) {
            this.soyad = soyad;
      }

      
      
      @Override
  	public String toString() {
  		return "Kisi [ad=" + ad + ", soyad=" + soyad + "]";
  	}
}
