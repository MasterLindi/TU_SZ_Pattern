package at.lindmaier.service;

import at.lindmaier.model.Transktion;
import at.lindmaier.model.ZahlArt;
import at.lindmaier.repo.ArtikelRepository;
import at.lindmaier.repo.SupplierRepository;
import at.lindmaier.repo.TransaktionRepository;

import java.util.Date;

public class TransaktionServiceImpl implements TransaktionService{

  private ArtikelRepository artikelRepository;
  private SupplierRepository supplierRepository;
  private TransaktionRepository transaktionRepository;

  @Override
  public void saveTransaktion(int supplierId, int artikelId, Date datum, ZahlArt zahlArt) {
     Transktion transaktion  = new Transktion();
     transaktion.setArtikel(artikelId);
     transaktion.setSupplier(supplierId);
    transaktion.setDate(datum);
    transaktion.setZahlArt(zahlArt);
    transaktionRepository.save(transaktion);
  }
}
