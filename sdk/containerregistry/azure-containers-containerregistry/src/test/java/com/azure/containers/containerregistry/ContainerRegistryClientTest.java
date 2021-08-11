// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry;

import com.azure.core.http.HttpClient;
import com.azure.core.http.netty.NettyAsyncHttpClientBuilder;
import com.azure.core.http.rest.Response;
import com.azure.core.test.TestMode;
import com.azure.core.util.Context;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.time.Duration;
import java.util.Collections;

import static com.azure.containers.containerregistry.TestUtils.HELLO_WORLD_REPOSITORY_NAME;
import static com.azure.containers.containerregistry.TestUtils.HELLO_WORLD_SEATTLE_REPOSITORY_NAME;
import static com.azure.containers.containerregistry.TestUtils.HTTP_STATUS_CODE_202;
import static com.azure.containers.containerregistry.TestUtils.SLEEP_TIME_IN_MILLISECONDS;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@Execution(ExecutionMode.SAME_THREAD)
public class ContainerRegistryClientTest extends ContainerRegistryClientsTestBase {
    private ContainerRegistryAsyncClient registryAsyncClient;
    private ContainerRegistryClient registryClient;
    private ContainerRepositoryAsync asyncClient;
    private ContainerRepository client;
    private HttpClient httpClient;
    private final String repositoryName = HELLO_WORLD_SEATTLE_REPOSITORY_NAME;

    private ContainerRegistryClient getContainerRegistryClient(HttpClient client) {
        return getContainerRegistryBuilder(client).buildClient();
    }

    private ContainerRegistryAsyncClient getContainerRegistryAsyncClient(HttpClient client) {
        return getContainerRegistryBuilder(client).buildAsyncClient();
    }

    @BeforeEach
    void beforeEach() {
        TestUtils.importImage(getTestMode(), repositoryName, Collections.singletonList("latest"));
        if (getTestMode() == TestMode.PLAYBACK) {
            httpClient = interceptorManager.getPlaybackClient();
        } else {
            httpClient = new NettyAsyncHttpClientBuilder().build();
        }

        registryClient = getContainerRegistryClient(httpClient);
        registryAsyncClient = getContainerRegistryAsyncClient(httpClient);
        asyncClient = registryAsyncClient.getRepository(repositoryName);
        client = registryClient.getRepository(repositoryName);
    }


    @Test
    public void deleteRepositoryByRegistryWithResponseAsyncClient() {
        Mono<Boolean> deleteRepositoryTest = registryAsyncClient.deleteRepositoryWithResponse(repositoryName)
            .delaySubscription(Duration.ofMillis(SLEEP_TIME_IN_MILLISECONDS))
            .then(registryAsyncClient.getRepository(repositoryName).getProperties())
            .flatMap(res -> Mono.just(false))
            .onErrorResume(res -> registryAsyncClient.getRepository(repositoryName)
                .delete()
                .then(Mono.just(true))
                .onErrorResume(err -> Mono.just(false)));

        StepVerifier.create(deleteRepositoryTest)
            .assertNext(Assertions::assertTrue)
            .verifyComplete();
    }

    @Test
    public void deleteRepositoryByRegistryAsyncClient() {
        Mono<Boolean> deleteRepositoryTest = registryAsyncClient.deleteRepository(repositoryName)
            .delaySubscription(Duration.ofMillis(SLEEP_TIME_IN_MILLISECONDS))
            .then(registryAsyncClient.getRepository(repositoryName).getProperties())
            .flatMap(res -> Mono.just(false))
            .onErrorResume(res -> {
                System.out.println("First time:" + res.getStackTrace());
                return registryAsyncClient.getRepository(repositoryName)
                    .delete()
                    .delaySubscription(Duration.ofMillis(SLEEP_TIME_IN_MILLISECONDS))
                    .then(Mono.just(true))
                    .onErrorResume(err -> {
                        System.out.println("Second Time:" + err.getStackTrace());
                        return Mono.just(false);
                    });
            });

        StepVerifier.create(deleteRepositoryTest)
            .assertNext(Assertions::assertTrue)
            .verifyComplete();
    }

    @Test
    public void deleteRepositoryWithResponseAsyncClient() {
        Mono<Boolean> deleteRepositoryTest = asyncClient.deleteWithResponse()
            .delaySubscription(Duration.ofMillis(SLEEP_TIME_IN_MILLISECONDS))
            .then(registryAsyncClient.getRepository(repositoryName).getProperties())
            .flatMap(res -> Mono.just(false))
            .onErrorResume(res -> registryAsyncClient.getRepository(repositoryName)
                .delete()
                .then(Mono.just(true))
                .onErrorResume(err -> Mono.just(false)));

        StepVerifier.create(deleteRepositoryTest)
            .assertNext(Assertions::assertTrue)
            .verifyComplete();
    }

    @Test
    public void deleteRepositoryAsyncClient() {
        Mono<Boolean> deleteRepositoryTest = asyncClient.delete()
            .delaySubscription(Duration.ofMillis(SLEEP_TIME_IN_MILLISECONDS))
            .then(registryAsyncClient.getRepository(repositoryName).getProperties())
            .flatMap(res -> Mono.just(false))
            .onErrorResume(res -> registryAsyncClient.getRepository(repositoryName)
                .delete()
                .then(Mono.just(true))
                .onErrorResume(err -> Mono.just(false)));

        StepVerifier.create(deleteRepositoryTest)
            .assertNext(Assertions::assertTrue)
            .verifyComplete();
    }

    @Test
    public void deleteRepositoryWithResponseByRegistryClient() {
        Response<Void> response = registryClient.deleteRepositoryWithResponse(HELLO_WORLD_SEATTLE_REPOSITORY_NAME, Context.NONE);
        assertEquals(HTTP_STATUS_CODE_202, response.getStatusCode());
    }


    @Test
    public void deleteRepositoryByRegistryClient() {
        // This should not throw.
        registryClient.deleteRepository(HELLO_WORLD_SEATTLE_REPOSITORY_NAME);
    }

    @Test
    public void deleteRepositoryWithResponseClient() {
        client.deleteWithResponse(Context.NONE);
    }

    @Test
    public void deleteRepositoryClient() {
        client.delete();
    }

    @Test
    public void getRepositoryTestThrows() {
        assertThrows(NullPointerException.class, () -> registryClient.getRepository(null));
        assertThrows(IllegalArgumentException.class, () -> registryClient.getRepository(""));
        assertThrows(NullPointerException.class, () -> registryAsyncClient.getRepository(null));
        assertThrows(IllegalArgumentException.class, () -> registryAsyncClient.getRepository(""));
    }

    @Test
    public void getArtifactTestThrows() {
        assertThrows(NullPointerException.class, () -> registryClient.getArtifact(HELLO_WORLD_REPOSITORY_NAME, null));
        assertThrows(IllegalArgumentException.class, () -> registryClient.getArtifact(HELLO_WORLD_REPOSITORY_NAME, ""));
        assertThrows(NullPointerException.class, () -> registryClient.getArtifact(null, "digest"));
        assertThrows(IllegalArgumentException.class, () -> registryClient.getArtifact("", "digest"));
        assertThrows(NullPointerException.class, () -> registryAsyncClient.getArtifact(HELLO_WORLD_REPOSITORY_NAME, null));
        assertThrows(IllegalArgumentException.class, () -> registryAsyncClient.getArtifact(HELLO_WORLD_REPOSITORY_NAME, ""));
        assertThrows(NullPointerException.class, () -> registryAsyncClient.getArtifact(null, "digest"));
        assertThrows(IllegalArgumentException.class, () -> registryAsyncClient.getArtifact("", "digest"));
    }
}
