package cl.scop.backend.tdddojo.model.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class Product
{
    private String productDesc;

    private String familyId;


}
