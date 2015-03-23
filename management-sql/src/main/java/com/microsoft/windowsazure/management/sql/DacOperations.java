/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.sql;

import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.sql.models.DacExportParameters;
import com.microsoft.windowsazure.management.sql.models.DacGetStatusParameters;
import com.microsoft.windowsazure.management.sql.models.DacGetStatusResponse;
import com.microsoft.windowsazure.management.sql.models.DacImportExportResponse;
import com.microsoft.windowsazure.management.sql.models.DacImportParameters;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.Future;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

/**
* Includes operations for importing and exporting Azure SQL Databases into and
* out of Azure blob storage.
*/
public interface DacOperations {
    /**
    * Exports an Azure SQL Database into a DACPAC file in Azure Blob Storage.
    *
    * @param serverName Required. The name of the Azure SQL Database Server in
    * which the database to export resides.
    * @param parameters Optional. The parameters needed to initiate the export
    * request.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Represents the response that the service returns once an import
    * or export operation has been initiated.
    */
    DacImportExportResponse exportDatabase(String serverName, DacExportParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException;
    
    /**
    * Exports an Azure SQL Database into a DACPAC file in Azure Blob Storage.
    *
    * @param serverName Required. The name of the Azure SQL Database Server in
    * which the database to export resides.
    * @param parameters Optional. The parameters needed to initiate the export
    * request.
    * @return Represents the response that the service returns once an import
    * or export operation has been initiated.
    */
    Future<DacImportExportResponse> exportDatabaseAsync(String serverName, DacExportParameters parameters);
    
    /**
    * Gets the status of the import or export operation in the specified server
    * with the corresponding request ID.  The request ID is provided in the
    * responses of the import or export operation.
    *
    * @param serverName Required. The name of the server in which the import or
    * export operation is taking place.
    * @param fullyQualifiedServerName Required. The fully qualified domain name
    * of the Azure SQL Database Server where the operation is taking place.
    * Example: a9s7f7s9d3.database.windows.net
    * @param username Required. The administrator username for the Azure SQL
    * Database Server.
    * @param password Required. The administrator password for the Azure SQL
    * Database Server.
    * @param requestId Required. The request ID of the operation being queried.
    * The request ID is obtained from the responses of the import and export
    * operations.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return Represents a list of import or export status values returned from
    * GetStatus.
    */
    DacGetStatusResponse getStatus(String serverName, String fullyQualifiedServerName, String username, String password, String requestId) throws IOException, ServiceException, ParserConfigurationException, SAXException, URISyntaxException;
    
    /**
    * Gets the status of the import or export operation in the specified server
    * with the corresponding request ID.  The request ID is provided in the
    * responses of the import or export operation.
    *
    * @param serverName Required. The name of the server in which the import or
    * export operation is taking place.
    * @param fullyQualifiedServerName Required. The fully qualified domain name
    * of the Azure SQL Database Server where the operation is taking place.
    * Example: a9s7f7s9d3.database.windows.net
    * @param username Required. The administrator username for the Azure SQL
    * Database Server.
    * @param password Required. The administrator password for the Azure SQL
    * Database Server.
    * @param requestId Required. The request ID of the operation being queried.
    * The request ID is obtained from the responses of the import and export
    * operations.
    * @return Represents a list of import or export status values returned from
    * GetStatus.
    */
    Future<DacGetStatusResponse> getStatusAsync(String serverName, String fullyQualifiedServerName, String username, String password, String requestId);
    
    /**
    * Gets the status of the import or export operation in the specified server
    * with the corresponding request ID.  The request ID is provided in the
    * responses of the import or export operation.
    *
    * @param serverName Required. The name of the server in which the import or
    * export operation is taking place.
    * @param parameters Required. The parameters needed to get the status of an
    * import or export operation.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return Represents a list of import or export status values returned from
    * GetStatus.
    */
    DacGetStatusResponse getStatusPost(String serverName, DacGetStatusParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException, URISyntaxException;
    
    /**
    * Gets the status of the import or export operation in the specified server
    * with the corresponding request ID.  The request ID is provided in the
    * responses of the import or export operation.
    *
    * @param serverName Required. The name of the server in which the import or
    * export operation is taking place.
    * @param parameters Required. The parameters needed to get the status of an
    * import or export operation.
    * @return Represents a list of import or export status values returned from
    * GetStatus.
    */
    Future<DacGetStatusResponse> getStatusPostAsync(String serverName, DacGetStatusParameters parameters);
    
    /**
    * Initiates an Import of a DACPAC file from Azure Blob Storage into a Azure
    * SQL Database.
    *
    * @param serverName Required. The name of the Azure SQL Database Server
    * into which the database is being imported.
    * @param parameters Optional. The parameters needed to initiated the Import
    * request.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Represents the response that the service returns once an import
    * or export operation has been initiated.
    */
    DacImportExportResponse importMethod(String serverName, DacImportParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException;
    
    /**
    * Initiates an Import of a DACPAC file from Azure Blob Storage into a Azure
    * SQL Database.
    *
    * @param serverName Required. The name of the Azure SQL Database Server
    * into which the database is being imported.
    * @param parameters Optional. The parameters needed to initiated the Import
    * request.
    * @return Represents the response that the service returns once an import
    * or export operation has been initiated.
    */
    Future<DacImportExportResponse> importMethodAsync(String serverName, DacImportParameters parameters);
}
