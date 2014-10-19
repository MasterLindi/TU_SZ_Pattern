package at.lindmaier.service;

import at.lindmaier.model.Artikel;
import at.lindmaier.repo.ArtikelRepository;
import at.lindmaier.repo.ArtikelRepositoryImpl;
import at.lindmaier.repo.ArtikelRepositoryImplAmazon;

public class ArtikelServiceImpl implements ArtikelService {


  private ArtikelRepository artikelRepository;

  public ArtikelServiceImpl(){
    artikelRepository = new ArtikelRepositoryImplAmazon();
  }

  @Override
  public Artikel increasePriceofArtikel(int amount, int id) {
    Artikel artikel = artikelRepository.getId(id);
    artikel.increasePrice(amount);
    return artikel;
  }
}
