
package com.squareup.square.api;

import com.squareup.square.exceptions.ApiException;
import com.squareup.square.models.AccumulateLoyaltyPointsRequest;
import com.squareup.square.models.AccumulateLoyaltyPointsResponse;
import com.squareup.square.models.AdjustLoyaltyPointsRequest;
import com.squareup.square.models.AdjustLoyaltyPointsResponse;
import com.squareup.square.models.CalculateLoyaltyPointsRequest;
import com.squareup.square.models.CalculateLoyaltyPointsResponse;
import com.squareup.square.models.CreateLoyaltyAccountRequest;
import com.squareup.square.models.CreateLoyaltyAccountResponse;
import com.squareup.square.models.CreateLoyaltyRewardRequest;
import com.squareup.square.models.CreateLoyaltyRewardResponse;
import com.squareup.square.models.DeleteLoyaltyRewardResponse;
import com.squareup.square.models.ListLoyaltyProgramsResponse;
import com.squareup.square.models.RedeemLoyaltyRewardRequest;
import com.squareup.square.models.RedeemLoyaltyRewardResponse;
import com.squareup.square.models.RetrieveLoyaltyAccountResponse;
import com.squareup.square.models.RetrieveLoyaltyRewardResponse;
import com.squareup.square.models.SearchLoyaltyAccountsRequest;
import com.squareup.square.models.SearchLoyaltyAccountsResponse;
import com.squareup.square.models.SearchLoyaltyEventsRequest;
import com.squareup.square.models.SearchLoyaltyEventsResponse;
import com.squareup.square.models.SearchLoyaltyRewardsRequest;
import com.squareup.square.models.SearchLoyaltyRewardsResponse;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface LoyaltyApi {
    /**
     * Creates a loyalty account.
     * @param  body  Required parameter: An object containing the fields to POST for the request.
     *         See the corresponding object definition for field details.
     * @return    Returns the CreateLoyaltyAccountResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    CreateLoyaltyAccountResponse createLoyaltyAccount(
            final CreateLoyaltyAccountRequest body) throws ApiException, IOException;

    /**
     * Creates a loyalty account.
     * @param  body  Required parameter: An object containing the fields to POST for the request.
     *         See the corresponding object definition for field details.
     * @return    Returns the CreateLoyaltyAccountResponse response from the API call
     */
    CompletableFuture<CreateLoyaltyAccountResponse> createLoyaltyAccountAsync(
            final CreateLoyaltyAccountRequest body);

    /**
     * Searches for loyalty accounts in a loyalty program. You can search for a loyalty account
     * using the phone number or customer ID associated with the account. To return all loyalty
     * accounts, specify an empty `query` object or omit it entirely. Search results are sorted by
     * `created_at` in ascending order.
     * @param  body  Required parameter: An object containing the fields to POST for the request.
     *         See the corresponding object definition for field details.
     * @return    Returns the SearchLoyaltyAccountsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    SearchLoyaltyAccountsResponse searchLoyaltyAccounts(
            final SearchLoyaltyAccountsRequest body) throws ApiException, IOException;

    /**
     * Searches for loyalty accounts in a loyalty program. You can search for a loyalty account
     * using the phone number or customer ID associated with the account. To return all loyalty
     * accounts, specify an empty `query` object or omit it entirely. Search results are sorted by
     * `created_at` in ascending order.
     * @param  body  Required parameter: An object containing the fields to POST for the request.
     *         See the corresponding object definition for field details.
     * @return    Returns the SearchLoyaltyAccountsResponse response from the API call
     */
    CompletableFuture<SearchLoyaltyAccountsResponse> searchLoyaltyAccountsAsync(
            final SearchLoyaltyAccountsRequest body);

    /**
     * Retrieves a loyalty account.
     * @param  accountId  Required parameter: The ID of the [loyalty account](#type-LoyaltyAccount)
     *         to retrieve.
     * @return    Returns the RetrieveLoyaltyAccountResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    RetrieveLoyaltyAccountResponse retrieveLoyaltyAccount(
            final String accountId) throws ApiException, IOException;

    /**
     * Retrieves a loyalty account.
     * @param  accountId  Required parameter: The ID of the [loyalty account](#type-LoyaltyAccount)
     *         to retrieve.
     * @return    Returns the RetrieveLoyaltyAccountResponse response from the API call
     */
    CompletableFuture<RetrieveLoyaltyAccountResponse> retrieveLoyaltyAccountAsync(
            final String accountId);

    /**
     * Adds points to a loyalty account. - If you are using the Orders API to manage orders, you
     * only provide the `order_id`. The endpoint reads the order to compute points to add to the
     * buyer's account. - If you are not using the Orders API to manage orders, you first perform a
     * client-side computation to compute the points. For spend-based and visit-based programs, you
     * can call [CalculateLoyaltyPoints](#endpoint-Loyalty-CalculateLoyaltyPoints) to compute the
     * points. For more information, see [Loyalty Program
     * Overview](https://developer.squareup.com/docs/loyalty/overview). You then provide the points
     * in a request to this endpoint.
     * @param  accountId  Required parameter: The [loyalty account](#type-LoyaltyAccount) ID to
     *         which to add the points.
     * @param  body  Required parameter: An object containing the fields to POST for the request.
     *         See the corresponding object definition for field details.
     * @return    Returns the AccumulateLoyaltyPointsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    AccumulateLoyaltyPointsResponse accumulateLoyaltyPoints(
            final String accountId,
            final AccumulateLoyaltyPointsRequest body) throws ApiException, IOException;

    /**
     * Adds points to a loyalty account. - If you are using the Orders API to manage orders, you
     * only provide the `order_id`. The endpoint reads the order to compute points to add to the
     * buyer's account. - If you are not using the Orders API to manage orders, you first perform a
     * client-side computation to compute the points. For spend-based and visit-based programs, you
     * can call [CalculateLoyaltyPoints](#endpoint-Loyalty-CalculateLoyaltyPoints) to compute the
     * points. For more information, see [Loyalty Program
     * Overview](https://developer.squareup.com/docs/loyalty/overview). You then provide the points
     * in a request to this endpoint.
     * @param  accountId  Required parameter: The [loyalty account](#type-LoyaltyAccount) ID to
     *         which to add the points.
     * @param  body  Required parameter: An object containing the fields to POST for the request.
     *         See the corresponding object definition for field details.
     * @return    Returns the AccumulateLoyaltyPointsResponse response from the API call
     */
    CompletableFuture<AccumulateLoyaltyPointsResponse> accumulateLoyaltyPointsAsync(
            final String accountId,
            final AccumulateLoyaltyPointsRequest body);

    /**
     * Adds points to or subtracts points from a buyer's account. Use this endpoint only when you
     * need to manually adjust points. Otherwise, in your application flow, you call
     * [AccumulateLoyaltyPoints](#endpoint-Loyalty-AccumulateLoyaltyPoints) to add points when a
     * buyer pays for the purchase.
     * @param  accountId  Required parameter: The ID of the [loyalty account](#type-LoyaltyAccount)
     *         in which to adjust the points.
     * @param  body  Required parameter: An object containing the fields to POST for the request.
     *         See the corresponding object definition for field details.
     * @return    Returns the AdjustLoyaltyPointsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    AdjustLoyaltyPointsResponse adjustLoyaltyPoints(
            final String accountId,
            final AdjustLoyaltyPointsRequest body) throws ApiException, IOException;

    /**
     * Adds points to or subtracts points from a buyer's account. Use this endpoint only when you
     * need to manually adjust points. Otherwise, in your application flow, you call
     * [AccumulateLoyaltyPoints](#endpoint-Loyalty-AccumulateLoyaltyPoints) to add points when a
     * buyer pays for the purchase.
     * @param  accountId  Required parameter: The ID of the [loyalty account](#type-LoyaltyAccount)
     *         in which to adjust the points.
     * @param  body  Required parameter: An object containing the fields to POST for the request.
     *         See the corresponding object definition for field details.
     * @return    Returns the AdjustLoyaltyPointsResponse response from the API call
     */
    CompletableFuture<AdjustLoyaltyPointsResponse> adjustLoyaltyPointsAsync(
            final String accountId,
            final AdjustLoyaltyPointsRequest body);

    /**
     * Searches for loyalty events. A Square loyalty program maintains a ledger of events that occur
     * during the lifetime of a buyer's loyalty account. Each change in the point balance (for
     * example, points earned, points redeemed, and points expired) is recorded in the ledger. Using
     * this endpoint, you can search the ledger for events.
     * @param  body  Required parameter: An object containing the fields to POST for the request.
     *         See the corresponding object definition for field details.
     * @return    Returns the SearchLoyaltyEventsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    SearchLoyaltyEventsResponse searchLoyaltyEvents(
            final SearchLoyaltyEventsRequest body) throws ApiException, IOException;

    /**
     * Searches for loyalty events. A Square loyalty program maintains a ledger of events that occur
     * during the lifetime of a buyer's loyalty account. Each change in the point balance (for
     * example, points earned, points redeemed, and points expired) is recorded in the ledger. Using
     * this endpoint, you can search the ledger for events.
     * @param  body  Required parameter: An object containing the fields to POST for the request.
     *         See the corresponding object definition for field details.
     * @return    Returns the SearchLoyaltyEventsResponse response from the API call
     */
    CompletableFuture<SearchLoyaltyEventsResponse> searchLoyaltyEventsAsync(
            final SearchLoyaltyEventsRequest body);

    /**
     * Returns a list of loyalty programs in the seller's account. Currently, a seller can only have
     * one loyalty program.
     * @return    Returns the ListLoyaltyProgramsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ListLoyaltyProgramsResponse listLoyaltyPrograms() throws ApiException, IOException;

    /**
     * Returns a list of loyalty programs in the seller's account. Currently, a seller can only have
     * one loyalty program.
     * @return    Returns the ListLoyaltyProgramsResponse response from the API call
     */
    CompletableFuture<ListLoyaltyProgramsResponse> listLoyaltyProgramsAsync();

    /**
     * Calculates the points a purchase earns. - If you are using the Orders API to manage orders,
     * you provide `order_id` in the request. The endpoint calculates the points by reading the
     * order. - If you are not using the Orders API to manage orders, you provide the purchase
     * amount in the request for the endpoint to calculate the points. An application might call
     * this endpoint to show the points that a buyer can earn with the specific purchase.
     * @param  programId  Required parameter: The [loyalty program](#type-LoyaltyProgram) ID, which
     *         defines the rules for accruing points.
     * @param  body  Required parameter: An object containing the fields to POST for the request.
     *         See the corresponding object definition for field details.
     * @return    Returns the CalculateLoyaltyPointsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    CalculateLoyaltyPointsResponse calculateLoyaltyPoints(
            final String programId,
            final CalculateLoyaltyPointsRequest body) throws ApiException, IOException;

    /**
     * Calculates the points a purchase earns. - If you are using the Orders API to manage orders,
     * you provide `order_id` in the request. The endpoint calculates the points by reading the
     * order. - If you are not using the Orders API to manage orders, you provide the purchase
     * amount in the request for the endpoint to calculate the points. An application might call
     * this endpoint to show the points that a buyer can earn with the specific purchase.
     * @param  programId  Required parameter: The [loyalty program](#type-LoyaltyProgram) ID, which
     *         defines the rules for accruing points.
     * @param  body  Required parameter: An object containing the fields to POST for the request.
     *         See the corresponding object definition for field details.
     * @return    Returns the CalculateLoyaltyPointsResponse response from the API call
     */
    CompletableFuture<CalculateLoyaltyPointsResponse> calculateLoyaltyPointsAsync(
            final String programId,
            final CalculateLoyaltyPointsRequest body);

    /**
     * Creates a loyalty reward. In the process, the endpoint does following: - Uses the
     * `reward_tier_id` in the request to determine the number of points to lock for this reward. -
     * If the request includes `order_id`, it adds the reward and related discount to the order.
     * After a reward is created, the points are locked and not available for the buyer to redeem
     * another reward.
     * @param  body  Required parameter: An object containing the fields to POST for the request.
     *         See the corresponding object definition for field details.
     * @return    Returns the CreateLoyaltyRewardResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    CreateLoyaltyRewardResponse createLoyaltyReward(
            final CreateLoyaltyRewardRequest body) throws ApiException, IOException;

    /**
     * Creates a loyalty reward. In the process, the endpoint does following: - Uses the
     * `reward_tier_id` in the request to determine the number of points to lock for this reward. -
     * If the request includes `order_id`, it adds the reward and related discount to the order.
     * After a reward is created, the points are locked and not available for the buyer to redeem
     * another reward.
     * @param  body  Required parameter: An object containing the fields to POST for the request.
     *         See the corresponding object definition for field details.
     * @return    Returns the CreateLoyaltyRewardResponse response from the API call
     */
    CompletableFuture<CreateLoyaltyRewardResponse> createLoyaltyRewardAsync(
            final CreateLoyaltyRewardRequest body);

    /**
     * Searches for loyalty rewards in a loyalty account. In the current implementation, the
     * endpoint supports search by the reward `status`. If you know a reward ID, use the
     * [RetrieveLoyaltyReward](#endpoint-Loyalty-RetrieveLoyaltyReward) endpoint.
     * @param  body  Required parameter: An object containing the fields to POST for the request.
     *         See the corresponding object definition for field details.
     * @return    Returns the SearchLoyaltyRewardsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    SearchLoyaltyRewardsResponse searchLoyaltyRewards(
            final SearchLoyaltyRewardsRequest body) throws ApiException, IOException;

    /**
     * Searches for loyalty rewards in a loyalty account. In the current implementation, the
     * endpoint supports search by the reward `status`. If you know a reward ID, use the
     * [RetrieveLoyaltyReward](#endpoint-Loyalty-RetrieveLoyaltyReward) endpoint.
     * @param  body  Required parameter: An object containing the fields to POST for the request.
     *         See the corresponding object definition for field details.
     * @return    Returns the SearchLoyaltyRewardsResponse response from the API call
     */
    CompletableFuture<SearchLoyaltyRewardsResponse> searchLoyaltyRewardsAsync(
            final SearchLoyaltyRewardsRequest body);

    /**
     * Deletes a loyalty reward by doing the following: - Returns the loyalty points back to the
     * loyalty account. - If an order ID was specified when the reward was created (see
     * [CreateLoyaltyReward](#endpoint-Loyalty-CreateLoyaltyReward)), it updates the order by
     * removing the reward and related discounts. You cannot delete a reward that has reached the
     * terminal state (REDEEMED).
     * @param  rewardId  Required parameter: The ID of the [loyalty reward](#type-LoyaltyReward) to
     *         delete.
     * @return    Returns the DeleteLoyaltyRewardResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    DeleteLoyaltyRewardResponse deleteLoyaltyReward(
            final String rewardId) throws ApiException, IOException;

    /**
     * Deletes a loyalty reward by doing the following: - Returns the loyalty points back to the
     * loyalty account. - If an order ID was specified when the reward was created (see
     * [CreateLoyaltyReward](#endpoint-Loyalty-CreateLoyaltyReward)), it updates the order by
     * removing the reward and related discounts. You cannot delete a reward that has reached the
     * terminal state (REDEEMED).
     * @param  rewardId  Required parameter: The ID of the [loyalty reward](#type-LoyaltyReward) to
     *         delete.
     * @return    Returns the DeleteLoyaltyRewardResponse response from the API call
     */
    CompletableFuture<DeleteLoyaltyRewardResponse> deleteLoyaltyRewardAsync(
            final String rewardId);

    /**
     * Retrieves a loyalty reward.
     * @param  rewardId  Required parameter: The ID of the [loyalty reward](#type-LoyaltyReward) to
     *         retrieve.
     * @return    Returns the RetrieveLoyaltyRewardResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    RetrieveLoyaltyRewardResponse retrieveLoyaltyReward(
            final String rewardId) throws ApiException, IOException;

    /**
     * Retrieves a loyalty reward.
     * @param  rewardId  Required parameter: The ID of the [loyalty reward](#type-LoyaltyReward) to
     *         retrieve.
     * @return    Returns the RetrieveLoyaltyRewardResponse response from the API call
     */
    CompletableFuture<RetrieveLoyaltyRewardResponse> retrieveLoyaltyRewardAsync(
            final String rewardId);

    /**
     * Redeems a loyalty reward. The endpoint sets the reward to the `REDEEMED` terminal state. If
     * you are using your own order processing system (not using the Orders API), you call this
     * endpoint after the buyer paid for the purchase. After the reward reaches the terminal state,
     * it cannot be deleted. In other words, points used for the reward cannot be returned to the
     * account.
     * @param  rewardId  Required parameter: The ID of the [loyalty reward](#type-LoyaltyReward) to
     *         redeem.
     * @param  body  Required parameter: An object containing the fields to POST for the request.
     *         See the corresponding object definition for field details.
     * @return    Returns the RedeemLoyaltyRewardResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    RedeemLoyaltyRewardResponse redeemLoyaltyReward(
            final String rewardId,
            final RedeemLoyaltyRewardRequest body) throws ApiException, IOException;

    /**
     * Redeems a loyalty reward. The endpoint sets the reward to the `REDEEMED` terminal state. If
     * you are using your own order processing system (not using the Orders API), you call this
     * endpoint after the buyer paid for the purchase. After the reward reaches the terminal state,
     * it cannot be deleted. In other words, points used for the reward cannot be returned to the
     * account.
     * @param  rewardId  Required parameter: The ID of the [loyalty reward](#type-LoyaltyReward) to
     *         redeem.
     * @param  body  Required parameter: An object containing the fields to POST for the request.
     *         See the corresponding object definition for field details.
     * @return    Returns the RedeemLoyaltyRewardResponse response from the API call
     */
    CompletableFuture<RedeemLoyaltyRewardResponse> redeemLoyaltyRewardAsync(
            final String rewardId,
            final RedeemLoyaltyRewardRequest body);

}