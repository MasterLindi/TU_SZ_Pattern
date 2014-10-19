package at.lindmaier.service;

import at.lindmaier.model.Supplier;
import at.lindmaier.model.ZahlArt;

import java.util.Date;

public interface TransaktionService {

  void saveTransaktion(int supplierId, int artikelId, Date datum, ZahlArt zahlArt);
}
