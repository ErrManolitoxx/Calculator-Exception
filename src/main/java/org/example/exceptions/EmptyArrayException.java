package org.example.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Data
public class EmptyArrayException extends RuntimeException {

    private final List<Double> nums;
}
