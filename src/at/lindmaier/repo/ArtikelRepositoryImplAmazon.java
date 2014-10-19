package at.lindmaier.repo;

import at.lindmaier.model.Artikel;

public class ArtikelRepositoryImplAmazon implements ArtikelRepository {
  @Override
  public Artikel getId(int id) {
    return new Artikel();
  }
}
