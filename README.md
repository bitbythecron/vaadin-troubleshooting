# vaadin-troubleshooting

## Build & Run Locally
```
./gradlew clean build && java -Dspring.config=. -Ddb.home=./vt_db -jar build/libs/vaadin-troubleshooting.jar
```

## Current Issues
### 1. Exception thrown at startup (Can't instantiate JSR-356)
1. Build and run per the instructions above
2. Open a browser to `http://localhost:9200`
3. Go to the terminal and you will see:

```
21:23:18.655 http-nio-9200-exec-2 [ERROR] org.atmosphere.cpr.DefaultAsyncSupportResolver - Real error: Unable to configure jsr356 at that stage. ServerContainer is null
java.lang.IllegalStateException: Unable to configure jsr356 at that stage. ServerContainer is null
	at org.atmosphere.container.JSR356AsyncSupport.<init>(JSR356AsyncSupport.java:53)
	at org.atmosphere.container.JSR356AsyncSupport.<init>(JSR356AsyncSupport.java:42)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
	at org.atmosphere.cpr.DefaultAsyncSupportResolver.newCometSupport(DefaultAsyncSupportResolver.java:237)
	at org.atmosphere.cpr.DefaultAsyncSupportResolver.resolveWebSocket(DefaultAsyncSupportResolver.java:308)
	at org.atmosphere.cpr.DefaultAsyncSupportResolver.resolve(DefaultAsyncSupportResolver.java:294)
	at org.atmosphere.cpr.AtmosphereFramework.autoDetectContainer(AtmosphereFramework.java:2092)
	at org.atmosphere.cpr.AtmosphereFramework.init(AtmosphereFramework.java:914)
	at org.atmosphere.cpr.AtmosphereFramework.init(AtmosphereFramework.java:838)
	at com.vaadin.flow.server.communication.PushRequestHandler.initAtmosphere(PushRequestHandler.java:218)
	at com.vaadin.flow.server.communication.PushRequestHandler.<init>(PushRequestHandler.java:89)
	at com.vaadin.flow.server.VaadinServletService.createRequestHandlers(VaadinServletService.java:86)
	at com.vaadin.flow.server.VaadinService.init(VaadinService.java:255)
	at com.vaadin.flow.spring.SpringServlet.createServletService(SpringServlet.java:90)
	at com.vaadin.flow.server.VaadinServlet.createServletService(VaadinServlet.java:182)
	at com.vaadin.flow.server.VaadinServlet.init(VaadinServlet.java:72)
	at org.apache.catalina.core.StandardWrapper.initServlet(StandardWrapper.java:1124)
	at org.apache.catalina.core.StandardWrapper.allocate(StandardWrapper.java:777)
	at org.apache.catalina.core.ApplicationDispatcher.invoke(ApplicationDispatcher.java:688)
	at org.apache.catalina.core.ApplicationDispatcher.processRequest(ApplicationDispatcher.java:459)
```

### 2. Cannot navigate to root context path
1. Build and run per the instructions above
2. Open a browser to `http://localhost:9200`

```
Could not navigate to ''
Reason: Couldn't find route for ''

Available routes:
This detailed message is only shown when running in development mode.
```

Here is a screenshot:

![cannot_nav_root](pic.png)