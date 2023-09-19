package com.blobs.quickstart.metodos;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;

public class AzureMetodos {

    public AzureMetodos() {
    }

    
    public BlobServiceClient getBlobServiceClient( String stringConnection){
         BlobServiceClient blobServiceClient = new BlobServiceClientBuilder()
                .connectionString(stringConnection)
                .buildClient();

        
        
        return blobServiceClient;
    }

    public BlobContainerClient getBlobContainerClient (BlobServiceClient blobServiceClient, String containerName){
        BlobContainerClient blobContainerClient = blobServiceClient.getBlobContainerClient(containerName);
        return blobContainerClient;
    }


    public BlobClient getBlobClient(BlobContainerClient blobContainerClient, String fileName){
        BlobClient blobClient = blobContainerClient.getBlobClient(fileName);
        return blobClient;
    }
    
    public void sendFileToAzure(String localPath, BlobClient blobClient){
        blobClient.uploadFromFile(localPath);
    }



    
}
