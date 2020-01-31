package com.company;

public class AdapterPattern {
}

// Step 1: Design the target interface
public interface WebRequester {
    public int request(Object);
}
// Step 2: Implement the target interface with the adapter class
public class WebAdapter implements WebRequester {
    private WebService service;

    public void connect(WebService currentService) {
        this.service = currentService;
    }

    public int request(Object request) {
        Json result = this.toJson(request);
        Json response = service.request(result);
        if(response != null) {
            return 200; // OK status code
        }
        return 500; // Service error status code
    }
}

// Step 3: Send the request from the client to the adapter
// using the target interface
public class WebClient {
    private WebRequester webRequester;

    public WebClient(WebRequester webRequester) {
        this.webRequester = webRequester;
    }

    private Object makeObject() {...} // Make an object

    public void doWork() {
        Object object = makeObject();
        int status = webRequester.request(object);

        if(status == 200) {
            System.out.println("OK");
        } else {
            System.out.println("Not OK");
        }
    }
}

public class Program {
    public static void main(String[] args) {
        String webHost = "Host: https://google.com\n\r";
        WebService service = new WebService(webHost);
        WebAdapter adapter = new WebAdapter();
        adapter.connect(service);
        WebClient client = new WebClient(adapter);
        client.doWork();
    }
}

/*
- Remember that an adapter is meant to:
+ Wrap the adaptee and expose a target interface to the client
+ Indirectly change the adaptee's interface into one that the client is expecting
by implementing a target interface
+ Indirectly translate the client's request into one that the adaptee is expecting
+ Reuse an existing adaptee with an incompatible interface.
 */














































