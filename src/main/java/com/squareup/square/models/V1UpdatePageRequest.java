
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * This is a model class for V1UpdatePageRequest type.
 */
public class V1UpdatePageRequest {
    private final V1Page body;

    /**
     * Initialization constructor.
     * @param body V1Page value for body.
     */
    @JsonCreator
    public V1UpdatePageRequest(
            @JsonProperty("body") V1Page body) {
        this.body = body;
    }

    /**
     * Getter for Body.
     * V1Page
     * @return Returns the V1Page
     */
    @JsonGetter("body")
    public V1Page getBody() {
        return this.body;
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V1UpdatePageRequest)) {
            return false;
        }
        V1UpdatePageRequest other = (V1UpdatePageRequest) obj;
        return Objects.equals(body, other.body);
    }

    /**
     * Converts this V1UpdatePageRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "V1UpdatePageRequest [" + "body=" + body + "]";
    }

    /**
     * Builds a new {@link V1UpdatePageRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link V1UpdatePageRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(body);
        return builder;
    }

    /**
     * Class to build instances of {@link V1UpdatePageRequest}.
     */
    public static class Builder {
        private V1Page body;

        /**
         * Initialization constructor.
         * @param body V1Page value for body.
         */
        public Builder(V1Page body) {
            this.body = body;
        }

        /**
         * Setter for body.
         * @param body V1Page value for body.
         * @return Builder
         */
        public Builder body(V1Page body) {
            this.body = body;
            return this;
        }

        /**
         * Builds a new {@link V1UpdatePageRequest} object using the set fields.
         * @return {@link V1UpdatePageRequest}
         */
        public V1UpdatePageRequest build() {
            return new V1UpdatePageRequest(body);
        }
    }
}
