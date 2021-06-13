package com.ivan.polovyi.abstractfactory;

import com.ivan.polovyi.abstractfactory.aws.AwsResourceFactory;
import com.ivan.polovyi.abstractfactory.gcp.GoogleResourceFactory;

public class Client {
    private ResourceFactory resourceFactory;

    public Client(ResourceFactory resourceFactory) {
        this.resourceFactory = resourceFactory;
    }

    public Instance createServer(Instance.Capacity capacity, int storageMib) {
        Instance instance = resourceFactory.createInstance(capacity);
        Storage storage = resourceFactory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
        Client client = new Client(new AwsResourceFactory());
        Instance awsServer = client.createServer(Instance.Capacity.large, 100);
        awsServer.start();
        awsServer.stop();

        Client client2 = new Client(new GoogleResourceFactory());
        Instance googleServer = client2.createServer(Instance.Capacity.large, 100);
        googleServer.start();
        googleServer.stop();

    }

}
