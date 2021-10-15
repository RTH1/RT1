// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.LibrariesImpl;
import com.azure.analytics.synapse.artifacts.models.CloudErrorAutoGeneratedException;
import com.azure.analytics.synapse.artifacts.models.LibraryResource;
import com.azure.analytics.synapse.artifacts.models.LibraryResourceInfo;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.Response;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class, isAsync = true)
public final class LibraryAsyncClient {
    private final LibrariesImpl serviceClient;

    /**
     * Initializes an instance of Libraries client.
     *
     * @param serviceClient the service client implementation.
     */
    LibraryAsyncClient(LibrariesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists Library.
     *
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Library resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<LibraryResource> list() {
        return this.serviceClient.listAsync();
    }

    /**
     * Flush Library.
     *
     * @param libraryName file name to upload. Minimum length of the filename should be 1 excluding the extension
     *     length.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LibraryResourceInfo>> flushWithResponse(String libraryName) {
        return this.serviceClient.flushWithResponseAsync(libraryName);
    }

    /**
     * Flush Library.
     *
     * @param libraryName file name to upload. Minimum length of the filename should be 1 excluding the extension
     *     length.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LibraryResourceInfo> flush(String libraryName) {
        return this.serviceClient.flushAsync(libraryName);
    }

    /**
     * Get Operation result for Library.
     *
     * @param operationId operation id for which status is requested.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation result for Library.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LibraryResource>> getOperationResultWithResponse(String operationId) {
        return this.serviceClient.getOperationResultWithResponseAsync(operationId);
    }

    /**
     * Get Operation result for Library.
     *
     * @param operationId operation id for which status is requested.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation result for Library.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LibraryResource> getOperationResult(String operationId) {
        return this.serviceClient.getOperationResultAsync(operationId);
    }

    /**
     * Delete Library.
     *
     * @param libraryName file name to upload. Minimum length of the filename should be 1 excluding the extension
     *     length.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LibraryResourceInfo>> deleteWithResponse(String libraryName) {
        return this.serviceClient.deleteWithResponseAsync(libraryName);
    }

    /**
     * Delete Library.
     *
     * @param libraryName file name to upload. Minimum length of the filename should be 1 excluding the extension
     *     length.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LibraryResourceInfo> delete(String libraryName) {
        return this.serviceClient.deleteAsync(libraryName);
    }

    /**
     * Get Library.
     *
     * @param libraryName file name to upload. Minimum length of the filename should be 1 excluding the extension
     *     length.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return library.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LibraryResource>> getWithResponse(String libraryName) {
        return this.serviceClient.getWithResponseAsync(libraryName);
    }

    /**
     * Get Library.
     *
     * @param libraryName file name to upload. Minimum length of the filename should be 1 excluding the extension
     *     length.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return library.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LibraryResource> get(String libraryName) {
        return this.serviceClient.getAsync(libraryName);
    }

    /**
     * Creates a library with the library name.
     *
     * @param libraryName file name to upload. Minimum length of the filename should be 1 excluding the extension
     *     length.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LibraryResourceInfo>> createWithResponse(String libraryName) {
        return this.serviceClient.createWithResponseAsync(libraryName);
    }

    /**
     * Creates a library with the library name.
     *
     * @param libraryName file name to upload. Minimum length of the filename should be 1 excluding the extension
     *     length.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LibraryResourceInfo> create(String libraryName) {
        return this.serviceClient.createAsync(libraryName);
    }

    /**
     * Append the content to the library resource created using the create operation. The maximum content size is 4MiB.
     * Content larger than 4MiB must be appended in 4MiB chunks.
     *
     * @param libraryName file name to upload. Minimum length of the filename should be 1 excluding the extension
     *     length.
     * @param content Library file chunk.
     * @param contentLength The contentLength parameter.
     * @param blobConditionAppendPosition Set this header to a byte offset at which the block is expected to be
     *     appended. The request succeeds only if the current offset matches this value. Otherwise, the request fails
     *     with the AppendPositionConditionNotMet error (HTTP status code 412 – Precondition Failed).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> appendWithResponse(
            String libraryName, Flux<ByteBuffer> content, long contentLength, Long blobConditionAppendPosition) {
        return this.serviceClient.appendWithResponseAsync(
                libraryName, content, contentLength, blobConditionAppendPosition);
    }

    /**
     * Append the content to the library resource created using the create operation. The maximum content size is 4MiB.
     * Content larger than 4MiB must be appended in 4MiB chunks.
     *
     * @param libraryName file name to upload. Minimum length of the filename should be 1 excluding the extension
     *     length.
     * @param content Library file chunk.
     * @param contentLength The contentLength parameter.
     * @param blobConditionAppendPosition Set this header to a byte offset at which the block is expected to be
     *     appended. The request succeeds only if the current offset matches this value. Otherwise, the request fails
     *     with the AppendPositionConditionNotMet error (HTTP status code 412 – Precondition Failed).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> append(
            String libraryName, Flux<ByteBuffer> content, long contentLength, Long blobConditionAppendPosition) {
        return this.serviceClient.appendAsync(libraryName, content, contentLength, blobConditionAppendPosition);
    }

    /**
     * Append the content to the library resource created using the create operation. The maximum content size is 4MiB.
     * Content larger than 4MiB must be appended in 4MiB chunks.
     *
     * @param libraryName file name to upload. Minimum length of the filename should be 1 excluding the extension
     *     length.
     * @param content Library file chunk.
     * @param contentLength The contentLength parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> append(String libraryName, Flux<ByteBuffer> content, long contentLength) {
        return this.serviceClient.appendAsync(libraryName, content, contentLength);
    }
}
