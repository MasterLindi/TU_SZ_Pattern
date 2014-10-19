package at.lindmaier.model;

import java.util.Date;

public class Artikel extends BaseModel {
  private ArtikelTyp status;
  private String name;
  private String preis;
  private Supplier supplier;
  private Date sellDate;

  public ArtikelTyp getStatus() {
    return status;
  }

  public void setStatus(ArtikelTyp status) {
    this.status = status;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPreis() {
    return preis;
  }

  public void setPreis(String preis) {
    this.preis = preis;
  }

  public void increasePrice(int amount) {
    this.preis += amount;
  }

  public void setSupplier(Supplier supplier) {
    this.supplier = supplier;
  }

  public Supplier getSupplier() {
    return supplier;
  }

  public void setSellDate(Date sellDate) {
    this.sellDate = sellDate;
  }

  public Date getSellDate() {
    return sellDate;
  }
}
