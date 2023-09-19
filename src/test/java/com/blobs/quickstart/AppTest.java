package com.blobs.quickstart;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.blobs.quickstart.metodos.AzureMetodos;


/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    AzureMetodos azureMetodos = new AzureMetodos();
    String connectStr = "DefaultEndpointsProtocol=https;AccountName=storageubuntu2;AccountKey=hVSrerDdU3hA7NzXvkS4UK4KVDKXrY2rV+y46qednkNSGVkw2tuL2WGd9lXRwjPpWPcu9cn//Pbs+AStDCmV3A==;EndpointSuffix=core.windows.net";

    
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void pruebaConexion() {
      BlobServiceClient blobServiceClient = azureMetodos.getBlobServiceClient(connectStr);
    BlobContainerClient blobContainerClient = azureMetodos.getBlobContainerClient(blobServiceClient, "users");
    System.out.println(blobContainerClient.exists());
    }
}
