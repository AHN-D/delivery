package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class InventoryIncreased extends AbstractEvent {

    private Long id;
}
