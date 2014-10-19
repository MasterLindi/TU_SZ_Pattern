package at.lindmaier.service;

import at.lindmaier.model.Artikel;
import at.lindmaier.model.Supplier;
import at.lindmaier.model.ZahlArt;

import java.util.Date;

public interface ArtikelService {

  Artikel increasePriceofArtikel(int amount, int id);
}
