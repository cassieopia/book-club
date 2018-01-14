package com.cwang.bookclub.api;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableTest.class)
@JsonDeserialize(as = ImmutableTest.class)
public interface Test {

    String test();

    String otherTest();

}
