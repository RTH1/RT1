// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.models;

import com.azure.core.annotation.Fluent;

/** Defines values for RecordingFormatType. */
@Fluent
public final class StartRecordingOptions {

    private RecordingContent recordingContent = null;
    private RecordingChannel recordingChannel = null; 
    private RecordingFormat recordingFormat = null;

    /**
     * Get the recordingContent property: Optional, audioVideo by default.
     *
     * @return the recordingContent value.
     */
    public RecordingContent getRecordingContent() {
        return this.recordingContent;
    }

    /**
     * Set the recordingContent property: Optional, audioVideo by default.
     *
     * @param recordingContent the recordingContent value to set.
     * @return the StartCallRecordingRequest object itself.
     */
    public StartRecordingOptions setRecordingContent(RecordingContent recordingContent) {
        this.recordingContent = recordingContent;
        return this;
    }

    /**
     * Get the recordingChannel property: Optional, mixed by default.
     *
     * @return the recordingChannel value.
     */
    public RecordingChannel getRecordingChannel() {
        return this.recordingChannel;
    }

    /**
     * Set the recordingChannel property: Optional, mixed by default.
     *
     * @param recordingChannel the recordingChannel value to set.
     * @return the StartCallRecordingRequest object itself.
     */
    public StartRecordingOptions setRecordingChannel(RecordingChannel recordingChannel) {
        this.recordingChannel = recordingChannel;
        return this;
    }

    /**
     * Get the recordingFormat property: Optional, mp4 by default.
     *
     * @return the recordingFormat value.
     */
    public RecordingFormat getRecordingFormat() {
        return this.recordingFormat;
    }

    /**
     * Set the recordingFormat property: Optional, mp4 by default.
     *
     * @param recordingFormat the recordingFormat value to set.
     * @return the StartCallRecordingRequest object itself.
     */
    public StartRecordingOptions setRecordingFormat(RecordingFormat recordingFormat) {
        this.recordingFormat = recordingFormat;
        return this;
    }

}
