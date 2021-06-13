package com.ivan.polovyi.abstractfactory.aws;

import com.ivan.polovyi.abstractfactory.Instance;
import com.ivan.polovyi.abstractfactory.ResourceFactory;
import com.ivan.polovyi.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

    @Override public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }
}
