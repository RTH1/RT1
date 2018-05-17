/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator;

import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.AddImageOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.AddImageUrlInputOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.AddImageFileInputOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.APIErrorException;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.BodyModelModel;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.Image;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.ImageIds;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ListManagementImages.
 */
public interface ListManagementImages {
    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param addImageOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Image object if successful.
     */
    Image addImage(String listId, AddImageOptionalParameter addImageOptionalParameter);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param addImageOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Image object
     */
    Observable<Image> addImageAsync(String listId, AddImageOptionalParameter addImageOptionalParameter);


    /**
     * Deletes all images from the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String deleteAllImages(String listId);

    /**
     * Deletes all images from the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> deleteAllImagesAsync(String listId);



    /**
     * Gets all image Ids from the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ImageIds object if successful.
     */
    ImageIds getAllImageIds(String listId);

    /**
     * Gets all image Ids from the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImageIds object
     */
    Observable<ImageIds> getAllImageIdsAsync(String listId);



    /**
     * Deletes an image from the list with list Id and image Id passed.
     *
     * @param listId List Id of the image list.
     * @param imageId Id of the image.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String deleteImage(String listId, String imageId);

    /**
     * Deletes an image from the list with list Id and image Id passed.
     *
     * @param listId List Id of the image list.
     * @param imageId Id of the image.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> deleteImageAsync(String listId, String imageId);


    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @param addImageUrlInputOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Image object if successful.
     */
    Image addImageUrlInput(String listId, String contentType, BodyModelModel imageUrl, AddImageUrlInputOptionalParameter addImageUrlInputOptionalParameter);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @param addImageUrlInputOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Image object
     */
    Observable<Image> addImageUrlInputAsync(String listId, String contentType, BodyModelModel imageUrl, AddImageUrlInputOptionalParameter addImageUrlInputOptionalParameter);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param imageStream The image file.
     * @param addImageFileInputOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Image object if successful.
     */
    Image addImageFileInput(String listId, byte[] imageStream, AddImageFileInputOptionalParameter addImageFileInputOptionalParameter);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param imageStream The image file.
     * @param addImageFileInputOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Image object
     */
    Observable<Image> addImageFileInputAsync(String listId, byte[] imageStream, AddImageFileInputOptionalParameter addImageFileInputOptionalParameter);

}
