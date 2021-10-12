// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.PipelinesImpl;
import com.azure.analytics.synapse.artifacts.models.ArtifactRenameRequest;
import com.azure.analytics.synapse.artifacts.models.CloudErrorAutoGeneratedException;
import com.azure.analytics.synapse.artifacts.models.CreateRunResponse;
import com.azure.analytics.synapse.artifacts.models.PipelineResource;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.Response;
import java.util.Map;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class, isAsync = true)
public final class PipelineAsyncClient {
    private final PipelinesImpl serviceClient;

    /**
     * Initializes an instance of Pipelines client.
     *
     * @param serviceClient the service client implementation.
     */
    PipelineAsyncClient(PipelinesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists pipelines.
     *
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of pipeline resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<PipelineResource> getPipelinesByWorkspace() {
        return this.serviceClient.getPipelinesByWorkspaceAsync();
    }

    /**
     * Creates or updates a pipeline.
     *
     * @param pipelineName The pipeline name.
     * @param pipeline Pipeline resource definition.
     * @param ifMatch ETag of the pipeline entity. Should only be specified for update, for which it should match
     *     existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pipeline resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PipelineResource>> createOrUpdatePipelineWithResponse(
            String pipelineName, PipelineResource pipeline, String ifMatch) {
        return this.serviceClient.createOrUpdatePipelineWithResponseAsync(pipelineName, pipeline, ifMatch);
    }

    /**
     * Creates or updates a pipeline.
     *
     * @param pipelineName The pipeline name.
     * @param pipeline Pipeline resource definition.
     * @param ifMatch ETag of the pipeline entity. Should only be specified for update, for which it should match
     *     existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pipeline resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PipelineResource> createOrUpdatePipeline(
            String pipelineName, PipelineResource pipeline, String ifMatch) {
        return this.serviceClient.createOrUpdatePipelineAsync(pipelineName, pipeline, ifMatch);
    }

    /**
     * Creates or updates a pipeline.
     *
     * @param pipelineName The pipeline name.
     * @param pipeline Pipeline resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pipeline resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PipelineResource> createOrUpdatePipeline(String pipelineName, PipelineResource pipeline) {
        return this.serviceClient.createOrUpdatePipelineAsync(pipelineName, pipeline);
    }

    /**
     * Gets a pipeline.
     *
     * @param pipelineName The pipeline name.
     * @param ifNoneMatch ETag of the pipeline entity. Should only be specified for get. If the ETag matches the
     *     existing entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PipelineResource>> getPipelineWithResponse(String pipelineName, String ifNoneMatch) {
        return this.serviceClient.getPipelineWithResponseAsync(pipelineName, ifNoneMatch);
    }

    /**
     * Gets a pipeline.
     *
     * @param pipelineName The pipeline name.
     * @param ifNoneMatch ETag of the pipeline entity. Should only be specified for get. If the ETag matches the
     *     existing entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PipelineResource> getPipeline(String pipelineName, String ifNoneMatch) {
        return this.serviceClient.getPipelineAsync(pipelineName, ifNoneMatch);
    }

    /**
     * Gets a pipeline.
     *
     * @param pipelineName The pipeline name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PipelineResource> getPipeline(String pipelineName) {
        return this.serviceClient.getPipelineAsync(pipelineName);
    }

    /**
     * Deletes a pipeline.
     *
     * @param pipelineName The pipeline name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deletePipelineWithResponse(String pipelineName) {
        return this.serviceClient.deletePipelineWithResponseAsync(pipelineName);
    }

    /**
     * Deletes a pipeline.
     *
     * @param pipelineName The pipeline name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deletePipeline(String pipelineName) {
        return this.serviceClient.deletePipelineAsync(pipelineName);
    }

    /**
     * Renames a pipeline.
     *
     * @param pipelineName The pipeline name.
     * @param request proposed new name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> renamePipelineWithResponse(String pipelineName, ArtifactRenameRequest request) {
        return this.serviceClient.renamePipelineWithResponseAsync(pipelineName, request);
    }

    /**
     * Renames a pipeline.
     *
     * @param pipelineName The pipeline name.
     * @param request proposed new name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> renamePipeline(String pipelineName, ArtifactRenameRequest request) {
        return this.serviceClient.renamePipelineAsync(pipelineName, request);
    }

    /**
     * Creates a run of a pipeline.
     *
     * @param pipelineName The pipeline name.
     * @param referencePipelineRunId The pipeline run identifier. If run ID is specified the parameters of the specified
     *     run will be used to create a new run.
     * @param isRecovery Recovery mode flag. If recovery mode is set to true, the specified referenced pipeline run and
     *     the new run will be grouped under the same groupId.
     * @param startActivityName In recovery mode, the rerun will start from this activity. If not specified, all
     *     activities will run.
     * @param parameters Parameters of the pipeline run. These parameters will be used only if the runId is not
     *     specified.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body with a run identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CreateRunResponse>> createPipelineRunWithResponse(
            String pipelineName,
            String referencePipelineRunId,
            Boolean isRecovery,
            String startActivityName,
            Map<String, Object> parameters) {
        return this.serviceClient.createPipelineRunWithResponseAsync(
                pipelineName, referencePipelineRunId, isRecovery, startActivityName, parameters);
    }

    /**
     * Creates a run of a pipeline.
     *
     * @param pipelineName The pipeline name.
     * @param referencePipelineRunId The pipeline run identifier. If run ID is specified the parameters of the specified
     *     run will be used to create a new run.
     * @param isRecovery Recovery mode flag. If recovery mode is set to true, the specified referenced pipeline run and
     *     the new run will be grouped under the same groupId.
     * @param startActivityName In recovery mode, the rerun will start from this activity. If not specified, all
     *     activities will run.
     * @param parameters Parameters of the pipeline run. These parameters will be used only if the runId is not
     *     specified.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body with a run identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CreateRunResponse> createPipelineRun(
            String pipelineName,
            String referencePipelineRunId,
            Boolean isRecovery,
            String startActivityName,
            Map<String, Object> parameters) {
        return this.serviceClient.createPipelineRunAsync(
                pipelineName, referencePipelineRunId, isRecovery, startActivityName, parameters);
    }

    /**
     * Creates a run of a pipeline.
     *
     * @param pipelineName The pipeline name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body with a run identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CreateRunResponse> createPipelineRun(String pipelineName) {
        return this.serviceClient.createPipelineRunAsync(pipelineName);
    }
}
