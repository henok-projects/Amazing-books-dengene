package com.customer.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BooksDTO {
    private Long isbn;
    private Integer totalCopies;
    private Integer issuedCopies;
}
