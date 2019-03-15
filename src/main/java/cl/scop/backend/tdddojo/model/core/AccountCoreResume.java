package cl.scop.backend.tdddojo.model.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountCoreResume {
    private String accountId;
    private Product product;
    private Balance balance;


}