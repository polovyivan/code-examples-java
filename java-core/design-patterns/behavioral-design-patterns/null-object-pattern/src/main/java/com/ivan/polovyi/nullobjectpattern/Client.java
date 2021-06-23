package com.ivan.polovyi.nullobjectpattern;

public class Client {

    public static void main(String[] args) {
        ComplexService service = new ComplexService("Simple report", new StorageService());
        service.generateReport();

        ComplexService serviceWithNull = new ComplexService("Simple report", new NullStorageService());
        serviceWithNull.generateReport();

    }

}
