package com.test;

import com.test.client.MqClient;

public class ProduceClient {
    public static void main(String[] args) throws Exception {
        MqClient client = new MqClient();
        client.produce("SEND:Hello World1");
    }

}
