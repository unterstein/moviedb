package neo4j.models;

import org.springframework.data.neo4j.annotation.GraphId;

import java.io.Serializable;
import java.util.Date;

public class AbstractModel implements Serializable {

  @GraphId
  public Long id;

  public Date created;

  public AbstractModel() {
    created = new Date();
  }
}
