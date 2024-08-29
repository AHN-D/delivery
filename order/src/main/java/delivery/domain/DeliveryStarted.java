package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String adress;
    private String phoneNumber;
    private String charge;
    private String orderNumber;
    private Integer qty;
    private String status;
}
