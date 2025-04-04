package org.example.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Data
public class EmptyArrayException extends RuntimeException {

    private final Double[] nums;
}
