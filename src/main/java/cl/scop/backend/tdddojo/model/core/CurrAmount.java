package cl.scop.backend.tdddojo.model.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CurrAmount
{
    private String amount;

    private String currency;

}
