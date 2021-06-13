package com.ivan.polovyi.abstractfactory.gcp;

import com.ivan.polovyi.abstractfactory.Instance;
import com.ivan.polovyi.abstractfactory.ResourceFactory;
import com.ivan.polovyi.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

    @Override public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }
}
