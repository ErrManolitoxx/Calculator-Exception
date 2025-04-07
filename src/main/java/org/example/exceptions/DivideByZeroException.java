package org.example.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
public class DivideByZeroException extends Exception {

    private final double num2;

}
