package com.cwang.bookclub.api;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Test}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTest.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Test"})
public final class ImmutableTest implements Test {
  private final String test;
  private final String otherTest;

  private ImmutableTest(String test, String otherTest) {
    this.test = test;
    this.otherTest = otherTest;
  }

  /**
   * @return The value of the {@code test} attribute
   */
  @JsonProperty("test")
  @Override
  public String test() {
    return test;
  }

  /**
   * @return The value of the {@code otherTest} attribute
   */
  @JsonProperty("otherTest")
  @Override
  public String otherTest() {
    return otherTest;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Test#test() test} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for test
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTest withTest(String value) {
    if (this.test.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "test");
    return new ImmutableTest(newValue, this.otherTest);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Test#otherTest() otherTest} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for otherTest
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTest withOtherTest(String value) {
    if (this.otherTest.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "otherTest");
    return new ImmutableTest(this.test, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTest
        && equalTo((ImmutableTest) another);
  }

  private boolean equalTo(ImmutableTest another) {
    return test.equals(another.test)
        && otherTest.equals(another.otherTest);
  }

  /**
   * Computes a hash code from attributes: {@code test}, {@code otherTest}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + test.hashCode();
    h += (h << 5) + otherTest.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Test} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Test{"
        + "test=" + test
        + ", otherTest=" + otherTest
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Test {
    String test;
    String otherTest;
    @JsonProperty("test")
    public void setTest(String test) {
      this.test = test;
    }
    @JsonProperty("otherTest")
    public void setOtherTest(String otherTest) {
      this.otherTest = otherTest;
    }
    @Override
    public String test() { throw new UnsupportedOperationException(); }
    @Override
    public String otherTest() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTest fromJson(Json json) {
    ImmutableTest.Builder builder = ImmutableTest.builder();
    if (json.test != null) {
      builder.test(json.test);
    }
    if (json.otherTest != null) {
      builder.otherTest(json.otherTest);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Test} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Test instance
   */
  public static ImmutableTest copyOf(Test instance) {
    if (instance instanceof ImmutableTest) {
      return (ImmutableTest) instance;
    }
    return ImmutableTest.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTest ImmutableTest}.
   * @return A new ImmutableTest builder
   */
  public static ImmutableTest.Builder builder() {
    return new ImmutableTest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTest ImmutableTest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_TEST = 0x1L;
    private static final long INIT_BIT_OTHER_TEST = 0x2L;
    private long initBits = 0x3L;

    private String test;
    private String otherTest;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Test} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Test instance) {
      Objects.requireNonNull(instance, "instance");
      test(instance.test());
      otherTest(instance.otherTest());
      return this;
    }

    /**
     * Initializes the value for the {@link Test#test() test} attribute.
     * @param test The value for test 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("test")
    public final Builder test(String test) {
      this.test = Objects.requireNonNull(test, "test");
      initBits &= ~INIT_BIT_TEST;
      return this;
    }

    /**
     * Initializes the value for the {@link Test#otherTest() otherTest} attribute.
     * @param otherTest The value for otherTest 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("otherTest")
    public final Builder otherTest(String otherTest) {
      this.otherTest = Objects.requireNonNull(otherTest, "otherTest");
      initBits &= ~INIT_BIT_OTHER_TEST;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTest ImmutableTest}.
     * @return An immutable instance of Test
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTest(test, otherTest);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_TEST) != 0) attributes.add("test");
      if ((initBits & INIT_BIT_OTHER_TEST) != 0) attributes.add("otherTest");
      return "Cannot build Test, some of required attributes are not set " + attributes;
    }
  }
}
