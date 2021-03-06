// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos;

import com.azure.cosmos.implementation.RequestOptions;
import com.azure.cosmos.util.Beta;

/**
 *
 * @deprecated forRemoval = true, since = "4.19"
 * This class is not necessary anymore and will be removed. Please use {@link com.azure.cosmos.models.CosmosBatchPatchItemRequestOptions}
 *
 * Encapsulates options that can be specified for an operation within a {@link TransactionalBatch}.
 */
@Beta(value = Beta.SinceVersion.V4_13_0, warningText = Beta.PREVIEW_SUBJECT_TO_CHANGE_WARNING)
@Deprecated() //forRemoval = true, since = "4.19"
public final class TransactionalBatchPatchItemRequestOptions
        extends TransactionalBatchItemRequestOptionsBase {
    private String filterPredicate;

    /**
     * Gets the FilterPredicate associated with the request in the Azure Cosmos DB service.
     *
     * @return the FilterPredicate associated with the request.
     */
    @Beta(value = Beta.SinceVersion.V4_13_0, warningText = Beta.PREVIEW_SUBJECT_TO_CHANGE_WARNING)
    @Deprecated() //forRemoval = true, since = "4.19"
    public String getFilterPredicate() {
        return this.filterPredicate;
    }

    /**
     * Sets the FilterPredicate associated with the request in the Azure Cosmos DB service. for example: {@code setFilterPredicate("from c where c.taskNum = 3")}.
     *
     * @param filterPredicate the filterPredicate associated with the request.
     * @return the current request options
     */
    @Beta(value = Beta.SinceVersion.V4_13_0, warningText = Beta.PREVIEW_SUBJECT_TO_CHANGE_WARNING)
    @Deprecated() //forRemoval = true, since = "4.19"
    public TransactionalBatchPatchItemRequestOptions setFilterPredicate(String filterPredicate) {
        this.filterPredicate = filterPredicate;
        return this;
    }

    /**
     * Sets the If-Match (ETag) associated with the operation in TransactionalBatch.
     *
     * @param ifMatchETag the ifMatchETag associated with the request.
     * @return the current request options
     */
    @Beta(value = Beta.SinceVersion.V4_13_0, warningText = Beta.PREVIEW_SUBJECT_TO_CHANGE_WARNING)
    @Deprecated() //forRemoval = true, since = "4.19"
    public TransactionalBatchPatchItemRequestOptions setIfMatchETag(final String ifMatchETag) {
        super.setIfMatchETagCore(ifMatchETag);
        return this;
    }

    /**
     * Sets the If-None-Match (ETag) associated with the request in operation in TransactionalBatch.
     *
     * @param ifNoneMatchEtag the ifNoneMatchETag associated with the request.
     * @return the current request options
     */
    @Beta(value = Beta.SinceVersion.V4_13_0, warningText = Beta.PREVIEW_SUBJECT_TO_CHANGE_WARNING)
    @Deprecated() //forRemoval = true, since = "4.19"
    public TransactionalBatchPatchItemRequestOptions setIfNoneMatchETag(final String ifNoneMatchEtag) {
        super.setIfNoneMatchETagCore(ifNoneMatchEtag);
        return this;
    }

    RequestOptions toRequestOptions() {
        final RequestOptions requestOptions = super.toRequestOptions();
        requestOptions.setFilterPredicate(getFilterPredicate());
        return requestOptions;
    }
}
