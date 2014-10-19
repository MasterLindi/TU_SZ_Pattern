package at.lindmaier.repo;

import at.lindmaier.model.Transktion;

public interface TransaktionRepository {

  void save(Transktion transktion);
}
