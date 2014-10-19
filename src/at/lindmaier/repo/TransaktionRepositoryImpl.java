package at.lindmaier.repo;

import at.lindmaier.model.Transktion;
import at.lindmaier.model.ZahlArt;
import at.lindmaier.service.TransaktionService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransaktionRepositoryImpl implements TransaktionRepository {
  private List<Transktion> transaktionList = new ArrayList<Transktion>();

  @Override
  public void save(Transktion transaktion) {
    transaktionList.add(transaktion);
  }
}
