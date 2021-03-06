
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.squareup.square.http.client.HttpContext;
import java.util.Objects;

/**
 * This is a model class for V1Discount type.
 */
public class V1Discount {
    private HttpContext httpContext;
    private final String id;
    private final String name;
    private final String rate;
    private final V1Money amountMoney;
    private final String discountType;
    private final Boolean pinRequired;
    private final String color;
    private final String v2Id;

    /**
     * Initialization constructor.
     * @param id String value for id.
     * @param name String value for name.
     * @param rate String value for rate.
     * @param amountMoney V1Money value for amountMoney.
     * @param discountType String value for discountType.
     * @param pinRequired Boolean value for pinRequired.
     * @param color String value for color.
     * @param v2Id String value for v2Id.
     */
    @JsonCreator
    public V1Discount(
            @JsonProperty("id") String id,
            @JsonProperty("name") String name,
            @JsonProperty("rate") String rate,
            @JsonProperty("amount_money") V1Money amountMoney,
            @JsonProperty("discount_type") String discountType,
            @JsonProperty("pin_required") Boolean pinRequired,
            @JsonProperty("color") String color,
            @JsonProperty("v2_id") String v2Id) {
        this.id = id;
        this.name = name;
        this.rate = rate;
        this.amountMoney = amountMoney;
        this.discountType = discountType;
        this.pinRequired = pinRequired;
        this.color = color;
        this.v2Id = v2Id;
    }

    public HttpContext getContext() {
        return httpContext;
    }

    /**
     * Getter for Id.
     * The discount's unique ID.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return this.id;
    }

    /**
     * Getter for Name.
     * The discount's name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return this.name;
    }

    /**
     * Getter for Rate.
     * The rate of the discount, as a string representation of a decimal number. A value of 0.07
     * corresponds to a rate of 7%. This rate is 0 if discount_type is VARIABLE_PERCENTAGE.
     * @return Returns the String
     */
    @JsonGetter("rate")
    public String getRate() {
        return this.rate;
    }

    /**
     * Getter for AmountMoney.
     * @return Returns the V1Money
     */
    @JsonGetter("amount_money")
    public V1Money getAmountMoney() {
        return this.amountMoney;
    }

    /**
     * Getter for DiscountType.
     * @return Returns the String
     */
    @JsonGetter("discount_type")
    public String getDiscountType() {
        return this.discountType;
    }

    /**
     * Getter for PinRequired.
     * Indicates whether a mobile staff member needs to enter their PIN to apply the discount to a
     * payment.
     * @return Returns the Boolean
     */
    @JsonGetter("pin_required")
    public Boolean getPinRequired() {
        return this.pinRequired;
    }

    /**
     * Getter for Color.
     * @return Returns the String
     */
    @JsonGetter("color")
    public String getColor() {
        return this.color;
    }

    /**
     * Getter for V2Id.
     * The ID of the CatalogObject in the Connect v2 API. Objects that are shared across multiple
     * locations share the same v2 ID.
     * @return Returns the String
     */
    @JsonGetter("v2_id")
    public String getV2Id() {
        return this.v2Id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, rate, amountMoney, discountType, pinRequired, color, v2Id);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V1Discount)) {
            return false;
        }
        V1Discount other = (V1Discount) obj;
        return Objects.equals(id, other.id)
            && Objects.equals(name, other.name)
            && Objects.equals(rate, other.rate)
            && Objects.equals(amountMoney, other.amountMoney)
            && Objects.equals(discountType, other.discountType)
            && Objects.equals(pinRequired, other.pinRequired)
            && Objects.equals(color, other.color)
            && Objects.equals(v2Id, other.v2Id);
    }

    /**
     * Converts this V1Discount into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "V1Discount [" + "id=" + id + ", name=" + name + ", rate=" + rate + ", amountMoney="
                + amountMoney + ", discountType=" + discountType + ", pinRequired=" + pinRequired
                + ", color=" + color + ", v2Id=" + v2Id + "]";
    }

    /**
     * Builds a new {@link V1Discount.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link V1Discount.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .name(getName())
                .rate(getRate())
                .amountMoney(getAmountMoney())
                .discountType(getDiscountType())
                .pinRequired(getPinRequired())
                .color(getColor())
                .v2Id(getV2Id());
        return builder;
    }

    /**
     * Class to build instances of {@link V1Discount}.
     */
    public static class Builder {
        private HttpContext httpContext;
        private String id;
        private String name;
        private String rate;
        private V1Money amountMoney;
        private String discountType;
        private Boolean pinRequired;
        private String color;
        private String v2Id;



        /**
         * Setter for httpContext.
         * @param httpContext HttpContext value for httpContext.
         * @return Builder
         */
        public Builder httpContext(HttpContext httpContext) {
            this.httpContext = httpContext;
            return this;
        }

        /**
         * Setter for id.
         * @param id String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for name.
         * @param name String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for rate.
         * @param rate String value for rate.
         * @return Builder
         */
        public Builder rate(String rate) {
            this.rate = rate;
            return this;
        }

        /**
         * Setter for amountMoney.
         * @param amountMoney V1Money value for amountMoney.
         * @return Builder
         */
        public Builder amountMoney(V1Money amountMoney) {
            this.amountMoney = amountMoney;
            return this;
        }

        /**
         * Setter for discountType.
         * @param discountType String value for discountType.
         * @return Builder
         */
        public Builder discountType(String discountType) {
            this.discountType = discountType;
            return this;
        }

        /**
         * Setter for pinRequired.
         * @param pinRequired Boolean value for pinRequired.
         * @return Builder
         */
        public Builder pinRequired(Boolean pinRequired) {
            this.pinRequired = pinRequired;
            return this;
        }

        /**
         * Setter for color.
         * @param color String value for color.
         * @return Builder
         */
        public Builder color(String color) {
            this.color = color;
            return this;
        }

        /**
         * Setter for v2Id.
         * @param v2Id String value for v2Id.
         * @return Builder
         */
        public Builder v2Id(String v2Id) {
            this.v2Id = v2Id;
            return this;
        }

        /**
         * Builds a new {@link V1Discount} object using the set fields.
         * @return {@link V1Discount}
         */
        public V1Discount build() {
            V1Discount model =
                    new V1Discount(id, name, rate, amountMoney, discountType, pinRequired, color,
                            v2Id);
            model.httpContext = httpContext;
            return model;
        }
    }
}
