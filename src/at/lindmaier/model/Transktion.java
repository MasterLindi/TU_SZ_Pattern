package at.lindmaier.model;

import java.util.Date;

public class Transktion {
  private int artikel;
  private int supplier;
  private Date date;
  private ZahlArt zahlArt;

  public void setArtikel(int artikel) {
    this.artikel = artikel;
  }

  public int getArtikel() {
    return artikel;
  }

  public void setSupplier(int supplier) {
    this.supplier = supplier;
  }

  public int getSupplier() {
    return supplier;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Date getDate() {
    return date;
  }

  public void setZahlArt(ZahlArt zahlArt) {
    this.zahlArt = zahlArt;
  }

  public ZahlArt getZahlArt() {
    return zahlArt;
  }
}
