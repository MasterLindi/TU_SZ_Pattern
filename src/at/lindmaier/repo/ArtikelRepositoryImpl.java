package at.lindmaier.repo;

import at.lindmaier.model.Artikel;

import java.util.ArrayList;
import java.util.List;

public class ArtikelRepositoryImpl implements ArtikelRepository {

  List<Artikel> artikelList = new ArrayList<Artikel>();

  @Override
  public Artikel getId(int id) {
    for (Artikel artikel : artikelList) {
      if (artikel.getId() == id)
        return artikel;
    }
    return null;
  }
}

