package petclinic.model;

import java.io.Serializable;

/**
 * BaseEntity provides Long id for all child entities.
 *
 * @author PPAVIA
 */
public class BaseEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
